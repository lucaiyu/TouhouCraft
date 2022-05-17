package com.lucaiyu.touhoucraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "touhoucraft");
    public static RegistryObject<Item> guide_book = ITEMS.register("guide_book", () -> {
        return new GuideBook();
    });
    public static RegistryObject<Item> gensokyo_portal_frame=ITEMS.register("gensokyo_portal_frame", () -> {
        return new GensokyoPortalFrame();
    });
}