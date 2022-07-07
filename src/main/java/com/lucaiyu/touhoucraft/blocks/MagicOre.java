package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;

public class MagicOre extends OreBlock {
    //private static IntegerProperty STATE = IntegerProperty.create("dim", 0, 1);
    public MagicOre(){
        super(Properties.of(Material.STONE).strength(30.0F,1200.0F).harvestLevel(3).requiresCorrectToolForDrops());

        //this.registerDefaultState(this.stateDefinition.any().setValue(STATE, 0));
    }

    //@Override
    //protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        //builder.add(STATE);
    //}
}
