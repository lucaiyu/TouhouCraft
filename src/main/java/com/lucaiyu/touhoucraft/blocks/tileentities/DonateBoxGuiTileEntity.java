package com.lucaiyu.touhoucraft.blocks.tileentities;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class DonateBoxGuiTileEntity extends TileEntity implements ITickableTileEntity {
    public DonateBoxGuiTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }
    public DonateBoxGuiTileEntity(){
        this(TileEntityRegistry.donate_box_gui_tile_entity.get());
    }

    @Override
    public void tick() {
        System.out.println("Ticking");
    }
}
