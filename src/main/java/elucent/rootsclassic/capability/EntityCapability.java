package elucent.rootsclassic.capability;

import net.minecraft.nbt.CompoundTag;

public class EntityCapability implements IEntityCapability {
    private CompoundTag extraData;

    @Override
    public CompoundTag getExtraData() {
        if (extraData == null)
            extraData = new CompoundTag();
        return this.extraData;
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        this.extraData = (CompoundTag) tag.get("extraData");
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        tag.put("extraData", getExtraData());
    }
}
