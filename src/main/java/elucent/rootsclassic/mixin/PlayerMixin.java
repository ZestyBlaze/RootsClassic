package elucent.rootsclassic.mixin;

import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static elucent.rootsclassic.event.ComponentSpellsEvent.tickManaRegen;
import static elucent.rootsclassic.event.ComponentSpellsEvent.wildwoodArmorRegenFullset;

@Mixin(Player.class)
public class PlayerMixin {
    @Unique private final Player player = (Player)(Object)this;

    @Inject(method = "tick", at = @At("TAIL"))
    private void roots$tick(CallbackInfo ci) {
        wildwoodArmorRegenFullset(player);
        tickManaRegen(player);
    }
}
