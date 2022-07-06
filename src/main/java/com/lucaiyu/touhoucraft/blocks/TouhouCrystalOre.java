package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class TouhouCrystalOre extends OreBlock {
    private static IntegerProperty STATE = IntegerProperty.create("DIM", 0, 1);
    public TouhouCrystalOre(){
        super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(5.0F,6.0F).harvestLevel(3).requiresCorrectToolForDrops());

        this.registerDefaultState(this.stateDefinition.any().setValue(STATE, 0));
    }
    @Override
    protected int xpOnDrop(Random random){
        return MathHelper.nextInt(random, 2, 6);
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }
}
