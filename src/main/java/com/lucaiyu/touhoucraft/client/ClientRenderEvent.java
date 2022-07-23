package com.lucaiyu.touhoucraft.client;

import com.lucaiyu.touhoucraft.client.gui.Dialogue;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ClientRenderEvent {
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderGameOverlayPost(RenderGameOverlayEvent event){
        if (!RenderGameOverlayEvent.ElementType.ALL.equals(event.getType())){
            return;
        }
        Minecraft minecraft = Minecraft.getInstance();
        Entity renderViewEntity = minecraft.getRenderViewEntity();
        if (renderViewEntity instanceof PlayerEntity){
            Dialogue dialogue = new Dialogue(0, event.getMatrixStack());
            dialogue.RenderDialogue();
        }
    }
}
