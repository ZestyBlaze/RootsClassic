package elucent.rootsclassic.registry;

import elucent.rootsclassic.Const;
import elucent.rootsclassic.recipe.ComponentRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;

public class RootsRecipes {
    public static final RecipeType<ComponentRecipe> COMPONENT_RECIPE_TYPE = new RecipeType<>(){};
    public static final ComponentRecipe.SerializeComponentRecipe COMPONENT_SERIALIZER = new ComponentRecipe.SerializeComponentRecipe();

    public static void register() {
        Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(Const.MODID, "component"), COMPONENT_RECIPE_TYPE);
        Registry.register(Registry.RECIPE_SERIALIZER, new ResourceLocation(Const.MODID, "component"), COMPONENT_SERIALIZER);
    }
}
