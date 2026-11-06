package elucent.rootsclassic;

import com.mojang.logging.LogUtils;
import elucent.rootsclassic.component.ComponentRegistry;
import elucent.rootsclassic.config.RootsConfig;
import elucent.rootsclassic.event.ComponentSpellsEvent;
import elucent.rootsclassic.recipe.RootsReloadManager;
import elucent.rootsclassic.registry.ParticleRegistry;
import elucent.rootsclassic.registry.RootsEntities;
import elucent.rootsclassic.registry.RootsRecipes;
import elucent.rootsclassic.registry.RootsRegistry;
import elucent.rootsclassic.ritual.RitualRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.api.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

public class Roots implements ModInitializer {
	public static final CreativeModeTab tab = FabricItemGroupBuilder.build(new ResourceLocation(Const.MODID, Const.MODID), () -> new ItemStack(RootsRegistry.SPELL_POWDER));
	public static final Logger LOGGER = LogUtils.getLogger();

	@Override
	public void onInitialize() {
		ModLoadingContext.registerConfig(Const.MODID, ModConfig.Type.CLIENT, RootsConfig.clientSpec);
		ModLoadingContext.registerConfig(Const.MODID, ModConfig.Type.COMMON, RootsConfig.commonSpec);
		RootsConfig.registerEvents();
		RootsRegistry.register();
		RootsEntities.register();
		RitualRegistry.register();
		ComponentRegistry.register();
		RootsRecipes.register();
		injectLootTable();
		ParticleRegistry.register();
		RootsReloadManager.onAddReloadListeners();
		ComponentSpellsEvent.registerEvents();
		RootsEntities.registerEntityAttributes();
		setup();

		ItemStorage.SIDED.registerForBlockEntity((entity, direction) -> entity.inventoryWrapper, RootsRegistry.ALTAR_TILE);
		ItemStorage.SIDED.registerForBlockEntity((entity, direction) -> entity.inventoryWrapper, RootsRegistry.MORTAR_TILE);
	}

	private void setup() {
		RootsRegistry.registerStats();
		RootsEntities.registerSpawnPlacement();
	}

	private void injectLootTable() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if (source.isBuiltin() && Blocks.TALL_GRASS.getLootTable().equals(id)) {
				LootPool.Builder builder = LootPool.lootPool()
						.when(LootItemRandomChanceCondition.randomChance(RootsConfig.COMMON.oldRootDropChance.get()))
						.add(LootItem.lootTableItem(Items.STICK));

				tableBuilder.withPool(builder);
			}
		});
	}
}
