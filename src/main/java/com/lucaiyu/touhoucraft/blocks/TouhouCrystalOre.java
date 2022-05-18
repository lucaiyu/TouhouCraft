package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TouhouCrystalOre extends Block {
    public TouhouCrystalOre(){
        super(Properties.of(Material.STONE).strength(5,10).sound(SoundType.STONE));
    }
}
