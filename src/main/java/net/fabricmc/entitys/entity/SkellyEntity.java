package net.fabricmc.entitys.entity;

import net.fabricmc.entitys.Entitys;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class SkellyEntity extends SkeletonEntity {

    public boolean SkeletonCanSpawn = true;

    public SkellyEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 60;
    }

    public static DefaultAttributeContainer.Builder createskellyAttributes() {
        return HostileEntity.createHostileAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 60D)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25D)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 30.0D)
            .add(EntityAttributes.GENERIC_ARMOR, 2D);
    }

    @Override
    public boolean canSpawn(WorldView view) {
        BlockPos blockunderentity = new BlockPos(this.getX(), this.getY() - 1, this.getZ());
        BlockPos posentity = new BlockPos(this.getX(), this.getY(), this.getZ());
        return view.intersectsEntities(this) && this.world.isNight() && !world.containsFluid(this.getBoundingBox())
        && this.world.getBlockState(posentity).getBlock().canMobSpawnInside()
        && this.world.getBlockState(blockunderentity).allowsSpawning(view, blockunderentity, Entitys.SKELLY)
        && SkeletonCanSpawn;
        
    }
}
