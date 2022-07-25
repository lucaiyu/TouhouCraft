package com.lucaiyu.touhoucraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MagicOre extends OreBlock {
    public MagicOre() {
        super(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(30.0F, 1200.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE));
    }
}
