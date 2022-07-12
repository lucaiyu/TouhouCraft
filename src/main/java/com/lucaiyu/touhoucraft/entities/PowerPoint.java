package com.lucaiyu.touhoucraft.entities;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;


public class PowerPoint extends CreatureEntity {
    public PowerPoint(World worldIn){
        this(null, worldIn);
    }
    public PowerPoint(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
