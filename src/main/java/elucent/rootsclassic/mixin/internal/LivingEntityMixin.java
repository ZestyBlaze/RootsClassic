package elucent.rootsclassic.mixin.internal;

import elucent.rootsclassic.internal.LivingHurtCallback;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @ModifyVariable(method = "actuallyHurt", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    private float roots_internal$actuallyHurt(float damageAmount, DamageSource source, float i) {
        return LivingHurtCallback.ACTUALLY_HURT.invoker().onHurt(source, (LivingEntity)(Object)this, damageAmount);
    }
}
