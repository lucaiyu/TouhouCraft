package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.blocks.BlockRegistry;
import com.lucaiyu.touhoucraft.items.armors.ModArmorMaterial;
import com.lucaiyu.touhoucraft.items.foods.ZunBeer;
import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import com.lucaiyu.touhoucraft.items.tools.Gohei;
import com.lucaiyu.touhoucraft.items.tools.MagicAxe;
import com.lucaiyu.touhoucraft.items.tools.MagicPickaxe;
import com.lucaiyu.touhoucraft.items.tools.MagicSword;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouHouCraft.MOD_ID);
    public static RegistryObject<Item> gohei = ITEMS.register("gohei", () -> {
        return new Gohei();
    });
    public static RegistryObject<Item> touhou_crystal_ore=ITEMS.register("touhou_crystal_ore",() ->{
        return new BlockItem(BlockRegistry.touhou_crystal_ore.get(), new Item.Properties().group(GroupRegistry.touhouGroup));
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
        return new BlockItem(BlockRegistry.magic_ore.get(),new Item.Properties().group(GroupRegistry.touhouGroup));
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
        return new BlockItem(BlockRegistry.shrine_torii_title.get(),new Item.Properties().group(GroupRegistry.touhouGroup));
    });
    public static RegistryObject<Item> magic_ore_in_nether = ITEMS.register("magic_ore_in_nether",()->{
        return new BlockItem(BlockRegistry.magic_ore_in_nether.get(),  new Item.Properties().group(GroupRegistry.touhouGroup));
    });
    public static RegistryObject<Item> touhou_crystal_ore_in_nether = ITEMS.register("touhou_crystal_ore_in_nether",()->{
        return new BlockItem(BlockRegistry.touhou_crystal_ore_in_nether.get(), new Item.Properties().group(GroupRegistry.touhouGroup));
    });
    public static final RegistryObject<Item> GUI_ITEM = ITEMS.register("guide_book",GuideBook::new);
    public static final RegistryObject<Item> hakurei_decorations = ITEMS.register("hakurei_decorations", () -> new ArmorItem(ModArmorMaterial.HAKUREI, EquipmentSlotType.HEAD, (new Item.Properties()).group(GroupRegistry.touhouGroup)));
    public static final RegistryObject<Item> hakurei_clothes = ITEMS.register("hakurei_clothes", () -> new ArmorItem(ModArmorMaterial.HAKUREI, EquipmentSlotType.CHEST, (new Item.Properties()).group(GroupRegistry.touhouGroup)));
    public static final RegistryObject<Item> hakurei_dress = ITEMS.register("hakurei_dress", () -> new ArmorItem(ModArmorMaterial.HAKUREI, EquipmentSlotType.LEGS, (new Item.Properties()).group(GroupRegistry.touhouGroup)));
    public static final RegistryObject<Item> mary_jane_shoes = ITEMS.register("mary_jane_shoes", () -> new ArmorItem(ModArmorMaterial.HAKUREI, EquipmentSlotType.FEET, (new Item.Properties()).group(GroupRegistry.touhouGroup)));
    public static final RegistryObject<Item> donate_box = ITEMS.register("donate_box", ()->{
        return new BlockItem(BlockRegistry.donate_box.get(),new Item.Properties().group(GroupRegistry.touhouGroup));
    });
}