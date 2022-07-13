package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;

public class MagicOre extends OreBlock {
    //private static IntegerProperty STATE = IntegerProperty.create("dim", 0, 1);
    public MagicOre(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(30.0F,1200.0F).harvestLevel(3));

        //this.registerDefaultState(this.stateDefinition.any().setValue(STATE, 0));
    }

    //@Override
    //protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        //builder.add(STATE);
    //}
}
