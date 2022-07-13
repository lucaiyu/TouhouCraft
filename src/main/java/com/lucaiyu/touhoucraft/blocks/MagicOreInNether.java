package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;

public class MagicOreInNether extends OreBlock {
    public MagicOreInNether(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(30.0F,1200.0F).harvestLevel(3));
    }
}
