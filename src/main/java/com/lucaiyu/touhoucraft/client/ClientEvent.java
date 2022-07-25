package com.lucaiyu.touhoucraft.client;

import com.lucaiyu.touhoucraft.init.EntityInit;
import com.lucaiyu.touhoucraft.entity.render.HakureiReimuRender;
import com.lucaiyu.touhoucraft.entity.render.PowerPointRender;
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
            manager.register(EntityInit.power_point.get(), new PowerPointRender(manager));
            manager.register(EntityInit.hakurei_reimu.get(), new HakureiReimuRender(manager));
        });
    }
}
