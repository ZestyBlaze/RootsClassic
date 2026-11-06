package elucent.rootsclassic.internal;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;

/**
 * Copy of the class from Porting-Lib
 * <a href="https://github.com/Fabricators-of-Create/Porting-Lib/blob/2eb4bf42a9f8a69ba86b468ae7ce8847b5df6c48/base/src/main/java/io/github/fabricators_of_create/porting_lib/event/common/LivingEntityEvents.java#L117">...</a>
 */
public class LivingHurtCallback {
    public static final Event<Hurt> ACTUALLY_HURT = EventFactory.createArrayBacked(Hurt.class, callbacks -> (source, damaged, amount) -> {
        for (Hurt callback : callbacks) {
            float newAmount = callback.onHurt(source, damaged, amount);
            if (newAmount != amount) return newAmount;
        }
        return amount;
    });

    @FunctionalInterface
    public interface Hurt {
        float onHurt(DamageSource source, LivingEntity damaged, float amount);
    }
}
