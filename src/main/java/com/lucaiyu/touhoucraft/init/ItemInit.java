package com.lucaiyu.touhoucraft.init;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.item.BeerCup;
import com.lucaiyu.touhoucraft.item.GuideBook;
import com.lucaiyu.touhoucraft.item.MagicIngot;
import com.lucaiyu.touhoucraft.item.TouhouCrystal;
import com.lucaiyu.touhoucraft.item.foods.ZunBeer;
import com.lucaiyu.touhoucraft.item.tools.Gohei;
import com.lucaiyu.touhoucraft.item.tools.MagicAxe;
import com.lucaiyu.touhoucraft.item.tools.MagicPickaxe;
import com.lucaiyu.touhoucraft.item.tools.MagicSword;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouHouCraft.MOD_ID);
    public static RegistryObject<Item> gohei = ITEMS.register("gohei", Gohei::new);
    public static RegistryObject<Item> touhou_crystal_ore=ITEMS.register("touhou_crystal_ore",() ->{
        return new BlockItem(BlockInit.touhou_crystal_ore.get(), new Item.Properties().group(TabInit.touhouGroup));
    });
    public static RegistryObject<Item> touhou_crystal=ITEMS.register("touhou_crystal", TouhouCrystal::new);
    public static RegistryObject<Item> zun_beer = ITEMS.register("zun_beer", ZunBeer::new);
    public static RegistryObject<Item> beer_cup = ITEMS.register("beer_cup", BeerCup::new);
    public static RegistryObject<Item> magic_ore = ITEMS.register("magic_ore",()->{
        return new BlockItem(BlockInit.magic_ore.get(),new Item.Properties().group(TabInit.touhouGroup));
    });
    public static RegistryObject<Item> magic_ingot = ITEMS.register("magic_ingot", MagicIngot::new);
    public static RegistryObject<Item> magic_sword = ITEMS.register("magic_sword", MagicSword::new);
    public static RegistryObject<Item> magic_pickaxe = ITEMS.register("magic_pickaxe", MagicPickaxe::new);
    public static RegistryObject<Item> magic_axe = ITEMS.register("magic_axe", MagicAxe::new);
    public static RegistryObject<Item> shrine_torii_title = ITEMS.register("shrine_torii_title",()->{
        return new BlockItem(BlockInit.shrine_torii_title.get(),new Item.Properties().group(TabInit.touhouGroup));
    });
    public static RegistryObject<Item> magic_ore_in_nether = ITEMS.register("magic_ore_in_nether",()->{
        return new BlockItem(BlockInit.magic_ore_in_nether.get(),  new Item.Properties().group(TabInit.touhouGroup));
    });
    public static RegistryObject<Item> touhou_crystal_ore_in_nether = ITEMS.register("touhou_crystal_ore_in_nether",()->{
        return new BlockItem(BlockInit.touhou_crystal_ore_in_nether.get(), new Item.Properties().group(TabInit.touhouGroup));
    });
    public static final RegistryObject<Item> GUI_ITEM = ITEMS.register("guide_book", GuideBook::new);
    public static final RegistryObject<Item> donate_box = ITEMS.register("donate_box", ()->{
        return new BlockItem(BlockInit.donate_box.get(),new Item.Properties().group(TabInit.touhouGroup));
    });
}