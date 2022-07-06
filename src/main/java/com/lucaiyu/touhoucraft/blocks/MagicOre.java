package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;

public class MagicOre extends OreBlock {
    private static IntegerProperty STATE = IntegerProperty.create("DIM", 0, 1);
    public MagicOre(){
        super(Properties.of(Material.STONE).strength(15,30).harvestLevel(3).requiresCorrectToolForDrops());

        this.registerDefaultState(this.stateDefinition.any().setValue(STATE, 0));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }
}
