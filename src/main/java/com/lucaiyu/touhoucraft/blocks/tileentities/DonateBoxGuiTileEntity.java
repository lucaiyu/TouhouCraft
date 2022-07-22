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
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DonateBoxGuiTileEntity extends TileEntity implements ITickableTileEntity, INamedContainerProvider {
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
        power = nbt.getInt("power");
        super.read(state, nbt);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.putInt("power", power);
        return super.write(compound);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        Capability<IItemHandler> iItemHandlerCapability = CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
        if (iItemHandlerCapability.equals(cap)){
            if (Direction.UP.equals(side)){
                return LazyOptional.of(()->this.UP).cast();
            }
        }
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
