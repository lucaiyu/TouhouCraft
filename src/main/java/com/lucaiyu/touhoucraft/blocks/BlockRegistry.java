package com.lucaiyu.touhoucraft.blocks;

import com.lucaiyu.touhoucraft.TouHouCraft;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TouHouCraft.MOD_ID);
    public static RegistryObject<Block> touhou_crystal_ore = BLOCKS.register("touhou_crystal_ore", () -> {
        return new TouhouCrystalOre();
    });
    public static RegistryObject<Block> magic_ore = BLOCKS.register("magic_ore",()->{
        return new MagicOre();
    });
    public static RegistryObject<Block> shrine_torii_title = BLOCKS.register("shrine_torii_title",()->{
        return new ShrineToriiTitle();
    });
}