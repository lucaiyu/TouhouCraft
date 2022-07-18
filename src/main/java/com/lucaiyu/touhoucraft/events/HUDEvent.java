package com.lucaiyu.touhoucraft.events;

import com.lucaiyu.touhoucraft.client.gui.Capture;
import com.lucaiyu.touhoucraft.items.ItemRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Hand;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class HUDEvent {
    @SubscribeEvent
    public static void onOverlayRender(RenderGameOverlayEvent event) {
        if (event.getType() != RenderGameOverlayEvent.ElementType.ALL) {
            return;
        }
        if (Minecraft.getInstance().player == null || Minecraft.getInstance().player.getHeldItem(Hand.MAIN_HAND).getItem() != ItemRegistry.gohei.get()) {
            return;
        }
        Capture capture = new Capture(event.getMatrixStack());
        capture.render();
    }
}
