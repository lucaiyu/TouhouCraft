package com.lucaiyu.touhoucraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Random;


public class TouhouCrystalOreInNether extends OreBlock {
    public TouhouCrystalOreInNether(){
        super(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(15.0F,1200.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE));
    }
    @Override
    protected int getExperience(Random random){
        return MathHelper.nextInt(random, 2,6);
    }
}
