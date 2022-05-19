package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.blocks.BlockRegistry;
import com.lucaiyu.touhoucraft.items.foods.ZunBeer;
import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import com.lucaiyu.touhoucraft.items.tools.Gohei;
import net.minecraft.item.BlockItem;
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
        return new BlockItem(BlockRegistry.gensokyoportalframe.get(), new Item.Properties().tab(GroupRegistry.touhouGroup));
    });
    public static RegistryObject<Item> gohei = ITEMS.register("gohei", () -> {
        return new Gohei();
    });
    public static RegistryObject<Item> touhou_crystal_ore=ITEMS.register("touhou_crystal_ore",() ->{
        return new BlockItem(BlockRegistry.touhoucrystalore.get(), new Item.Properties().tab(GroupRegistry.touhouGroup));
    });
    public static RegistryObject<Item> touhou_crystal=ITEMS.register("touhou_crystal",() ->{
        return new TouhouCrystal();
    });
    public static RegistryObject<Item> zun_beer = ITEMS.register("zun_beer",()->{
        return new ZunBeer();
    });
    public static RegistryObject<Item> beer_cup = ITEMS.register("beer_cup",()->{
        return new BeerCup();
    });
}