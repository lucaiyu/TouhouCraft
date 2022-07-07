package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.blocks.BlockRegistry;
import com.lucaiyu.touhoucraft.items.foods.ZunBeer;
import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import com.lucaiyu.touhoucraft.items.tools.Gohei;
import com.lucaiyu.touhoucraft.items.tools.MagicAxe;
import com.lucaiyu.touhoucraft.items.tools.MagicPickaxe;
import com.lucaiyu.touhoucraft.items.tools.MagicSword;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouHouCraft.MOD_ID);

    public static RegistryObject<Item> guide_book = ITEMS.register("guide_book", () -> {
        return new GuideBook();
    });
    public static RegistryObject<Item> gohei = ITEMS.register("gohei", () -> {
        return new Gohei();
    });
    public static RegistryObject<Item> touhou_crystal_ore=ITEMS.register("touhou_crystal_ore",() ->{
        return new BlockItem(BlockRegistry.touhou_crystal_ore.get(), new Item.Properties().tab(GroupRegistry.touhouGroup));
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
    public static RegistryObject<Item> magic_ore = ITEMS.register("magic_ore",()->{
        return new BlockItem(BlockRegistry.magic_ore.get(),new Item.Properties().tab(GroupRegistry.touhouGroup));
    });
    public static RegistryObject<Item> magic_ingot = ITEMS.register("magic_ingot",()->{
        return new MagicIngot();
    });
    public static RegistryObject<Item> magic_sword = ITEMS.register("magic_sword",()->{
        return new MagicSword();
    });
    public static RegistryObject<Item> magic_pickaxe = ITEMS.register("magic_pickaxe",()->{
        return new MagicPickaxe();
    });
    public static RegistryObject<Item> magic_axe = ITEMS.register("magic_axe",()->{
        return new MagicAxe();
    });
    public static RegistryObject<Item> shrine_torii_title = ITEMS.register("shrine_torii_title",()->{
        return new BlockItem(BlockRegistry.shrine_torii_title.get(),new Item.Properties().tab(GroupRegistry.touhouGroup));
    });
    public static RegistryObject<Item> magic_ore_in_nether = ITEMS.register("magic_ore_in_nether",()->{
        return new BlockItem(BlockRegistry.magic_ore_in_nether.get(),  new Item.Properties().tab(GroupRegistry.touhouGroup));
    });
    public static RegistryObject<Item> touhou_crystal_ore_in_nether = ITEMS.register("touhou_crystal_ore_in_nether",()->{
        return new BlockItem(BlockRegistry.touhou_crystal_ore_in_nether.get(), new Item.Properties().tab(GroupRegistry.touhouGroup));
    });
}