package com.lucaiyu.touhoucraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class TouhouCrystalOre extends OreBlock {
    public TouhouCrystalOre(){
        super(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(15.0F,1200.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE));

    }
    @Override
    protected int getExperience(Random random){
        return MathHelper.nextInt(random, 2, 6);
    }
}
