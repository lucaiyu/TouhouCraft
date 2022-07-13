package com.lucaiyu.touhoucraft.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;


public class PowerPoint extends MobEntity {
    public PowerPoint(World worldIn){
        this(null, worldIn);
    }
    public PowerPoint(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
