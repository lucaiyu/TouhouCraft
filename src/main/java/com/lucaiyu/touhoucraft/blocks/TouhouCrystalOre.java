package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class TouhouCrystalOre extends OreBlock {
    //private static IntegerProperty STATE = IntegerProperty.create("dim", 0, 1);
    public TouhouCrystalOre(){
        super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(15.0F,1200.0F).harvestLevel(3));

        //this.registerDefaultState(this.stateDefinition.any().setValue(STATE, 0));
    }
    @Override
    protected int getExperience(Random random){
        return MathHelper.nextInt(random, 2, 6);
    }

    //@Override
    //protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        //builder.add(STATE);
    //}
}
