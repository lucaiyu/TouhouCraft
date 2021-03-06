package com.lucaiyu.touhoucraft.container;

import com.lucaiyu.touhoucraft.init.BlockInit;
import com.lucaiyu.touhoucraft.init.ContainerInit;
import com.lucaiyu.touhoucraft.tile.DonateBoxGuiTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import java.util.Objects;

public class DonateBoxContainer extends Container {
    public final DonateBoxGuiTileEntity tileentity;
    private final IWorldPosCallable ableToInteract;
    private final LazyOptional<IItemHandler> UP;
    public DonateBoxContainer(final int id, final PlayerInventory playerInventory, final DonateBoxGuiTileEntity entity){
        super(ContainerInit.donate_box_container.get(), id);
        this.tileentity = entity;
        this.ableToInteract = IWorldPosCallable.of(tileentity.getWorld(), tileentity.getPos());
        this.UP = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.UP);
        this.UP.ifPresent((s)->{
            this.addSlot(new SlotItemHandler(s, 0, 80, 32));
        });
        for (int i = 0;i < 8; i++) {
            this.addSlot(new Slot(playerInventory,i,i*18+8,152));
            this.addSlot(new Slot(playerInventory,i+9,i*18+8,94));
            this.addSlot(new Slot(playerInventory,i+18,i*18+8,112));
            this.addSlot(new Slot(playerInventory,i+27,i*18+8,130));
        }
    }

    public DonateBoxContainer(final int id, final PlayerInventory playerInventory, final PacketBuffer data) {
        this(id, playerInventory,getTileEntity(playerInventory, data));

    }
    public static DonateBoxGuiTileEntity getTileEntity(PlayerInventory playerInventory, PacketBuffer data){
        Objects.requireNonNull(playerInventory, "player inventory couldn't be null!");
        Objects.requireNonNull(data, "Packet buffer counldn't be null!");
        BlockPos blockPos = data.readBlockPos();
        TileEntity tileEntity = playerInventory.player.world.getTileEntity(blockPos);

        if(tileEntity instanceof DonateBoxGuiTileEntity){
            return ((DonateBoxGuiTileEntity) tileEntity);
        }
        throw new IllegalStateException("Invalid tile entity!");
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(ableToInteract, playerIn, BlockInit.donate_box.get());
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        return ItemStack.EMPTY;
    }
}
