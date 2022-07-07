package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;

import java.util.Random;


public class TouhouCrystalOreInNether extends OreBlock {
    public TouhouCrystalOreInNether(){
        super(Properties.of(Material.STONE).strength(15.0F,1200.0F).harvestLevel(3).requiresCorrectToolForDrops());
    }
    @Override
    protected int xpOnDrop(Random random){
        return MathHelper.nextInt(random, 2,6);
    }
}
