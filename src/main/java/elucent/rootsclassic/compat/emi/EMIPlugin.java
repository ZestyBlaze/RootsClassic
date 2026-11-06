package elucent.rootsclassic.compat.emi;

/*
public class EMIPlugin implements EmiPlugin {
	private static final EmiStack MORTAR_WORKSTATION = EmiStack.of(RootsRegistry.MORTAR);
	public static final EmiRecipeCategory MORTAR = new EmiRecipeCategory(
			new ResourceLocation("roots", "mortar"),
			MORTAR_WORKSTATION
	);
	
	private static final EmiStack RITUAL_WORKSTATION = EmiStack.of(RootsRegistry.ALTAR);
	public static final EmiRecipeCategory RITUAL = new EmiRecipeCategory(
			new ResourceLocation("roots", "ritual"),
			RITUAL_WORKSTATION
	);
	
	@Override
	public void register(EmiRegistry registry) {
		RecipeManager manager = registry.getRecipeManager();
		
		// Mortar Recipe Type
		registry.addCategory(MORTAR);
		registry.addWorkstation(MORTAR, MORTAR_WORKSTATION);
		manager.getAllRecipesFor(RootsRecipes.COMPONENT_RECIPE_TYPE).forEach((r) -> registry.addRecipe(new MortarRecipe(r)));
		
		// Ritual Recipe Type
		registry.addCategory(RITUAL);
		registry.addWorkstation(RITUAL, RITUAL_WORKSTATION);
		RitualRegistry.RITUALS.getEntries().forEach((ritual) -> registry.addRecipe(new RitualRecipe(ritual.getId(), ritual)));
		
		// Information pages
		RootsRegistry.ITEMS.getEntries().forEach((registryObject) -> {
			Item item = registryObject;
			if (item != null) {
				List<EmiIngredient> stacks = List.of(EmiIngredient.of(Ingredient.of(new ItemStack(item))));
				List<Component> text = List.of(Component.translatable(item.getDescriptionId() + ".guide"));
				registry.addRecipe(new EmiInfoRecipe(stacks, text, null));
			}
		});
	}
}

 */
