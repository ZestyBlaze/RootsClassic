package elucent.rootsclassic.blockentity;

import elucent.rootsclassic.client.particles.MagicAuraParticleData;
import elucent.rootsclassic.registry.RootsRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class HealerStandingStone extends BEBase {
    private static final int RADIUS = 10;
    private static final int PTN_SECONDS = 25;
    private int ticker = 0;

    public HealerStandingStone(BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tileEntityTypeIn, pos, state);
    }

    public HealerStandingStone(BlockPos pos, BlockState state) {
        this(RootsRegistry.HEALER_STANDING_STONE_TILE.get(), pos, state);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
    }

    @Override
    public void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, HealerStandingStone tile) {
        tile.ticker++;
        if (tile.ticker % 20 == 0) {
            List<LivingEntity> nearbyCreatures = level.getEntitiesOfClass(LivingEntity.class,
                    new AABB(pos.getX() - RADIUS, pos.getY() - RADIUS, pos.getZ() - RADIUS,
                            pos.getX() + RADIUS, pos.getY() + RADIUS, pos.getZ() + RADIUS));
            for (LivingEntity nearbyCreature : nearbyCreatures) {
                nearbyCreature.addEffect(new MobEffectInstance(MobEffects.REGENERATION, PTN_SECONDS * 20, 1));
            }
        }
        if (tile.ticker >= 2000) {
            tile.ticker = 0;
        }
    }

    public static void clientTick(Level level, BlockPos pos, BlockState state, HealerStandingStone tile) {
        tile.ticker++;
        if (tile.ticker % 5 == 0 && level.isClientSide) {
            for (double i = 0; i < 720; i += 45.0) {
                double xShift = 0.5 * Math.sin(Math.PI * (i / 360.0));
                double zShift = 0.5 * Math.cos(Math.PI * (i / 360.0));
                level.addParticle(MagicAuraParticleData.createData(255, 32, 32),
                        pos.getX() + 0.5 + xShift, pos.getY() + 0.5, pos.getZ() + 0.5 + zShift, 0, 0, 0);
            }
        }
        if (tile.ticker >= 2000) {
            tile.ticker = 0;
        }
    }
}
