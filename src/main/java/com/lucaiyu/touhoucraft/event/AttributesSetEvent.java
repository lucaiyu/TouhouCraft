package com.lucaiyu.touhoucraft.event;

import com.lucaiyu.touhoucraft.init.EntityInit;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AttributesSetEvent {
    @SubscribeEvent
    public static void setupAttributes(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            GlobalEntityTypeAttributes.put(EntityInit.hakurei_reimu.get(), AnimalEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 65535.0D).createMutableAttribute(Attributes.MOVEMENT_SPEED, 2.0F).create());
        });
    }
}