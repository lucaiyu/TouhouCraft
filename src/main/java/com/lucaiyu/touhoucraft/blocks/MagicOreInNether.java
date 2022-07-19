package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MagicOreInNether extends OreBlock {
    public MagicOreInNether(){
        super(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(30.0F,1200.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE));
    }
}
