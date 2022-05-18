package com.lucaiyu.touhoucraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "touhoucraft");
    public static RegistryObject<Block> obsidianBlock = BLOCKS.register("gensokyo_portal_frame", () -> {
        return new GensokyoPortalFrameBlock();
    });
}