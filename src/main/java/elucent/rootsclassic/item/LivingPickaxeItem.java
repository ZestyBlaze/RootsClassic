package elucent.rootsclassic.item;

import elucent.rootsclassic.util.RootsUtil;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class LivingPickaxeItem extends PickaxeItem {

    public LivingPickaxeItem(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level levelAccessor, Entity entityIn, int itemSlot, boolean isSelected) {
        RootsUtil.randomlyRepair(levelAccessor.random, stack);
    }

    /*
    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }

     */

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        return false;
    }
}
