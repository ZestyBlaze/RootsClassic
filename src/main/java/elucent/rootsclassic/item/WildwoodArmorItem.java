package elucent.rootsclassic.item;

import elucent.rootsclassic.internal.IArmorTickingItem;
import elucent.rootsclassic.util.RootsUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WildwoodArmorItem extends ArmorItem implements IArmorTickingItem {
    public WildwoodArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Item.Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level levelAccessor, Player player) {
        RootsUtil.randomlyRepair(levelAccessor.random, stack);
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        return false;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level levelAccessor, List<Component> tooltip, TooltipFlag flagIn) {
        super.appendHoverText(stack, levelAccessor, tooltip, flagIn);
        tooltip.add(Component.empty());
        tooltip.add(Component.translatable("rootsclassic.attribute.equipped").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable(" ").append(Component.translatable("rootsclassic.attribute.increasedmanaregen")).withStyle(ChatFormatting.BLUE));
    }
}
