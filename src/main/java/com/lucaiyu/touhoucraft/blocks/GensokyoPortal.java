package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class GensokyoPortal extends Block {
    public GensokyoPortal(){
        super(Properties.of(Material.STONE).strength(30,120).harvestLevel(3));
    }
    @Override
    public boolean hasTileEntity(BlockState state){
        return true;
    }

    //@Nullable
    //@Override
    //public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        //return new GensokyoPortalTileEntity();
    //}
    //@Override
    //public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
    //    if (!worldIn.isRemote && handIn == Hand.MAIN_HAND) {
    //        ObsidianCounterTileEntity obsidianCounterTileEntity = (ObsidianCounterTileEntity) worldIn.getTileEntity(pos);
    //        int counter = obsidianCounterTileEntity.increase();
    //        TranslationTextComponent translationTextComponent = new TranslationTextComponent("message.neutrino.counter", counter);
    //        player.sendStatusMessage(translationTextComponent, false);
    //    }
    //    return ActionResultType.SUCCESS;
    //}
}
