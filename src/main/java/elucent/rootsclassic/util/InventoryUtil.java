package elucent.rootsclassic.util;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;

public class InventoryUtil {
    public static int getFirstEmptyStack(Container itemHandler) {
        if (itemHandler == null) return -1;
        for (int i = 0; i < itemHandler.getContainerSize(); i++) {
            if (itemHandler.getItem(i).isEmpty()) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isFull(Container itemHandler) {
        if (itemHandler == null) return true;
        for (int i = 0; i < itemHandler.getContainerSize(); i++) {
            ItemStack stack = itemHandler.getItem(i);
            if (stack.isEmpty() || (stack.getCount() < stack.getMaxStackSize())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Container itemHandler) {
        if (itemHandler == null) return true;
        for (int i = 0; i < itemHandler.getContainerSize(); i++) {
            ItemStack stack = itemHandler.getItem(i);
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static void clearInventory(Container itemHandler) {
        if (itemHandler == null) return;
        for (int i = 0; i < itemHandler.getContainerSize(); i++) {
            ItemStack stack = itemHandler.getItem(i);
            if (!stack.isEmpty()) {
                stack.shrink(1);
            }
        }
    }

    public static ItemStack getLastStack(Container itemHandler) {
        if (itemHandler == null) return ItemStack.EMPTY;
        for (int i = itemHandler.getContainerSize() - 1; i >= 0; i--) {
            ItemStack stack = itemHandler.getItem(i);
            if (!stack.isEmpty()) {
                return stack;
            }
        }
        return ItemStack.EMPTY;
    }

    public static CustomInventory createIInventory(Container itemHandler) {
        if (itemHandler == null) return null;
        CustomInventory inventory = new CustomInventory(itemHandler.getContainerSize());
        for (int i = 0; i < itemHandler.getContainerSize(); i++) {
            inventory.setItem(i, itemHandler.getItem(i));
        }
        return inventory;
    }
}
