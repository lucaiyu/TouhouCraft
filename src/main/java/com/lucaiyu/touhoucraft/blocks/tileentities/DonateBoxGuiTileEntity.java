package com.lucaiyu.touhoucraft.blocks.tileentities;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.containers.DonateBoxContainer;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class DonateBoxGuiTileEntity extends TileEntity implements ITickableTileEntity, INamedContainerProvider {
    private static final int SLOTS = 1;
    private static int power = 0;

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        power = nbt.getInt("power");
        super.read(state, nbt);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.putInt("power", power);
        return super.write(compound);
    }

    public DonateBoxGuiTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }
    public DonateBoxGuiTileEntity(){
        this(TileEntityRegistry.donate_box_gui_tile_entity.get());
    }

    @Override
    public void tick() {
        // todo
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("container." + TouHouCraft.MOD_ID + ".donate_box");
    }

    @Nullable
    @Override
    public Container createMenu(int id, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new DonateBoxContainer(id, playerInventory, this);
    }
}
