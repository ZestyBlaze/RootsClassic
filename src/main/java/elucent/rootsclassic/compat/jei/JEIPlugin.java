package elucent.rootsclassic.compat.jei;

import elucent.rootsclassic.Const;
import elucent.rootsclassic.compat.jei.category.MortarCategory;
import elucent.rootsclassic.compat.jei.category.RitualCategory;
import elucent.rootsclassic.compat.jei.wrapper.RitualWrapper;
import elucent.rootsclassic.recipe.ComponentRecipe;
import elucent.rootsclassic.registry.RootsRecipes;
import elucent.rootsclassic.registry.RootsRegistry;
import elucent.rootsclassic.ritual.RitualBaseRegistry;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.helpers.IJeiHelpers;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIPlugin implements IModPlugin {

    public static final ResourceLocation PLUGIN_UID = new ResourceLocation(Const.MODID, "main");

    public static final ResourceLocation MORTAR = new ResourceLocation(Const.MODID, "mortar");
    public static final RecipeType<ComponentRecipe> MORTAR_TYPE = RecipeType.create(Const.MODID, "mortar", ComponentRecipe.class);

    public static final ResourceLocation RITUAL = new ResourceLocation(Const.MODID, "ritual");
    public static final RecipeType<RitualWrapper> RITUAL_TYPE = RecipeType.create(Const.MODID, "ritual", RitualWrapper.class);

    @Nullable
    private IRecipeCategory<ComponentRecipe> mortarCategory;
    @Nullable
    private IRecipeCategory<RitualWrapper> ritualCategory;

    @Override
    public ResourceLocation getPluginUid() {
        return PLUGIN_UID;
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(RootsRegistry.MORTAR), MORTAR_TYPE);
        registration.addRecipeCatalyst(new ItemStack(RootsRegistry.ALTAR), RITUAL_TYPE);
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IJeiHelpers jeiHelpers = registration.getJeiHelpers();
        IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
        registration.addRecipeCategories(
                mortarCategory = new MortarCategory(guiHelper),
                ritualCategory = new RitualCategory(guiHelper)
        );
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        for (Item registryObject : Registry.ITEM.stream().filter(item -> Registry.ITEM.getKey(item).getNamespace().equals(Const.MODID)).toList()) {
            if (registryObject != null) {
                registration.addIngredientInfo(new ItemStack(registryObject), VanillaTypes.ITEM_STACK, Component.translatable(registryObject.getDescriptionId() + ".guide"));
            }
        }

        ClientLevel world = Objects.requireNonNull(Minecraft.getInstance().level);
        registration.addRecipes(MORTAR_TYPE, world.getRecipeManager().getAllRecipesFor(RootsRecipes.COMPONENT_RECIPE_TYPE));
        registration.addRecipes(RITUAL_TYPE, getRituals());
    }

    public List<RitualWrapper> getRituals() {
        List<RitualWrapper> entries = new LinkedList<>();

        RitualBaseRegistry.RITUALS.stream().iterator().forEachRemaining(ritualBase -> entries.add(new RitualWrapper(ritualBase)));

        return entries;
    }
}
