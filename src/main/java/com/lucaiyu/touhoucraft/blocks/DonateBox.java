package com.lucaiyu.touhoucraft.blocks;
import net.minecraft.block.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DonateBox extends Block {
    public DonateBox() {
        super(Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(-1.0F, 1.0F));
    }
}
