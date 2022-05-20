package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GensokyoPortalFrameBlock extends Block {
    public GensokyoPortalFrameBlock(){
        super(Properties.of(Material.STONE).strength(3600000,3600000).sound(SoundType.STONE));
    }

}
