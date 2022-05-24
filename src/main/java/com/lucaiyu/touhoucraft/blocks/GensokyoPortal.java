package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GensokyoPortal extends Block {
    public GensokyoPortal(){
        super(Properties.of(Material.STONE).strength(30,120).harvestLevel(3));
    }
}
