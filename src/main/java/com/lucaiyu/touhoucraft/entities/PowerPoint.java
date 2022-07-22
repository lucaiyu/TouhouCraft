package com.lucaiyu.touhoucraft.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;


public class PowerPoint extends Entity {

    public PowerPoint(World worldIn) {
        this(null, worldIn);
    }

    public PowerPoint(EntityType<? extends Entity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerData() {
    }

    @Override
    protected void readAdditional(CompoundNBT compound) {
    }

    @Override
    protected void writeAdditional(CompoundNBT compound) {

    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public void tick() {
        super.tick();
    }
}
