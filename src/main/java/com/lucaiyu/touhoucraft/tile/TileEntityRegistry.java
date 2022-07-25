package com.lucaiyu.touhoucraft.tile;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.init.BlockInit;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TouHouCraft.MOD_ID);

    public static final RegistryObject<TileEntityType<DonateBoxGuiTileEntity>> donate_box_gui_tile_entity =
            TILE_ENTITY_TYPES.register("donate_box_gui_tile_entity",()-> TileEntityType.Builder.create(DonateBoxGuiTileEntity::new, BlockInit.donate_box.get()).build(null));
}
