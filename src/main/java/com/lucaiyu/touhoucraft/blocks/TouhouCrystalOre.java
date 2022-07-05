package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class TouhouCrystalOre extends OreBlock {
    public TouhouCrystalOre(){
        super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(5.0F,6.0F).harvestTool(ToolType.PICKAXE));
    }
    @Override
    protected int xpOnDrop(Random random){
        return MathHelper.nextInt(random, 2, 6);
    }
}
