package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;

public class ShrineToriiTitle extends Block {
    private static IntegerProperty STATE = IntegerProperty.create("char", 0, 1);

    public ShrineToriiTitle() {
        super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(5.0F,5.0F));

        this.registerDefaultState(this.stateDefinition.any().setValue(STATE, 0));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(STATE);
    }
}
