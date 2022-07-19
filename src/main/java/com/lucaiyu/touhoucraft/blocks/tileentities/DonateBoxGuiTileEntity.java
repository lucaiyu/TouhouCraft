package com.lucaiyu.touhoucraft.blocks.tileentities;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DonateBoxGuiTileEntity extends TileEntity implements ITickableTileEntity {
    private static final int SLOTS = 1;
    private static int power = 0;
    private final ItemStackHandler UP = new ItemStackHandler(1){
        @Override
        protected void onContentsChanged(int slot) {
            DonateBoxGuiTileEntity.this.markDirty();
        }
    };

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        this.UP.deserializeNBT(nbt.getCompound("UP"));
        super.read(state, nbt);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.put("UP",this.UP.serializeNBT());
        return super.write(compound);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return super.getCapability(cap, side);
    }

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
