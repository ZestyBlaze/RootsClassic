package elucent.rootsclassic.registry;

import elucent.rootsclassic.Const;
import elucent.rootsclassic.client.particles.factory.MagicParticleType;
import elucent.rootsclassic.client.particles.factory.MagicParticleTypeData;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.resources.ResourceLocation;

public class ParticleRegistry {
    public static final ParticleType<MagicParticleTypeData> MAGIC_TYPE = new MagicParticleType();
    public static final ParticleType<MagicParticleTypeData> MAGIC_AURA_TYPE = new MagicParticleType();
    public static final ParticleType<MagicParticleTypeData> MAGIC_ALTAR_TYPE = new MagicParticleType();
    public static final ParticleType<MagicParticleTypeData> MAGIC_ALTAR_LINE_TYPE = new MagicParticleType();
    public static final ParticleType<MagicParticleTypeData> MAGIC_LINE_TYPE = new MagicParticleType();

    public static void register() {
        Registry.register(Registry.PARTICLE_TYPE, new ResourceLocation(Const.MODID, "magic"), MAGIC_TYPE);
        Registry.register(Registry.PARTICLE_TYPE, new ResourceLocation(Const.MODID, "magic_aura"), MAGIC_AURA_TYPE);
        Registry.register(Registry.PARTICLE_TYPE, new ResourceLocation(Const.MODID, "magic_altar"), MAGIC_ALTAR_TYPE);
        Registry.register(Registry.PARTICLE_TYPE, new ResourceLocation(Const.MODID, "magic_altar_line"), MAGIC_ALTAR_LINE_TYPE);
        Registry.register(Registry.PARTICLE_TYPE, new ResourceLocation(Const.MODID, "magic_line"), MAGIC_LINE_TYPE);
    }
}
