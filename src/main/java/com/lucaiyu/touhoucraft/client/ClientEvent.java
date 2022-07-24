package com.lucaiyu.touhoucraft.client;

import com.lucaiyu.touhoucraft.entities.EntityRegistry;
import com.lucaiyu.touhoucraft.entities.render.HakureiReimuRender;
import com.lucaiyu.touhoucraft.entities.render.PowerPointRender;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvent {
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onClientSetupEvent(FMLClientSetupEvent event){
        event.enqueueWork(()->{
            Minecraft mc = Minecraft.getInstance();
            EntityRendererManager manager = mc.getRenderManager();
            manager.register(EntityRegistry.power_point.get(), new PowerPointRender(manager));
            manager.register(EntityRegistry.hakurei_reimu.get(), new HakureiReimuRender(manager));
        });
    }
}
