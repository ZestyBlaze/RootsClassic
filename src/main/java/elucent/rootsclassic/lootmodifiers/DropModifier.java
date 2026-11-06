package elucent.rootsclassic.lootmodifiers;

/*
public class DropModifier {

    public static final LazyRegistrar<Codec<? extends IGlobalLootModifier>> GLM = LazyRegistrar.create(PortingLibRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Const.MODID);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ROOTSCLASSIC_DROPS = GLM.register("rootsclassic_drops", BlockDropModifier.CODEC);

    public static class BlockDropModifier extends LootModifier {
        public static final Supplier<Codec<BlockDropModifier>> CODEC = Suppliers.memoize(() ->
                RecordCodecBuilder.create(inst -> codecStart(inst).apply(inst, BlockDropModifier::new)));

        public BlockDropModifier(LootItemCondition[] lootConditions) {
            super(lootConditions);
        }

        @NotNull
        @Override
        protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
            if (context.hasParam(LootContextParams.BLOCK_STATE)) {
                BlockState state = context.getParamOrNull(LootContextParams.BLOCK_STATE);
                Block block = state.getBlock();
                RandomSource rand = context.getRandom();
                if (block instanceof TallGrassBlock) {
                    if (RootsConfig.COMMON.oldRootDropChance.get() > 0 && rand.nextInt(RootsConfig.COMMON.oldRootDropChance.get()) == 0) {
                        generatedLoot.add(new ItemStack(RootsRegistry.OLD_ROOT.get(), 1));
                    }
                }
                if (block == Blocks.WHEAT || block == Blocks.CARROTS || block == Blocks.POTATOES || block == Blocks.BEETROOTS) {
                    if (((CropBlock) block).isMaxAge(state)) {
                        if (RootsConfig.COMMON.verdantSprigDropChance.get() > 0 && rand.nextInt(RootsConfig.COMMON.verdantSprigDropChance.get()) == 0) {
                            generatedLoot.add(new ItemStack(RootsRegistry.VERDANT_SPRIG.get(), 1));
                        }
                    }
                }
                if (block == Blocks.NETHER_WART) {
                    if (state.getValue(NetherWartBlock.AGE) == 3) {
                        if (RootsConfig.COMMON.infernalStemDropChance.get() > 0 && rand.nextInt(RootsConfig.COMMON.infernalStemDropChance.get()) == 0) {
                            generatedLoot.add(new ItemStack(RootsRegistry.INFERNAL_BULB.get(), 1));
                        }
                    }
                }
                if (block == Blocks.CHORUS_FLOWER) {
                    if (RootsConfig.COMMON.dragonsEyeDropChance.get() > 0 && rand.nextInt(RootsConfig.COMMON.dragonsEyeDropChance.get()) == 0) {
                        generatedLoot.add(new ItemStack(RootsRegistry.DRAGONS_EYE.get(), 1));
                    }
                }
                if (block instanceof LeavesBlock) {
                    if (!generatedLoot.stream().anyMatch((stack) -> stack.getItem() instanceof BlockItem && ((BlockItem) stack.getItem()).getBlock() == block)) {
                        if (RootsConfig.COMMON.berriesDropChance.get() > 0 && rand.nextInt(RootsConfig.COMMON.berriesDropChance.get()) == 0) {
                            Item berry;
                            berry = getRandomBerryTagEntry();

                            generatedLoot.add(new ItemStack(berry));
                        }
                    }
                }
            }
            return generatedLoot;
        }

        @Override
        public Codec<? extends IGlobalLootModifier> codec() {
            return ROOTSCLASSIC_DROPS.get();
        }

        public static Item getRandomBerryTagEntry() {
            List<Item> list = new ArrayList<>();
            Registry.ITEM.getTagOrEmpty(RootsTags.BERRIES).forEach(itemHolder -> list.add(itemHolder.value()));
            int rand = new Random().nextInt(list.size());
            return list.get(rand);
        }
    }
}

 */
