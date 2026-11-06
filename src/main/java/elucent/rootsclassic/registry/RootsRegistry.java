package elucent.rootsclassic.registry;

import elucent.rootsclassic.Const;
import elucent.rootsclassic.Roots;
import elucent.rootsclassic.block.*;
import elucent.rootsclassic.block.altar.AltarBlock;
import elucent.rootsclassic.block.altar.AltarBlockEntity;
import elucent.rootsclassic.block.brazier.BlockBrazier;
import elucent.rootsclassic.block.brazier.BrazierBlockEntity;
import elucent.rootsclassic.block.flowers.FlareOrchidBlock;
import elucent.rootsclassic.block.flowers.MidnightBloomBlock;
import elucent.rootsclassic.block.flowers.RadiantDaisyBlock;
import elucent.rootsclassic.block.imbuer.ImbuerBlock;
import elucent.rootsclassic.block.imbuer.ImbuerBlockEntity;
import elucent.rootsclassic.block.mortar.MortarBlock;
import elucent.rootsclassic.block.mortar.MortarBlockEntity;
import elucent.rootsclassic.blockentity.*;
import elucent.rootsclassic.item.*;
import elucent.rootsclassic.item.powder.SpellPowderItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class RootsRegistry {
    /**
     * Blocks
     */
    //registerBlock(druidChalice = new BlockDruidChalice(), "druidChalice");
    public static final Block MORTAR = new MortarBlock(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0F));
    public static final BlockEntityType<MortarBlockEntity> MORTAR_TILE = BlockEntityType.Builder.of(MortarBlockEntity::new,
            RootsRegistry.MORTAR).build(null);
    public static final Block ALTAR = new AltarBlock(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0F));
    public static final BlockEntityType<AltarBlockEntity> ALTAR_TILE = BlockEntityType.Builder.of(AltarBlockEntity::new,
            RootsRegistry.ALTAR).build(null);
    public static final Block BRAZIER = new BlockBrazier(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0F));
    public static final BlockEntityType<BrazierBlockEntity> BRAZIER_TILE = BlockEntityType.Builder.of(BrazierBlockEntity::new,
            RootsRegistry.BRAZIER).build(null);
    public static final Block IMBUER = new ImbuerBlock(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0F));
    public static final BlockEntityType<ImbuerBlockEntity> IMBUER_TILE = BlockEntityType.Builder.of(ImbuerBlockEntity::new,
            RootsRegistry.IMBUER).build(null);
    public static final Block MUNDANE_STANDING_STONE = new MundaneStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final Block ATTUNED_STANDING_STONE = new AttunedStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final Block VACUUM_STANDING_STONE = new VacuumStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final BlockEntityType<VacuumStandingStoneTile> VACUUM_STANDING_STONE_TILE = BlockEntityType.Builder.of(VacuumStandingStoneTile::new, RootsRegistry.VACUUM_STANDING_STONE).build(null);
    public static final Block REPULSOR_STANDING_STONE = new RepulsorStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final BlockEntityType<RepulsorStandingStoneTile> REPULSOR_STANDING_STONE_TILE = BlockEntityType.Builder.of(RepulsorStandingStoneTile::new, RootsRegistry.REPULSOR_STANDING_STONE).build(null);
    public static final Block ACCELERATOR_STANDING_STONE = new AcceleratorStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final BlockEntityType<AcceleratorStandingStoneTile> ACCELERATOR_STANDING_STONE_TILE = BlockEntityType.Builder.of(AcceleratorStandingStoneTile::new, RootsRegistry.ACCELERATOR_STANDING_STONE).build(null);
    public static final Block AESTHETIC_STANDING_STONE = new AestheticStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final BlockEntityType<AestheticStandingStoneTile> AESTHETIC_STANDING_STONE_TILE = BlockEntityType.Builder.of(AestheticStandingStoneTile::new, RootsRegistry.AESTHETIC_STANDING_STONE).build(null);
    public static final Block ENTANGLER_STANDING_STONE = new EntanglerStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final BlockEntityType<EntanglerStandingStoneTile> ENTANGLER_STANDING_STONE_TILE = BlockEntityType.Builder.of(EntanglerStandingStoneTile::new, RootsRegistry.ENTANGLER_STANDING_STONE).build(null);
    public static final Block IGNITER_STANDING_STONE = new IgniterStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final BlockEntityType<IgniterStandingStoneTile> IGNITER_STANDING_STONE_TILE = BlockEntityType.Builder.of(IgniterStandingStoneTile::new, RootsRegistry.IGNITER_STANDING_STONE).build(null);
    public static final Block GROWER_STANDING_STONE = new GrowerStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final BlockEntityType<GrowerStandingStoneTile> GROWER_STANDING_STONE_TILE = BlockEntityType.Builder.of(GrowerStandingStoneTile::new, RootsRegistry.GROWER_STANDING_STONE).build(null);
    public static final Block HEALER_STANDING_STONE = new HealerStandingStoneBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.0F));
    public static final BlockEntityType<HealerStandingStone> HEALER_STANDING_STONE_TILE = BlockEntityType.Builder.of(HealerStandingStone::new, RootsRegistry.HEALER_STANDING_STONE).build(null);
    public static final Block MIDNIGHT_BLOOM = new MidnightBloomBlock(BlockBehaviour.Properties.of(Material.PLANT));
    public static final Block FLARE_ORCHID = new FlareOrchidBlock(BlockBehaviour.Properties.of(Material.PLANT));
    public static final Block RADIANT_DAISY = new RadiantDaisyBlock(BlockBehaviour.Properties.of(Material.PLANT));
    /**
     * Items
     */
    public static final Item BARK_KNIFE = new DruidKnifeItem(itemBuilder().durability(64).tab(Roots.tab));
    public static final Item SPELL_POWDER = new SpellPowderItem(itemBuilder().stacksTo(1).tab(Roots.tab));
    public static final Item PESTLE = new PestleItem(itemBuilder().stacksTo(1).tab(Roots.tab));
    public static final Item STAFF = new StaffItem(itemBuilder().stacksTo(1).tab(Roots.tab));
    public static final Item CRYSTAL_STAFF = new CrystalStaffItem(itemBuilder().stacksTo(1).tab(Roots.tab));
    public static final Item OLD_ROOT = new RootsFoodItem(itemBuilder().food(RootsFoods.OLD_ROOT).tab(Roots.tab));
    public static final Item VERDANT_SPRIG = new Item(itemBuilder().tab(Roots.tab));
    public static final Item INFERNAL_BULB = new InfernalBulbItem(itemBuilder().tab(Roots.tab));
    public static final Item DRAGONS_EYE = new DragonsEyeItem(itemBuilder().tab(Roots.tab).food(RootsFoods.DRAGONS_EYE));
    public static final Item OAK_BARK = new Item(itemBuilder().tab(Roots.tab));
    public static final Item SPRUCE_BARK = new Item(itemBuilder().tab(Roots.tab));
    public static final Item BIRCH_BARK = new Item(itemBuilder().tab(Roots.tab));
    public static final Item JUNGLE_BARK = new Item(itemBuilder().tab(Roots.tab));
    public static final Item ACACIA_BARK = new Item(itemBuilder().tab(Roots.tab));
    public static final Item DARK_OAK_BARK = new Item(itemBuilder().tab(Roots.tab));
    public static final Item LIVING_SWORD = new LivingSwordItem(RootsItemTier.LIVING, 3, -2.4F, itemBuilder().tab(Roots.tab));
    public static final Item LIVING_SHOVEL = new LivingShovelItem(RootsItemTier.LIVING, 1.5F, -3.0F, itemBuilder().tab(Roots.tab));
    public static final Item LIVING_PICKAXE = new LivingPickaxeItem(RootsItemTier.LIVING, 1, -2.8F, itemBuilder().tab(Roots.tab));
    public static final Item LIVING_AXE = new LivingAxeItem(RootsItemTier.LIVING, 7.0F, -3.2F, itemBuilder().tab(Roots.tab));
    public static final Item LIVING_HOE = new LivingHoeItem(RootsItemTier.LIVING, -1, -2.0F, itemBuilder().tab(Roots.tab));
    public static final Item SYLVAN_HOOD = new SylvanArmorItem(RootsArmorMaterial.SYLVAN, EquipmentSlot.HEAD, itemBuilder().tab(Roots.tab));
    public static final Item SYLVAN_ROBE = new SylvanArmorItem(RootsArmorMaterial.SYLVAN, EquipmentSlot.CHEST, itemBuilder().tab(Roots.tab));
    public static final Item SYLVAN_TUNIC = new SylvanArmorItem(RootsArmorMaterial.SYLVAN, EquipmentSlot.LEGS, itemBuilder().tab(Roots.tab));
    public static final Item SYLVAN_BOOTS = new SylvanArmorItem(RootsArmorMaterial.SYLVAN, EquipmentSlot.FEET, itemBuilder().tab(Roots.tab));
    public static final Item WILDWOOD_MASK = new WildwoodArmorItem(RootsArmorMaterial.WILDWOOD, EquipmentSlot.HEAD, itemBuilder().tab(Roots.tab));
    public static final Item WILDWOOD_PLATE = new WildwoodArmorItem(RootsArmorMaterial.WILDWOOD, EquipmentSlot.CHEST, itemBuilder().tab(Roots.tab));
    public static final Item WILDWOOD_LEGGINGS = new WildwoodArmorItem(RootsArmorMaterial.WILDWOOD, EquipmentSlot.LEGS, itemBuilder().tab(Roots.tab));
    public static final Item WILDWOOD_BOOTS = new WildwoodArmorItem(RootsArmorMaterial.WILDWOOD, EquipmentSlot.FEET, itemBuilder().tab(Roots.tab));
    public static final Item RUNIC_TABLET = new RunicTabletItem(itemBuilder().stacksTo(1).tab(Roots.tab));
    public static final Item GROWTH_POWDER = new GrowthPowderItem(itemBuilder().tab(Roots.tab));
    public static final Item MUTATING_POWDER = new MutatingPowderItem(itemBuilder().stacksTo(1).tab(Roots.tab));
    public static final Item NIGHTSHADE = new RootsFoodItem(itemBuilder().food(RootsFoods.NIGHTSHADE).tab(Roots.tab));
    public static final Item BLACKCURRANT = new RootsFoodItem(itemBuilder().food(RootsFoods.BLACKCURRANT).tab(Roots.tab));
    public static final Item REDCURRANT = new RootsFoodItem(itemBuilder().food(RootsFoods.REDCURRANT).tab(Roots.tab));
    public static final Item WHITECURRANT = new RootsFoodItem(itemBuilder().food(RootsFoods.WHITECURRANT).tab(Roots.tab));
    public static final Item ELDERBERRY = new RootsFoodItem(itemBuilder().food(RootsFoods.ELDERBERRY).tab(Roots.tab));
    public static final Item HEALING_POULTICE = new RootsFoodItem(itemBuilder().stacksTo(8).food(RootsFoods.HEALING_POULTICE).tab(Roots.tab));
    public static final Item ROOTY_STEW = new BowlFoodItem(itemBuilder().stacksTo(1).food(RootsFoods.ROOTY_STEW).tab(Roots.tab));
    public static final Item FRUIT_SALAD = new BowlFoodItem(itemBuilder().stacksTo(1).food(RootsFoods.FRUIT_SALAD).tab(Roots.tab));
    public static final Item RUNIC_FOCUS = new RunicFocusItem(itemBuilder().stacksTo(1).tab(Roots.tab));
    public static final Item CHARGED_RUNIC_FOCUS = new RunicFocusItem(itemBuilder().stacksTo(1).tab(Roots.tab));
    public static final Item ENGRAVED_BLADE = new EngravedBladeItem(RootsItemTier.ENGRAVED, 3, -3.0F, itemBuilder().tab(Roots.tab));
    public static final Item MANA_RESEARCH_ICON = new Item(itemBuilder());
    //TODO Register an egg for the phantom skeleton 		EntityRegistry.registerEgg(new ResourceLocation(Const.MODID, PhantomSkeletonEntity.NAME), RootsUtil.intColor(87, 58, 134), 0xA0A0A0);
    /**
     * Block Items
     */
    public static final Item MORTAR_ITEM = new BlockItem(RootsRegistry.MORTAR, itemBuilder().tab(Roots.tab));
    public static final Item ALTAR_ITEM = new BlockItem(RootsRegistry.ALTAR, itemBuilder().tab(Roots.tab));
    public static final Item BRAZIER_ITEM =  new BlockItem(RootsRegistry.BRAZIER, itemBuilder().tab(Roots.tab));
    public static final Item IMBUER_ITEM = new BlockItem(RootsRegistry.IMBUER, itemBuilder().tab(Roots.tab));
    public static final Item MUNDANE_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.MUNDANE_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item ATTUNED_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.ATTUNED_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item VACUUM_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.VACUUM_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item REPULSOR_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.REPULSOR_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item ACCELERATOR_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.ACCELERATOR_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item AESTHETIC_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.AESTHETIC_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item ENTANGLER_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.ENTANGLER_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item IGNITER_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.IGNITER_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item GROWER_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.GROWER_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item HEALER_STANDING_STONE_ITEM = new BlockItem(RootsRegistry.HEALER_STANDING_STONE, itemBuilder().tab(Roots.tab));
    public static final Item MIDNIGHT_BLOOM_ITEM = new BlockItem(RootsRegistry.MIDNIGHT_BLOOM, itemBuilder().tab(Roots.tab));
    public static final Item FLARE_ORCHID_ITEM = new BlockItem(RootsRegistry.FLARE_ORCHID, itemBuilder().tab(Roots.tab));
    public static final Item RADIANT_DAISY_ITEM =  new BlockItem(RootsRegistry.RADIANT_DAISY, itemBuilder().tab(Roots.tab));

    private static Item.Properties itemBuilder() {
        return new Item.Properties();
    }

    public static void register() {
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "mortar"), MORTAR);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "mortar"), MORTAR_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "altar"), ALTAR);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "altar"), ALTAR_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "brazier"), BRAZIER);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "brazier"), BRAZIER_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "imbuer"), IMBUER);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "imbuer"), IMBUER_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "mundane_standing_stone"), MUNDANE_STANDING_STONE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "attuned_standing_stone"), ATTUNED_STANDING_STONE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "vacuum_standing_stone"), VACUUM_STANDING_STONE);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "vacuum_standing_stone"), VACUUM_STANDING_STONE_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "repulsor_standing_stone"), REPULSOR_STANDING_STONE);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "repulsor_standing_stone"), REPULSOR_STANDING_STONE_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "accelerator_standing_stone"), ACCELERATOR_STANDING_STONE);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "accelerator_standing_stone"), ACCELERATOR_STANDING_STONE_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "aesthetic_standing_stone"), AESTHETIC_STANDING_STONE);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "aesthetic_standing_stone"), AESTHETIC_STANDING_STONE_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "entangler_standing_stone"), ENTANGLER_STANDING_STONE);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "entangler_standing_stone"), ENTANGLER_STANDING_STONE_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "igniter_standing_stone"), IGNITER_STANDING_STONE);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "igniter_standing_stone"), IGNITER_STANDING_STONE_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "grower_standing_stone"), GROWER_STANDING_STONE);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "grower_standing_stone"), GROWER_STANDING_STONE_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "healer_standing_stone"), HEALER_STANDING_STONE);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(Const.MODID, "healer_standing_stone"), HEALER_STANDING_STONE_TILE);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "midnight_bloom"), MIDNIGHT_BLOOM);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "flare_orchid"), FLARE_ORCHID);
        Registry.register(Registry.BLOCK, new ResourceLocation(Const.MODID, "radiant_daisy"), RADIANT_DAISY);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "bark_knife"), BARK_KNIFE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "spell_powder"), SPELL_POWDER);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "pestle"), PESTLE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "staff"), STAFF);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "crystal_staff"), CRYSTAL_STAFF);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "old_root"), OLD_ROOT);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "verdant_sprig"), VERDANT_SPRIG);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "infernal_bulb"), INFERNAL_BULB);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "dragons_eye"), DRAGONS_EYE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "oak_bark"), OAK_BARK);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "spruce_bark"), SPRUCE_BARK);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "birch_bark"), BIRCH_BARK);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "jungle_bark"), JUNGLE_BARK);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "acacia_bark"), ACACIA_BARK);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "dark_oak_bark"), DARK_OAK_BARK);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "living_sword"), LIVING_SWORD);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "living_shovel"), LIVING_SHOVEL);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "living_pickaxe"), LIVING_PICKAXE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "living_axe"), LIVING_AXE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "living_hoe"), LIVING_HOE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "sylvan_hood"), SYLVAN_HOOD);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "sylvan_tunic"), SYLVAN_TUNIC);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "sylvan_robe"), SYLVAN_ROBE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "sylvan_boots"), SYLVAN_BOOTS);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "wildwood_mask"), WILDWOOD_MASK);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "wildwood_plate"), WILDWOOD_PLATE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "wildwood_leggings"), WILDWOOD_LEGGINGS);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "wildwood_boots"), WILDWOOD_BOOTS);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "runic_tablet"), RUNIC_TABLET);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "growth_powder"), GROWTH_POWDER);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "mutating_powder"), MUTATING_POWDER);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "nightshade"), NIGHTSHADE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "blackcurrant"), BLACKCURRANT);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "redcurrant"), REDCURRANT);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "whitecurrant"), WHITECURRANT);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "elderberry"), ELDERBERRY);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "healing_poultice"), HEALING_POULTICE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "rooty_stew"), ROOTY_STEW);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "fruit_salad"), FRUIT_SALAD);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "runic_focus"), RUNIC_FOCUS);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "charged_runic_focus"), CHARGED_RUNIC_FOCUS);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "engraved_blade"), ENGRAVED_BLADE);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "mana_research_item"), MANA_RESEARCH_ICON);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "mortar"), MORTAR_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "altar"), ALTAR_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "brazier"), BRAZIER_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "imbuer"), IMBUER_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "mundane_standing_stone"), MUNDANE_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "attuned_standing_stone"), ATTUNED_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "vacuum_standing_stone"), VACUUM_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "repulsor_standing_stone"), REPULSOR_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "accelerator_standing_stone"), ACCELERATOR_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "aesthetic_standing_stone"), AESTHETIC_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "entangler_standing_stone"), ENTANGLER_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "igniter_standing_stone"), IGNITER_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "grower_standing_stone"), GROWER_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "healer_standing_stone"), HEALER_STANDING_STONE_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "midnight_bloom"), MIDNIGHT_BLOOM_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "flare_orchid"), FLARE_ORCHID_ITEM);
        Registry.register(Registry.ITEM, new ResourceLocation(Const.MODID, "radiant_daisy"), RADIANT_DAISY_ITEM);
    }

    public static void registerStats() {
        ComposterBlock.COMPOSTABLES.put(BLACKCURRANT, 0.3F);
        ComposterBlock.COMPOSTABLES.put(REDCURRANT, 0.3F);
        ComposterBlock.COMPOSTABLES.put(WHITECURRANT, 0.3F);
        FuelRegistry.INSTANCE.add(RootsRegistry.INFERNAL_BULB, 2400);
    }
}
