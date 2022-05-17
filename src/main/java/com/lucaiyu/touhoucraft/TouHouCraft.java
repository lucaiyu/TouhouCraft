package com.lucaiyu.touhoucraft;

import com.lucaiyu.touhoucraft.items.ItemRegistry;

import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("touhoucraft")
public class TouHouCraft{
    public TouHouCraft() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}