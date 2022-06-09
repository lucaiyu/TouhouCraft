package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagicOre extends Block {
    public MagicOre(){
        super(Properties.of(Material.STONE).strength(15,30).harvestLevel(2));
    }
}
