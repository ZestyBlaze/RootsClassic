package elucent.rootsclassic.datagen;

import elucent.rootsclassic.Const;
import elucent.rootsclassic.block.AttunedStandingStoneBlock;
import elucent.rootsclassic.registry.RootsRegistry;
import elucent.rootsclassic.registry.RootsTags;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class RootsDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(BlockLootTables::new);
        fabricDataGenerator.addProvider(Recipes::new);
        //fabricDataGenerator.addProvider(GLMProvider::new);
        BlockTagsProvider provider;
        fabricDataGenerator.addProvider(provider = new RootsBlockTags(fabricDataGenerator));
        fabricDataGenerator.addProvider(new RootsItemTags(fabricDataGenerator, provider));
    }

    private static class BlockLootTables extends SimpleFabricLootTableProvider {

        public BlockLootTables(FabricDataGenerator dataGenerator) {
            super(dataGenerator, LootContextParamSets.BLOCK);
        }

        @Override
        public void accept(BiConsumer<ResourceLocation, LootTable.Builder> biConsumer) {
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/mortar"), BlockLoot.createSingleItemTable(RootsRegistry.MORTAR));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/altar"), BlockLoot.createSingleItemTable(RootsRegistry.ALTAR));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/brazier"), BlockLoot.createSingleItemTable(RootsRegistry.BRAZIER));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/imbuer"), BlockLoot.createSingleItemTable(RootsRegistry.IMBUER));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/mundane_standing_stone"), BlockLoot.createSingleItemTable(RootsRegistry.MUNDANE_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/midnight_bloom"), BlockLoot.createSingleItemTable(RootsRegistry.MIDNIGHT_BLOOM));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/flare_orchid"), BlockLoot.createSingleItemTable(RootsRegistry.FLARE_ORCHID));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/radiant_daisy"), BlockLoot.createSingleItemTable(RootsRegistry.RADIANT_DAISY));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/attuned_standing_stone"), registerStandingStone(RootsRegistry.ATTUNED_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/vacuum_standing_stone"), registerStandingStone(RootsRegistry.VACUUM_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/repulsor_standing_stone"), registerStandingStone(RootsRegistry.REPULSOR_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/accelerator_standing_stone"), registerStandingStone(RootsRegistry.ACCELERATOR_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/aesthetic_standing_stone"), registerStandingStone(RootsRegistry.AESTHETIC_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/entangler_standing_stone"), registerStandingStone(RootsRegistry.ENTANGLER_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/igniter_standing_stone"), registerStandingStone(RootsRegistry.IGNITER_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/grower_standing_stone"), registerStandingStone(RootsRegistry.GROWER_STANDING_STONE));
            biConsumer.accept(new ResourceLocation(Const.MODID, "blocks/healer_standing_stone"), registerStandingStone(RootsRegistry.HEALER_STANDING_STONE));
        }

        private LootTable.Builder registerStandingStone(Block standingStone) {
            return BlockLoot.createSinglePropConditionTable(standingStone, AttunedStandingStoneBlock.HALF, DoubleBlockHalf.LOWER);
        }
    }

    private static class Recipes extends FabricRecipeProvider {
        public Recipes(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateRecipes(Consumer<FinishedRecipe> consumer) {
            ShapedRecipeBuilder.shaped(RootsRegistry.PESTLE).define('X', Blocks.DIORITE).group("pestle")
                    .pattern("X  ").pattern(" XX").pattern(" XX").unlockedBy("has_diorite", has(Blocks.DIORITE)).save(consumer);
            ShapedRecipeBuilder.shaped(RootsRegistry.PESTLE).define('X', Blocks.DIORITE).group("pestle")
                    .pattern("  X").pattern("XX ").pattern("XX ").unlockedBy("has_diorite", has(Blocks.DIORITE))
                    .save(consumer, Registry.ITEM.getKey(RootsRegistry.PESTLE) + "2");
            ShapedRecipeBuilder.shaped(RootsRegistry.MORTAR).define('X', Items.STONE)
                    .pattern("X X").pattern("X X").pattern(" X ").unlockedBy("has_stone", has(Items.STONE)).save(consumer);
            ShapedRecipeBuilder.shaped(RootsRegistry.IMBUER).define('X', Items.STICK).define('L', ItemTags.LOGS).define('S', Blocks.CHISELED_STONE_BRICKS)
                    .pattern("X X").pattern("LSL").unlockedBy("has_chiseled_stone_bricks", has(Blocks.CHISELED_STONE_BRICKS)).save(consumer);
            ShapedRecipeBuilder.shaped(RootsRegistry.MUNDANE_STANDING_STONE).define('S', Items.STONE).define('B', Blocks.STONE_BRICKS).define('L', Items.LAPIS_BLOCK)
                    .pattern("SBS").pattern("BLB").pattern("SBS").unlockedBy("has_lapis_block", has(Items.LAPIS_BLOCK)).save(consumer);
            ShapedRecipeBuilder.shaped(RootsRegistry.ATTUNED_STANDING_STONE).define('S', Items.STONE).define('N', Items.NETHER_BRICK).define('D', Items.DIAMOND)
                    .pattern("SNS").pattern("NDN").pattern("SNS").unlockedBy("has_diamond", has(Items.DIAMOND)).save(consumer);
            ShapedRecipeBuilder.shaped(RootsRegistry.BRAZIER)
                    .define('I', ConventionalItemTags.IRON_INGOTS).define('S', Items.STRING).define('C', Items.CAULDRON).define('X', Items.STICK)
                    .pattern("ISI").pattern("ICI").pattern("IXI").unlockedBy("has_cauldron", has(Items.CAULDRON)).save(consumer);
            ShapedRecipeBuilder.shaped(RootsRegistry.ALTAR)
                    .define('S', Items.STONE).define('F', Items.POPPY).define('B', RootsRegistry.VERDANT_SPRIG)
                    .define('G', Items.GOLD_BLOCK).define('C', Blocks.CHISELED_STONE_BRICKS)
                    .pattern("BFB").pattern("SGS").pattern(" C ").unlockedBy("has_gold_block", has(Items.GOLD_BLOCK)).save(consumer);
            ShapedRecipeBuilder.shaped(RootsRegistry.BARK_KNIFE)
                    .define('S', Items.STICK).define('V', ItemTags.SAPLINGS).define('P', ItemTags.PLANKS)
                    .pattern(" VV").pattern("VPV").pattern("SV ").unlockedBy("has_sapling", has(ItemTags.SAPLINGS)).save(consumer);
            ShapedRecipeBuilder.shaped(RootsRegistry.RUNIC_TABLET)
                    .define('S', Items.WHEAT_SEEDS).define('B', Items.STONE).define('R', RootsRegistry.OLD_ROOT)
                    .pattern(" R ").pattern("SBS").pattern(" S ").unlockedBy("has_old_root", has(RootsRegistry.OLD_ROOT)).save(consumer);
            ShapelessRecipeBuilder.shapeless(RootsRegistry.GROWTH_POWDER, 4)
                    .requires(Items.WHEAT_SEEDS).requires(Items.GRASS).requires(Items.REDSTONE).requires(RootsRegistry.PESTLE)
                    .unlockedBy("has_pestle", has(RootsRegistry.PESTLE)).save(consumer);
            ShapelessRecipeBuilder.shapeless(RootsRegistry.MUTATING_POWDER)
                    .requires(RootsRegistry.GROWTH_POWDER).requires(RootsRegistry.GROWTH_POWDER).requires(RootsRegistry.GROWTH_POWDER).requires(RootsRegistry.GROWTH_POWDER)
                    .requires(Items.NETHER_STAR).requires(Items.NETHER_WART).requires(RootsRegistry.PESTLE)
                    .unlockedBy("has_pestle", has(RootsRegistry.PESTLE)).save(consumer);
            ShapelessRecipeBuilder.shapeless(RootsRegistry.ROOTY_STEW)
                    .requires(Items.WHEAT).requires(Items.BOWL).requires(RootsRegistry.OLD_ROOT)
                    .unlockedBy("has_bowl", has(Items.BOWL)).save(consumer);
            ShapelessRecipeBuilder.shapeless(RootsRegistry.FRUIT_SALAD)
                    .requires(Items.MELON).requires(Items.MELON).requires(Items.MELON)
                    .requires(Items.APPLE).requires(Items.BOWL).requires(RootsRegistry.ELDERBERRY)
                    .requires(RootsRegistry.WHITECURRANT).requires(RootsRegistry.BLACKCURRANT).requires(RootsRegistry.REDCURRANT)
                    .unlockedBy("has_bowl", has(Items.BOWL)).save(consumer);
            ShapelessRecipeBuilder.shapeless(RootsRegistry.HEALING_POULTICE, 2)
                    .requires(RootsRegistry.REDCURRANT).requires(Items.PAPER).requires(RootsRegistry.PESTLE).requires(RootsRegistry.VERDANT_SPRIG)
                    .unlockedBy("has_pestle", has(RootsRegistry.PESTLE)).save(consumer);
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(RootsRegistry.DRAGONS_EYE),
                            Items.ENDER_PEARL, 1F, 200).unlockedBy("has_dragons_eye", has(RootsRegistry.DRAGONS_EYE))
                    .save(consumer, "rootsclassic:ender_pearl");
        }
    }

    private static class RootsBlockTags extends BlockTagsProvider {
        public RootsBlockTags(DataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void addTags() {
            this.tag(RootsTags.NEEDS_LIVING_TOOL);
            this.tag(RootsTags.NEEDS_ENGRAVED_TOOL);
        }
    }

    private static class RootsItemTags extends ItemTagsProvider {
        public RootsItemTags(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider) {
            super(dataGenerator, blockTagsProvider);
        }

        @Override
        protected void addTags() {
            this.tag(RootsTags.BERRIES).add(RootsRegistry.NIGHTSHADE, RootsRegistry.BLACKCURRANT, RootsRegistry.REDCURRANT, RootsRegistry.WHITECURRANT, RootsRegistry.ELDERBERRY);

            this.addBark(RootsRegistry.ACACIA_BARK, "acacia");
            this.addBark(RootsRegistry.BIRCH_BARK, "birch");
            this.addBark(RootsRegistry.DARK_OAK_BARK, "dark_oak");
            this.addBark(RootsRegistry.JUNGLE_BARK, "jungle");
            this.addBark(RootsRegistry.OAK_BARK, "oak");
            this.addBark(RootsRegistry.SPRUCE_BARK, "spruce");
        }

        private void addBark(Item item, String treeType) {
            TagKey<Item> barkTypeTag = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(Const.MODID, "barks/" + treeType));
            this.tag(RootsTags.BARKS).addTag(barkTypeTag);
            this.tag(barkTypeTag).add(item);
        }
    }
}
