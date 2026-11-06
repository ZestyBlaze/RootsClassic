package elucent.rootsclassic.registry;

import elucent.rootsclassic.Const;
import elucent.rootsclassic.entity.EntityAccelerator;
import elucent.rootsclassic.entity.EntityTileAccelerator;
import elucent.rootsclassic.entity.skeleton.PhantomSkeletonEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;

public class RootsEntities {
    public static final EntityType<PhantomSkeletonEntity> PHANTOM_SKELETON = register("phantom_skeleton", EntityType.Builder.<PhantomSkeletonEntity>of(PhantomSkeletonEntity::new, MobCategory.MONSTER)
            .sized(0.6F, 1.99F).clientTrackingRange(6));
    public static final EntityType<EntityAccelerator> ENTITY_ACCELERATOR = register("entity_accelerator", EntityType.Builder.<EntityAccelerator>of(EntityAccelerator::new, MobCategory.MISC)
            .sized(0.5F, 0.5F).clientTrackingRange(64).updateInterval(20));
    public static final EntityType<EntityTileAccelerator> TILE_ACCELERATOR = register("tile_accelerator", EntityType.Builder.<EntityTileAccelerator>of(EntityTileAccelerator::new, MobCategory.MISC)
            .sized(0.5F, 0.5F).clientTrackingRange(64).updateInterval(20));

    public static void register() {
        Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(Const.MODID, "phantom_skeleton"), PHANTOM_SKELETON);
        Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(Const.MODID, "entity_accelerator"), ENTITY_ACCELERATOR);
        Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(Const.MODID, "tile_accelerator"), TILE_ACCELERATOR);
    }

    public static void registerSpawnPlacement() {
        SpawnPlacements.register(RootsEntities.PHANTOM_SKELETON, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
    }

    public static void registerEntityAttributes() {
        FabricDefaultAttributeRegistry.register(RootsEntities.PHANTOM_SKELETON, PhantomSkeletonEntity.registerAttributes());
    }

    public static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
        return builder.build(id);
    }
}
