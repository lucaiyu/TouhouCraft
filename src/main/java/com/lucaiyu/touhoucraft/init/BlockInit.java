package com.lucaiyu.touhoucraft.init;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.block.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TouHouCraft.MOD_ID);
    public static RegistryObject<Block> touhou_crystal_ore = BLOCKS.register("touhou_crystal_ore", TouhouCrystalOre::new);
    public static RegistryObject<Block> magic_ore = BLOCKS.register("magic_ore", MagicOre::new);
    public static RegistryObject<Block> shrine_torii_title = BLOCKS.register("shrine_torii_title", ShrineToriiTitle::new);
    public static RegistryObject<Block> touhou_crystal_ore_in_nether = BLOCKS.register("touhou_crystal_ore_in_nether", TouhouCrystalOreInNether::new);
    public static RegistryObject<Block> magic_ore_in_nether = BLOCKS.register("magic_ore_in_nether", MagicOreInNether::new);
    public static RegistryObject<Block> donate_box = BLOCKS.register("donate_box", DonateBox::new);
}