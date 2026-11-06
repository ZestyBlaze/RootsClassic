package elucent.rootsclassic.registry;

import elucent.rootsclassic.internal.CommonTier;
import net.minecraft.world.item.Tier;

public class RootsItemTier {
    public static final Tier LIVING = new CommonTier(2, 192, 6.0f, 2.0f, 18,
                    () -> null);
    public static final Tier ENGRAVED = new CommonTier(2, 1050, 5F, 8.0F, 5,
                    () -> null);
}
