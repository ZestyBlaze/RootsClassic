package elucent.rootsclassic.internal;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public interface IArmorTickingItem {
    void onArmorTick(ItemStack stack, Level levelAccessor, Player player);
}
