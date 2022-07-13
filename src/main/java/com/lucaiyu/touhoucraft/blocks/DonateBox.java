package com.lucaiyu.touhoucraft.blocks;
import net.minecraft.block.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DonateBox extends Block {
    public DonateBox() {
        super(Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(-1.0F, 1.0F));
    }
}
