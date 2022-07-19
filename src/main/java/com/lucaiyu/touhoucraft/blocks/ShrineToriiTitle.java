package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraftforge.common.ToolType;

public class ShrineToriiTitle extends Block {
    private static IntegerProperty STATE = IntegerProperty.create("char", 0, 1);

    public ShrineToriiTitle() {
        super(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(5.0F,5.0F).harvestTool(ToolType.PICKAXE));

        this.setDefaultState(this.stateContainer.getBaseState().with(STATE, 1));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }
}
