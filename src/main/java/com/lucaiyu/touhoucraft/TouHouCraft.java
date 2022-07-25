package com.lucaiyu.touhoucraft;

import com.lucaiyu.touhoucraft.init.BlockInit;
import com.lucaiyu.touhoucraft.tile.TileEntityRegistry;
import com.lucaiyu.touhoucraft.init.ContainerInit;
import com.lucaiyu.touhoucraft.init.EntityInit;
import com.lucaiyu.touhoucraft.init.ItemInit;

import com.lucaiyu.touhoucraft.world.gen.OreGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("touhoucraft")
public class TouHouCraft{
    public static String MOD_ID = "touhoucraft";
    public TouHouCraft() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        EntityInit.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        TileEntityRegistry.TILE_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ContainerInit.CONTAINER_TYPE.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}