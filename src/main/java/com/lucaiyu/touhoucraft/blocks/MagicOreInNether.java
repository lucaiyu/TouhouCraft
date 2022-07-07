package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;

public class MagicOreInNether extends OreBlock {
    public MagicOreInNether(){
        super(Properties.of(Material.STONE).strength(30.0F,1200.0F).harvestLevel(3).requiresCorrectToolForDrops());
    }
}
