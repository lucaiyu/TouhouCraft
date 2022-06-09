package com.lucaiyu.touhoucraft.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import org.apache.logging.log4j.LogManager;

import java.util.logging.Logger;

public class PPoint extends Entity {
    private Logger logger = (Logger) LogManager.getLogger();
    private static final DataParameter<Integer> COUNTER = EntityDataManager.defineId(PPoint.class, DataSerializers.INT);

    public PPoint(EntityType<?> entityTypeIn, World worldIn) {
        super(entityTypeIn, worldIn);

    }

    @Override
    protected void defineSynchedData() {
        this.entityData.define(COUNTER, 0);
    }

    @Override
    protected void readAdditionalSaveData(CompoundNBT compound) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT compound) {

    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public void tick() {
        if (world.isRemote) {
            logger.info(this.entityData.get(COUNTER));
        }
        if (!world.isRemote) {
            logger.info(this.entityData(COUNTER));
            this.entityData.set(COUNTER, this.entityData.get(COUNTER) + 1);
        }
        super.tick();
    }



}
