package elucent.rootsclassic.mixin.internal;

import elucent.rootsclassic.internal.IArmorTickingItem;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Inventory.class)
public class InventoryMixin {
    @Shadow @Final public Player player;

    @Inject(method = "tick", at = @At("HEAD"))
    private void roots_internal$tick(CallbackInfo ci) {
        player.getArmorSlots().forEach(stack -> {
            if (stack.getItem() instanceof IArmorTickingItem armorTickingItem) {
                armorTickingItem.onArmorTick(stack, player.level, player);
            }
        });
    }
}
