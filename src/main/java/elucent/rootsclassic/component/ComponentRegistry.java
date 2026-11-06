package elucent.rootsclassic.component;

import elucent.rootsclassic.Const;
import elucent.rootsclassic.component.components.*;
import elucent.rootsclassic.recipe.ComponentRecipe;
import elucent.rootsclassic.registry.RootsRecipes;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Optional;

public class ComponentRegistry {
    public static final ComponentBase ROSE_BUSH =
            new ComponentRose().setPrimaryColor(192, 0, 72).setSecondaryColor(0, 200, 48).setTextColor(ChatFormatting.GREEN);

    public static final ComponentBase DANDELION =
            new ComponentDandelion().setPrimaryColor(255, 217, 102).setSecondaryColor(240, 159, 10).setTextColor(ChatFormatting.YELLOW);

    public static final ComponentBase CHORUS =
            new ComponentChorus().setPrimaryColor(95, 57, 95).setSecondaryColor(225, 215, 225).setTextColor(ChatFormatting.DARK_PURPLE);

    public static final ComponentBase NETHER_WART =
            new ComponentNetherWart().setPrimaryColor(255, 76, 36).setSecondaryColor(255, 174, 0).setTextColor(ChatFormatting.GOLD);

    public static final ComponentBase PEONY =
            new ComponentPeony().setPrimaryColor(255, 102, 178).setSecondaryColor(255, 51, 153).setTextColor(ChatFormatting.LIGHT_PURPLE);

    public static final ComponentBase SUNFLOWER =
            new ComponentSunflower().setPrimaryColor(255, 255, 128).setSecondaryColor(255, 255, 255).setTextColor(ChatFormatting.WHITE);

    public static final ComponentBase LILAC =
            new ComponentLilac().setPrimaryColor(112, 80, 112).setSecondaryColor(0, 112, 24).setTextColor(ChatFormatting.GREEN);

    public static final ComponentBase AZURE_BLUET =
            new ComponentAzureBluet().setPrimaryColor(240, 240, 255).setSecondaryColor(86, 86, 96).setTextColor(ChatFormatting.GRAY);

    public static final ComponentBase ALLIUM =
            new ComponentAllium().setPrimaryColor(255, 202, 255).setSecondaryColor(51, 30, 50).setTextColor(ChatFormatting.DARK_PURPLE);

    public static final ComponentBase WHITE_TULIP =
            new ComponentWhiteTulip().setPrimaryColor(255, 255, 255).setSecondaryColor(136, 252, 255).setTextColor(ChatFormatting.AQUA);

    public static final ComponentBase RED_TULIP =
            new ComponentRedTulip().setPrimaryColor(128, 16, 16).setSecondaryColor(128, 16, 64).setTextColor(ChatFormatting.DARK_RED);

    public static final ComponentBase POPPY =
            new ComponentPoppy().setPrimaryColor(255, 0, 0).setSecondaryColor(50, 50, 50).setTextColor(ChatFormatting.RED);

    public static final ComponentBase BLUE_ORCHID =
            new ComponentBlueOrchid().setPrimaryColor(68, 39, 26).setSecondaryColor(162, 153, 150).setTextColor(ChatFormatting.GRAY);

    public static final ComponentBase POISONOUS_POTATO =
            new ComponentPoisonousPotato().setPrimaryColor(172, 255, 81).setSecondaryColor(81, 181, 255).setTextColor(ChatFormatting.YELLOW);

    public static final ComponentBase ORANGE_TULIP =
            new ComponentOrangeTulip().setPrimaryColor(255, 181, 70).setSecondaryColor(255, 255, 0).setTextColor(ChatFormatting.GOLD);

    public static final ComponentBase PINK_TULIP =
            new ComponentPinkTulip().setPrimaryColor(255, 0, 51).setSecondaryColor(255, 0, 249).setTextColor(ChatFormatting.LIGHT_PURPLE);

    public static final ComponentBase OXEYE_DAISY =
            new ComponentOxeyeDaisy().setPrimaryColor(255, 254, 206).setSecondaryColor(52, 0, 74).setTextColor(ChatFormatting.WHITE);

    public static final ComponentBase LILY_PAD =
            new ComponentLilyPad().setPrimaryColor(36, 255, 167).setSecondaryColor(8, 0, 255).setTextColor(ChatFormatting.BLUE);

    public static final ComponentBase APPLE =
            new ComponentApple().setPrimaryColor(255, 43, 89).setSecondaryColor(255, 43, 43).setTextColor(ChatFormatting.DARK_RED);

    public static final ComponentBase MIDNIGHT_BLOOM =
            new ComponentMidnightBloom().setPrimaryColor(12, 6, 36).setSecondaryColor(18, 18, 18).setTextColor(ChatFormatting.DARK_PURPLE);

    public static final ComponentBase FLARE_ORCHID =
            new ComponentFlareOrchid().setPrimaryColor(255, 60, 18).setSecondaryColor(255, 60, 18).setTextColor(ChatFormatting.RED);

    public static final ComponentBase RADIANT_DAISY =
            new ComponentRadiantDaisy().setPrimaryColor(255, 255, 255).setSecondaryColor(255, 255, 255).setTextColor(ChatFormatting.WHITE);

    public static void register() {
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "rose_bush"), ROSE_BUSH);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "dandelion"), DANDELION);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "chorus"), CHORUS);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "nether_wart"), NETHER_WART);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "peony"), PEONY);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "sunflower"), SUNFLOWER);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "lilac"), LILAC);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "azure_bluet"), AZURE_BLUET);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "allium"), ALLIUM);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "white_tulip"), WHITE_TULIP);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "red_tulip"), RED_TULIP);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "poppy"), POPPY);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "blue_orchid"), BLUE_ORCHID);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "poisonous_potato"), POISONOUS_POTATO);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "orange_tulip"), ORANGE_TULIP);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "pink_tulip"), PINK_TULIP);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "oxeye_daisy"), OXEYE_DAISY);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "lily_pad"), LILY_PAD);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "apply"), APPLE);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "midnight_bloom"), MIDNIGHT_BLOOM);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "flare_orchid"), FLARE_ORCHID);
        Registry.register(ComponentBaseRegistry.COMPONENTS, new ResourceLocation(Const.MODID, "radiant_daisy"), RADIANT_DAISY);
    }

    /* //TODO: reject invalid stuff from the bowl??!??! the mortar??
     *
     * public static boolean isValidEffectItem(ItemStack stack) { for (int i = 0; i < components.size(); i++) { if (components.get(i).getItem() != null && stack != null) { if
     * (components.get(i).getItem().getItem() == stack.getItem() && components.get(i).getItem().getMetadata() == stack.getMetadata()) { return true; } } } return false; } */
    public static ComponentRecipe getSpellFromName(RecipeManager mgr, ResourceLocation name) {
        if (name.getNamespace().equals(Const.MODID) && name.getPath().equals("none")) {
            return null;
        }
        List<ComponentRecipe> recipes = mgr.getAllRecipesFor(RootsRecipes.COMPONENT_RECIPE_TYPE);
        for (ComponentRecipe recipe : recipes) {
            if (recipe.getEffectResult().equals(name)) {
                return recipe;
            }
        }
        return null;
    }

    public static ComponentRecipe getRecipeFromInput(Level levelAccessor, Container inventory) {
        Optional<ComponentRecipe> recipe = levelAccessor.getRecipeManager().getRecipeFor(RootsRecipes.COMPONENT_RECIPE_TYPE, inventory, levelAccessor);
        return recipe.orElse(null);
    }
}
