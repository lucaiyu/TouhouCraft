package com.lucaiyu.touhoucraft;

import com.lucaiyu.touhoucraft.blocks.BlockRegistry;
import com.lucaiyu.touhoucraft.entities.EntityRegistry;
import com.lucaiyu.touhoucraft.items.ItemRegistry;

import com.lucaiyu.touhoucraft.world.gen.OreGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("touhoucraft")
public class TouHouCraft{
    public static String MOD_ID = "touhoucraft";
    public TouHouCraft() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        EntityRegistry.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}