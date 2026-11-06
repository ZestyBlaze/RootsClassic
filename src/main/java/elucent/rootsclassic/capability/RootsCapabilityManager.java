package elucent.rootsclassic.capability;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.RespawnCopyStrategy;
import elucent.rootsclassic.Const;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class RootsCapabilityManager implements EntityComponentInitializer {
    public static final ComponentKey<ManaCapability> MANA_CAPABILITY = ComponentRegistryV3.INSTANCE.getOrCreate(new ResourceLocation(Const.MODID, "manacapability"), ManaCapability.class);
    public static final ComponentKey<EntityCapability> ENTITY_CAPABILITY = ComponentRegistryV3.INSTANCE.getOrCreate(new ResourceLocation(Const.MODID, "entitycapability"), EntityCapability.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(MANA_CAPABILITY, player -> new ManaCapability(), RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerFor(Entity.class, ENTITY_CAPABILITY, entity -> new EntityCapability());
    }
}
