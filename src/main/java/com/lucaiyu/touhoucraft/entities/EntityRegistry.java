package com.lucaiyu.touhoucraft.entities;

import com.lucaiyu.touhoucraft.TouHouCraft;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, TouHouCraft.MOD_ID);

    public static RegistryObject<EntityType<PowerPoint>> power_point =
            ENTITIES.register("power_point",
                    ()->EntityType.Builder.<PowerPoint>create(PowerPoint::new, EntityClassification.MISC)
                            .size(1.0F, 1.0F).build("power_point"));
}
