package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "touhoucraft");
    public static RegistryObject<Block> gensokyo_portal_frame = BLOCKS.register("gensokyo_portal_frame", () -> {
        return new GensokyoPortalFrameBlock();
    });
    public static RegistryObject<Block> touhou_crystal_ore = BLOCKS.register("touhou_crystal_ore", () -> {
        return new TouhouCrystalOre();
    });
    public static RegistryObject<Block> magic_ore = BLOCKS.register("magic_ore",()->{
        return new MagicOre();
    });
}