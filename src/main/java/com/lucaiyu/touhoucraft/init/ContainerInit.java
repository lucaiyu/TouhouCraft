package com.lucaiyu.touhoucraft.init;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.container.DonateBoxContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerInit {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPE = DeferredRegister.create(ForgeRegistries.CONTAINERS, TouHouCraft.MOD_ID);
    public static final RegistryObject<ContainerType<DonateBoxContainer>> donate_box_container = CONTAINER_TYPE.register("donate_box_container",()-> IForgeContainerType.create(DonateBoxContainer::new));
}
