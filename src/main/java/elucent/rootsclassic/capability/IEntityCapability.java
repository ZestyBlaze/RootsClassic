package elucent.rootsclassic.capability;

import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import net.minecraft.nbt.CompoundTag;

public interface IEntityCapability extends ComponentV3 {
    CompoundTag getExtraData();
}
