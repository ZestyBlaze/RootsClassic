package elucent.rootsclassic.ritual;

import elucent.rootsclassic.Const;
import elucent.rootsclassic.block.altar.AltarBlockEntity;
import elucent.rootsclassic.block.brazier.BrazierBlockEntity;
import elucent.rootsclassic.registry.RootsRegistry;
import elucent.rootsclassic.ritual.rituals.*;
import elucent.rootsclassic.util.RootsUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class RitualRegistry {
    public static final RitualBase STAFF_CRAFTING = new RitualCrafting(1, 205, 86, 0)
                    .setResult(new ItemStack(RootsRegistry.CRYSTAL_STAFF, 1))
                    .addIncense(new ItemStack(Blocks.COAL_BLOCK, 1))
                    .addIncense(new ItemStack(RootsRegistry.ACACIA_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIngredient(new ItemStack(Blocks.DIAMOND_BLOCK, 1))
                    .addIngredient(new ItemStack(Items.STICK, 1))
                    .addIngredient(new ItemStack(Items.BLAZE_POWDER, 1));

    public static final RitualBase SYLVAN_HOOD_CRAFTING = new RitualCrafting(2, 62, 138, 62)
                    .setResult(new ItemStack(RootsRegistry.SYLVAN_HOOD, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIncense(new ItemStack(Items.GOLDEN_APPLE, 1))
                    .addIncense(new ItemStack(Blocks.POPPY, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Items.LEATHER_HELMET, 1))
                    .addIngredient(new ItemStack(Blocks.VINE, 1));

    public static final RitualBase SYLVAN_CHEST_CRAFTING = new RitualCrafting(2, 62, 138, 62)
                    .setResult(new ItemStack(RootsRegistry.SYLVAN_ROBE, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIncense(new ItemStack(Items.GOLDEN_APPLE, 1))
                    .addIncense(new ItemStack(Blocks.POPPY, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Items.LEATHER_CHESTPLATE, 1))
                    .addIngredient(new ItemStack(Blocks.VINE, 1));

    public static final RitualBase SYLVAN_LEGS_CRAFTING = new RitualCrafting(2, 62, 138, 62)
                    .setResult(new ItemStack(RootsRegistry.SYLVAN_TUNIC, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIncense(new ItemStack(Items.GOLDEN_APPLE, 1))
                    .addIncense(new ItemStack(Blocks.POPPY, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Items.LEATHER_LEGGINGS, 1))
                    .addIngredient(new ItemStack(Blocks.VINE, 1));

    public static final RitualBase SYLVAN_BOOTS_CRAFTING = new RitualCrafting(2, 62, 138, 62)
                    .setResult(new ItemStack(RootsRegistry.SYLVAN_BOOTS, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIncense(new ItemStack(Items.GOLDEN_APPLE, 1))
                    .addIncense(new ItemStack(Blocks.POPPY, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Items.LEATHER_BOOTS, 1))
                    .addIngredient(new ItemStack(Blocks.VINE, 1));

    public static final RitualBase WILDWOOD_HEAD_CRAFTING = new RitualCrafting(2, 145, 115, 65)
                    .setResult(new ItemStack(RootsRegistry.WILDWOOD_MASK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(Blocks.OAK_SAPLING, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Items.IRON_HELMET, 1))
                    .addIngredient(new ItemStack(Blocks.OAK_PLANKS, 1));

    public static final RitualBase WILDWOOD_CHEST_CRAFTING = new RitualCrafting(2, 145, 115, 65)
                    .setResult(new ItemStack(RootsRegistry.WILDWOOD_PLATE, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(Blocks.OAK_SAPLING, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Items.IRON_CHESTPLATE, 1))
                    .addIngredient(new ItemStack(Blocks.OAK_PLANKS, 1));

    public static final RitualBase WILDWOOD_LEGS_CRAFTING = new RitualCrafting(2, 145, 115, 65)
                    .setResult(new ItemStack(RootsRegistry.WILDWOOD_LEGGINGS, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(Blocks.OAK_SAPLING, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Items.IRON_LEGGINGS, 1))
                    .addIngredient(new ItemStack(Blocks.OAK_PLANKS, 1));

    public static final RitualBase WILDWOOD_BOOTS_CRAFTING = new RitualCrafting(2, 145, 115, 65)
                    .setResult(new ItemStack(RootsRegistry.WILDWOOD_BOOTS, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(Blocks.OAK_SAPLING, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Items.IRON_BOOTS, 1))
                    .addIngredient(new ItemStack(Blocks.OAK_PLANKS, 1));

    public static final RitualBase ACCELERATOR_STONE_CRAFTING = new RitualCrafting(2, 0, 105, 73)
                    .setResult(new ItemStack(RootsRegistry.ACCELERATOR_STANDING_STONE, 1))
                    .addIncense(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(RootsRegistry.JUNGLE_BARK, 1))
                    .addIngredient(new ItemStack(RootsRegistry.ATTUNED_STANDING_STONE, 1))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST, 1))
                    .addIngredient(new ItemStack(Blocks.STONE_BRICKS, 1));

    public static final RitualBase STANDING_STONE = new RitualCrafting(2, 0, 105, 73)
                    .setResult(new ItemStack(RootsRegistry.AESTHETIC_STANDING_STONE, 1))
                    .addIngredient(new ItemStack(RootsRegistry.ATTUNED_STANDING_STONE, 1))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST, 1))
                    .addIngredient(new ItemStack(Blocks.MOSSY_STONE_BRICKS, 1));

    public static final RitualBase ENTANGLER_STONE_CRAFTING = new RitualCrafting(2, 0, 105, 73)
                    .setResult(new ItemStack(RootsRegistry.ENTANGLER_STANDING_STONE, 1))
                    .addIncense(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIngredient(new ItemStack(RootsRegistry.ATTUNED_STANDING_STONE, 1))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST, 1))
                    .addIngredient(new ItemStack(Blocks.CRACKED_STONE_BRICKS, 1));

    public static final RitualBase GROWER_STONE_CRAFTING = new RitualCrafting(2, 0, 105, 73)
                    .setResult(new ItemStack(RootsRegistry.GROWER_STANDING_STONE, 1))
                    .addIncense(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIngredient(new ItemStack(RootsRegistry.ATTUNED_STANDING_STONE, 1))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST, 1))
                    .addIngredient(new ItemStack(Blocks.STONE, 1));

    public static final RitualBase HEALER_STONE_CRAFTING = new RitualCrafting(2, 0, 105, 73)
                    .setResult(new ItemStack(RootsRegistry.HEALER_STANDING_STONE, 1))
                    .addIncense(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(Items.GHAST_TEAR, 1))
                    .addIngredient(new ItemStack(RootsRegistry.ATTUNED_STANDING_STONE))
                    .addIngredient(new ItemStack(Items.REDSTONE))
                    .addIngredient(new ItemStack(Blocks.CHISELED_STONE_BRICKS, 1));

    public static final RitualBase IGNITER_STONE_CRAFTING = new RitualCrafting(2, 0, 105, 73)
                    .setResult(new ItemStack(RootsRegistry.IGNITER_STANDING_STONE, 1))
                    .addIncense(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(RootsRegistry.ACACIA_BARK, 1))
                    .addIngredient(new ItemStack(RootsRegistry.ATTUNED_STANDING_STONE, 1))
                    .addIngredient(new ItemStack(Items.REDSTONE, 1))
                    .addIngredient(new ItemStack(Blocks.CRACKED_STONE_BRICKS, 1));

    public static final RitualBase REPULSOR_STONE_CRAFTING = new RitualCrafting(2, 0, 105, 73)
                    .setResult(new ItemStack(RootsRegistry.REPULSOR_STANDING_STONE, 1))
                    .addIncense(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(RootsRegistry.SPRUCE_BARK, 1))
                    .addIngredient(new ItemStack(RootsRegistry.ATTUNED_STANDING_STONE, 1))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST, 1))
                    .addIngredient(new ItemStack(Blocks.CHISELED_STONE_BRICKS, 1));

    public static final RitualBase VACUUM_STONE_CRAFTING = new RitualCrafting(2, 0, 105, 73)
                    .setResult(new ItemStack(RootsRegistry.VACUUM_STANDING_STONE, 1))
                    .addIncense(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(RootsRegistry.DARK_OAK_BARK, 1))
                    .addIngredient(new ItemStack(RootsRegistry.ATTUNED_STANDING_STONE, 1))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST, 1))
                    .addIngredient(new ItemStack(Blocks.NETHER_BRICKS));

    public static final RitualBase RUNIC_FOCUS_CRAFTING = new RitualCrafting(2, 109, 242, 109)
                    .setResult(new ItemStack(RootsRegistry.RUNIC_FOCUS, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.SPRUCE_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.ACACIA_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.JUNGLE_BARK, 1))
                    .addIngredient(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIngredient(new ItemStack(Items.DIAMOND, 1))
                    .addIngredient(new ItemStack(Blocks.STONE, 1));

    public static final RitualBase RUNIC_FOCUS_CHARGING = new RitualCrafting(0, 109, 242, 109)
                    .setResult(new ItemStack(RootsRegistry.CHARGED_RUNIC_FOCUS, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIngredient(new ItemStack(RootsRegistry.RUNIC_FOCUS, 1))
                    .addIngredient(new ItemStack(Items.REDSTONE, 1))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST, 1));

    public static final RitualBase LIVING_PICKAXE_CRAFTING = new RitualCrafting(0, 146, 214, 43)
                    .setResult(new ItemStack(RootsRegistry.LIVING_PICKAXE, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIngredient(new ItemStack(Items.WOODEN_PICKAXE, 1))
                    .addIngredient(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIngredient(new ItemStack(Items.GOLD_NUGGET));

    public static final RitualBase LIVING_AXE_CRAFTING = new RitualCrafting(0, 146, 214, 43)
                    .setResult(new ItemStack(RootsRegistry.LIVING_AXE, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIngredient(new ItemStack(Items.WOODEN_AXE, 1))
                    .addIngredient(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIngredient(new ItemStack(Items.GOLD_NUGGET, 1));

    public static final RitualBase LIVING_SWORD_CRAFTING = new RitualCrafting(0, 146, 214, 43)
                    .setResult(new ItemStack(RootsRegistry.LIVING_SWORD, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIngredient(new ItemStack(Items.WOODEN_SWORD, 1))
                    .addIngredient(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIngredient(new ItemStack(Items.GOLD_NUGGET, 1));

    public static final RitualBase LIVING_HOE_CRAFTING = new RitualCrafting(0, 146, 214, 43)
                    .setResult(new ItemStack(RootsRegistry.LIVING_HOE, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIngredient(new ItemStack(Items.WOODEN_HOE, 1))
                    .addIngredient(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIngredient(new ItemStack(Items.GOLD_NUGGET, 1));

    public static final RitualBase LIVING_SHOVEL_CRAFTING = new RitualCrafting(0, 146, 214, 43)
                    .setResult(new ItemStack(RootsRegistry.LIVING_SHOVEL, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.OAK_BARK, 1))
                    .addIngredient(new ItemStack(Items.WOODEN_SHOVEL, 1))
                    .addIngredient(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1))
                    .addIngredient(new ItemStack(Items.GOLD_NUGGET, 1));

    public static final RitualBase CAUSE_RAIN = new RitualCauseRain(1, 23, 0, 138)
                    .addIncense(new ItemStack(Blocks.VINE, 1))
                    .addIncense(new ItemStack(RootsRegistry.OLD_ROOT, 1))
                    .addIngredient(new ItemStack(Blocks.LILY_PAD, 1));

    public static final RitualBase BANISH_RAIN = new RitualBanishRain(1, 204, 159, 35)
                    .addIncense(new ItemStack(Blocks.VINE, 1))
                    .addIncense(new ItemStack(RootsRegistry.OLD_ROOT, 1))
                    .addIngredient(new ItemStack(Items.WHEAT, 1));

    public static final RitualBase MASS_BREEDING = new RitualMassBreed(2, 148, 61, 81)
                    .addIncense(new ItemStack(Items.CARROT, 1))
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(Items.WHEAT_SEEDS, 1))
                    .addIncense(new ItemStack(Items.COD, 1))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST, 1))
                    .addIngredient(new ItemStack(Items.BONE));

    public static final RitualBase LIFE_DRAIN = new RitualLifeDrain(2, 139, 22, 40)
                    .addIncense(new ItemStack(Items.WOODEN_SWORD, 1))
                    .addIncense(new ItemStack(Items.WOODEN_AXE, 1))
                    .addIncense(new ItemStack(RootsRegistry.DARK_OAK_BARK, 1))
                    .addIncense(new ItemStack(RootsRegistry.BIRCH_BARK, 1))
                    .addIngredient(new ItemStack(Items.BLAZE_POWDER, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase IMBUER = new RitualImbuer()
                    .addIngredient(new ItemStack(RootsRegistry.CRYSTAL_STAFF, 1))
                    .addIngredient(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1));

    public static final RitualBase COW_SUMMONING = new RitualSummoning(1, 199, 105, 193)
                    .setEntityType(EntityType.COW)
                    .addIncense(new ItemStack(Items.WHEAT_SEEDS, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.BEEF, 1))
                    .addIngredient(new ItemStack(Items.LEATHER, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase PIG_SUMMONING = new RitualSummoning(1, 199, 105, 193)
                    .setEntityType(EntityType.PIG)
                    .addIncense(new ItemStack(Items.WHEAT_SEEDS, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.PORKCHOP, 1))
                    .addIngredient(new ItemStack(Items.PORKCHOP, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase SHEEP_SUMMONING = new RitualSummoning(1, 199, 105, 193)
                    .setEntityType(EntityType.SHEEP)
                    .addIncense(new ItemStack(Items.WHEAT_SEEDS, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.MUTTON, 1))
                    .addIngredient(new ItemStack(Blocks.WHITE_WOOL, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase CHICKEN_SUMMONING = new RitualSummoning(1, 199, 105, 193)
                    .setEntityType(EntityType.CHICKEN)
                    .addIncense(new ItemStack(Items.WHEAT_SEEDS, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.CHICKEN, 1))
                    .addIngredient(new ItemStack(Items.FEATHER, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase RABBIT_SUMMONING = new RitualSummoning(1, 199, 105, 193)
                    .setEntityType(EntityType.RABBIT)
                    .addIncense(new ItemStack(Items.WHEAT_SEEDS, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.RABBIT, 1))
                    .addIngredient(new ItemStack(Items.RABBIT_HIDE, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase ZOMBIE_SUMMONING = new RitualSummoning(2, 58, 2, 84)
                    .setEntityType(EntityType.ZOMBIE)
                    .addIncense(new ItemStack(Items.COAL, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.ROTTEN_FLESH, 1))
                    .addIngredient(new ItemStack(Items.ROTTEN_FLESH, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase SKELETON_SUMMONING = new RitualSummoning(2, 58, 2, 84)
                    .setEntityType(EntityType.SKELETON)
                    .addIncense(new ItemStack(Items.COAL, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.ARROW, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase SPIDER_SUMMONING = new RitualSummoning(2, 58, 2, 84)
                    .setEntityType(EntityType.SPIDER)
                    .addIncense(new ItemStack(Items.COAL, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.STRING, 1))
                    .addIngredient(new ItemStack(Items.SPIDER_EYE, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase CAVE_SPIDER_SUMMONING = new RitualSummoning(2, 58, 2, 84)
                    .setEntityType(EntityType.CAVE_SPIDER)
                    .addIncense(new ItemStack(Items.COAL, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.STRING, 1))
                    .addIngredient(new ItemStack(Items.FERMENTED_SPIDER_EYE, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase SLIME_SUMMONING = new RitualSummoning(2, 58, 2, 84)
                    .setEntityType(EntityType.SLIME)
                    .addIncense(new ItemStack(Items.COAL, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.SLIME_BALL, 1))
                    .addIngredient(new ItemStack(Items.SLIME_BALL, 1))
                    .addIngredient(new ItemStack(Items.SLIME_BALL, 1));

    public static final RitualBase CREEPER_SUMMONING = new RitualSummoning(2, 58, 2, 84)
                    .setEntityType(EntityType.CREEPER)
                    .addIncense(new ItemStack(Items.COAL, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.GUNPOWDER, 1))
                    .addIngredient(new ItemStack(Items.GUNPOWDER, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase ENDERMAN_SUMMONING = new RitualSummoning(2, 58, 2, 84)
                    .setEntityType(EntityType.ENDERMAN)
                    .addIncense(new ItemStack(Items.COAL, 1))
                    .addIncense(new ItemStack(Items.NETHER_WART, 1))
                    .addIngredient(new ItemStack(Items.ENDER_PEARL, 1))
                    .addIngredient(new ItemStack(Items.ENDER_PEARL, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase SACRIFICE = new RitualSacrifice(2, 94, 9, 56)
                    .addIncense(new ItemStack(Items.BLAZE_POWDER, 1))
                    .addIncense(new ItemStack(RootsRegistry.DARK_OAK_BARK, 1))
                    .addIngredient(new ItemStack(Items.FLINT, 1))
                    .addIngredient(new ItemStack(Items.IRON_SWORD, 1))
                    .addIngredient(new ItemStack(Items.BONE, 1));

    public static final RitualBase FLARE = new RitualFlare(1, 255, 91, 25)
                    .addIncense(new ItemStack(Items.GUNPOWDER, 1))
                    .addIncense(new ItemStack(RootsRegistry.INFERNAL_BULB, 1))
                    .addIngredient(new ItemStack(Items.FLINT, 1))
                    .addIngredient(new ItemStack(Items.COAL, 1))
                    .addIngredient(new ItemStack(Items.CHARCOAL, 1));

    public static final RitualBase GROW = new RitualGrow(0, 82, 212, 47)
                    .addIncense(new ItemStack(Items.WHEAT, 1))
                    .addIncense(new ItemStack(Items.BEETROOT, 1))
                    .addIncense(new ItemStack(Items.POTATO, 1))
                    .addIncense(new ItemStack(Items.CARROT, 1))
                    .addIngredient(new ItemStack(Items.REDSTONE, 1))
                    .addIngredient(new ItemStack(Items.BONE_MEAL, 1))
                    .addIngredient(new ItemStack(RootsRegistry.VERDANT_SPRIG, 1));

    public static final RitualBase ENGRAVED_CRAFTING = new RitualEngravedSword(2, 104, 106, 107)
                    .setResult(new ItemStack(RootsRegistry.ENGRAVED_BLADE))
                    .addIncense(new ItemStack(Items.GOLDEN_APPLE))
                    .addIncense(new ItemStack(Items.GOLDEN_CARROT, 1))
                    .addIngredient(new ItemStack(Items.STONE_SWORD))
                    .addIngredient(new ItemStack(RootsRegistry.RUNIC_FOCUS))
                    .addIngredient(new ItemStack(Items.GLOWSTONE_DUST));

    public static final RitualBase TIME_SHIFT = new RitualTimeShift(1, 240, 245, 88)
                    .addIngredient(new ItemStack(Items.CLOCK))
                    .addIngredient(new ItemStack(Items.IRON_INGOT))
                    .addIncense(new ItemStack(Items.CLOCK))
                    .setSecondaryColor(252, 162, 35);

    public static void register() {
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "staff_crafting"), STAFF_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "sylvan_hood_crafting"), SYLVAN_HOOD_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "sylvan_chest_crafting"), SYLVAN_CHEST_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "sylvan_legs_crafting"), SYLVAN_LEGS_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "sylvan_boots_crafting"), SYLVAN_BOOTS_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "wildwood_head_crafting"), WILDWOOD_HEAD_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "wildwood_chest_crafting"), WILDWOOD_CHEST_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "wildwood_legs_crafting"), WILDWOOD_LEGS_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "wildwood_boots_crafting"), WILDWOOD_BOOTS_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "accelerator_stone_crafting"), ACCELERATOR_STONE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "standing_stone"), STANDING_STONE);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "entangler_stone_crafting"), ENTANGLER_STONE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "grower_stone_crafting"), GROWER_STONE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "healer_stone_crafting"), HEALER_STONE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "igniter_stone_crafting"), IGNITER_STONE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "repulsor_stone_crafting"), REPULSOR_STONE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "vacuum_stone_crafting"), VACUUM_STONE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "runic_focus_crafting"), RUNIC_FOCUS_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "runic_focus_charging"), RUNIC_FOCUS_CHARGING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "living_pickaxe_crafting"), LIVING_PICKAXE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "living_axe_crafting"), LIVING_AXE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "living_sword_crafting"), LIVING_SWORD_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "living_hoe_crafting"), LIVING_HOE_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "living_shovel_crafting"), LIVING_SHOVEL_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "cause_rain"), CAUSE_RAIN);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "banish_rain"), BANISH_RAIN);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "mass_breeding"), MASS_BREEDING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "life_drain"), LIFE_DRAIN);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "imbuer"), IMBUER);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "cow_summoning"), COW_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "pig_summoning"), PIG_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "sheep_summoning"), SHEEP_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "chicken_summoning"), CHICKEN_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "rabbit_summoning"), RABBIT_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "zombie_summoning"), ZOMBIE_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "skeleton_summoning"), SKELETON_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "spider_summoning"), SPIDER_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "cave_spider_summoning"), CAVE_SPIDER_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "slime_summoning"), SLIME_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "creeper_summoning"), CREEPER_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "enderman_summoning"), ENDERMAN_SUMMONING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "sacrifice"), SACRIFICE);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "flare"), FLARE);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "grow"), GROW);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "engraved_crafting"), ENGRAVED_CRAFTING);
        Registry.register(RitualBaseRegistry.RITUALS, new ResourceLocation(Const.MODID, "time_shift"), TIME_SHIFT);
    }


    public static RitualBase findMatchingByIngredients(AltarBlockEntity altar) {
        for (RitualBase ritual : RitualBaseRegistry.RITUALS.stream().toList()) {
            //      if (ritual.getName().equals("healer_stone_crafting")) {
            //        Roots.logger.info("healer stone?");
            //        for (ItemStack s : ritual.getIngredients()) {
            //          Roots.logger.info(s.getDisplayName());
            //        }
            //        Roots.logger.info("==== ");
            //        for (ItemStack s : altar.getInventory()) {
            //          Roots.logger.info(s.getDisplayName());
            //        }
            //        Roots.logger.info("----");
            //      }
            List<ItemStack> altarInv = new ArrayList<>();
            for (int i = 0; i < altar.inventoryWrapper.getSlots().size(); i++) {
                altarInv.add(altar.inventoryWrapper.getSlot(i).getResource().toStack());
            }
            if (RootsUtil.itemListsMatchWithSize(ritual.getIngredients(), altarInv)) {
                return ritual;
            }
        }
        return null;
    }

    public static List<ItemStack> getIncenses(Level level, BlockPos pos) {
        List<ItemStack> test = new ArrayList<>();
        for (int i = -4; i < 5; i++) {
            for (int j = -4; j < 5; j++) {
                if (level.getBlockState(pos.offset(i, 0, j)).getBlock() == RootsRegistry.BRAZIER) {
                    if (level.getBlockEntity(pos.offset(i, 0, j)) instanceof BrazierBlockEntity brazierBlockEntity) {
                        if (brazierBlockEntity.isBurning()) {
                            test.add(brazierBlockEntity.getHeldItem());
                        }
                    }
                }
            }
        }
        return test;
    }
}
