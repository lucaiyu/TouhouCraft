package com.lucaiyu.touhoucraft.tileEntities;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;

public class GUITileEntity extends LockableTileEntity {
    public static int slots = 2;
    protected NonNullList<ItemStack> stacks = NonNullList.withSize(slots, ItemStack.EMPTY);
    protected GUITileEntity(TileEntityType<?>, typeIn) {
        super(typeIn);
    }
    public GUITileEntity(){
        this()
    }
}
