package elucent.rootsclassic.block.mortar;

import elucent.rootsclassic.blockentity.BEBase;
import elucent.rootsclassic.recipe.ComponentRecipe;
import elucent.rootsclassic.registry.RootsRecipes;
import elucent.rootsclassic.registry.RootsRegistry;
import elucent.rootsclassic.util.InventoryUtil;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MortarBlockEntity extends BEBase {
    public final SimpleContainer inventory = new SimpleContainer(8) {
        @Override
        public int getMaxStackSize() {
            return 1;
        }

        @Override
        public void setChanged() {
            super.setChanged();
            calculateRotations();
        }
    };
    public final InventoryStorage inventoryWrapper = InventoryStorage.of(inventory, null);

    public MortarBlockEntity(BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tileEntityTypeIn, pos, state);
    }

    public MortarBlockEntity(BlockPos pos, BlockState state) {
        this(RootsRegistry.MORTAR_TILE, pos, state);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        inventory.fromTag(nbt.getList("InventoryHandler", Tag.TAG_COMPOUND));
    }

    @Override
    public void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.put("InventoryHandler", inventory.createTag());
    }

    @Override
    public void breakBlock(Level levelAccessor, BlockPos pos, BlockState state, Player player) {
        dropAllItems(levelAccessor, pos);
        this.setRemoved();
    }

    @Override
    public InteractionResult activate(Level levelAccessor, BlockPos pos, BlockState state, Player player, InteractionHand hand, ItemStack heldItem, BlockHitResult hit) {
        if (hand == InteractionHand.MAIN_HAND) {
            if (heldItem.isEmpty()) {
                return tryDropSingleItem(levelAccessor, pos, state);
            } else if (heldItem.getItem() == RootsRegistry.PESTLE) {
                return tryActivateRecipe(player, state);
            } else {
                return tryInsertItem(levelAccessor, pos, state, heldItem);
            }
        }
        return InteractionResult.PASS;
    }

    private InteractionResult tryInsertItem(Level levelAccessor, BlockPos pos, BlockState state, ItemStack heldItem) {
        if (!heldItem.isEmpty() && !InventoryUtil.isFull(inventory)) {
            ItemStack heldCopy = heldItem.copy();
            heldCopy.setCount(1);
            if (heldItem.getItem() == Items.GLOWSTONE_DUST || heldItem.getItem() == Items.REDSTONE || heldItem.getItem() == Items.GUNPOWDER) {
                int maxCapacity = ComponentRecipe.getModifierCapacity(InventoryUtil.createIInventory(inventory));
                int modifierCount = ComponentRecipe.getModifierCount(InventoryUtil.createIInventory(inventory));

                if(modifierCount < maxCapacity) {
                    if(heldItem.isEmpty()) {
                        return InteractionResult.PASS;
                    }
                    try (Transaction transaction = Transaction.openOuter()) {
                        long inserted = inventoryWrapper.insert(ItemVariant.of(heldItem), 1, transaction);
                        if (inserted == 1) {
                            heldItem.shrink(1);
                            setChanged();
                            levelAccessor.sendBlockUpdated(pos, state, levelAccessor.getBlockState(pos), 3);
                            transaction.commit();
                        }
                        return InteractionResult.SUCCESS;
                    }
                }
            } else {
                try (Transaction t = Transaction.openOuter()) {
                    long inserted = inventoryWrapper.insert(ItemVariant.of(heldItem), 1, t);
                    if (inserted == 1) {
                        heldItem.shrink(1);
                        setChanged();
                        levelAccessor.sendBlockUpdated(pos, state, levelAccessor.getBlockState(pos), 3);
                        t.commit();
                    } else {
                        return InteractionResult.FAIL;
                    }
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return InteractionResult.PASS;
    }

    private InteractionResult tryDropSingleItem(Level levelAccessor, BlockPos pos, BlockState state) {
        if (!InventoryUtil.isEmpty(inventory)) {
            ItemStack lastStack = InventoryUtil.getLastStack(inventory);
            if (!lastStack.isEmpty()) {
                dropItem(lastStack, 0.5F);
                lastStack.shrink(1);
            }
            setChanged();
            levelAccessor.sendBlockUpdated(getBlockPos(), state, levelAccessor.getBlockState(pos), 3);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    private InteractionResult tryActivateRecipe(Player player, BlockState state) {
        ComponentRecipe recipe = level.getRecipeManager().getRecipeFor(RootsRecipes.COMPONENT_RECIPE_TYPE, InventoryUtil.createIInventory(inventory), level).orElse(null);
        if (recipe == null) {
            player.displayClientMessage(Component.translatable("rootsclassic.mortar.invalid"), true);
            return InteractionResult.PASS;
        } else if (recipe.needsMixin() && ComponentRecipe.getModifierCapacity(InventoryUtil.createIInventory(inventory)) < 0) {
            player.displayClientMessage(Component.translatable("rootsclassic.mortar.mixin"), true);
            return InteractionResult.PASS;
        }
        if (!level.isClientSide) {
            level.addFreshEntity(new ItemEntity(level, getBlockPos().getX() + 0.5, getBlockPos().getY() + 0.5, getBlockPos().getZ() + 0.5, recipe.assemble(InventoryUtil.createIInventory(inventory))));
        }
        InventoryUtil.clearInventory(inventory);
        setChanged();
        level.sendBlockUpdated(getBlockPos(), state, level.getBlockState(worldPosition), 3);
        return InteractionResult.SUCCESS;
    }

    public void dropItem(ItemStack stack, float offsetY) {
        ItemStack copyStack = stack.copy();
        if (level.isClientSide) {
            return;
        } else {
            BlockPos pos = getBlockPos();
            ItemEntity itementity = new ItemEntity(this.level, pos.getX(), pos.getY() + (double) offsetY, this.worldPosition.getZ(), copyStack);
            itementity.setDefaultPickUpDelay();
            this.level.addFreshEntity(itementity);
        }
    }

    private void dropAllItems(Level levelAccessor, BlockPos pos) {
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            ItemStack stack = inventory.getItem(i);
            dropItem(stack, 0F);
        }
    }

    private void calculateRotations() {
        for (int i = 0; i < inventory.getContainerSize(); i++) {
            ItemStack stack = inventory.getItem(i);
            if (!stack.isEmpty()) {
            }
        }
    }
}
