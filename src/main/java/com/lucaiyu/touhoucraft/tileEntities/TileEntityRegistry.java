package com.lucaiyu.touhoucraft.tileEntities;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.blocks.BlockRegistry;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TouHouCraft.MOD_ID);
    public static final RegistryObject<TileEntityType<GUITileEntity>> GUI_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE.register("donate_box_gui",()-> TILE_ENTITY_TYPE.makeRegistry(GUITileEntity::new, BlockRegistry.donate_box.get()).build(null));
}
