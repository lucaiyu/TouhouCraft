package com.lucaiyu.touhoucraft.events;

import com.lucaiyu.touhoucraft.entities.EntityRegistry;
import com.lucaiyu.touhoucraft.entities.PowerPoint;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AttributesSetEvent {
    @SubscribeEvent
    public static void setupAtteributes(EntityAttributeCreationEvent event){
        event.put(EntityRegistry.power_point.get(), PowerPoint.func_234192_eI_().create());
    }
}
