package com.lucaiyu.touhoucraft.client;

import com.lucaiyu.touhoucraft.client.gui.Capture;
import com.lucaiyu.touhoucraft.client.gui.Dialogue;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.lucaiyu.touhoucraft.client.gui.Dialogue.jump;

@Mod.EventBusSubscriber
public class ClientRenderEvent {
    public MatrixStack matrixStack;
    Dialogue dialogue = new Dialogue(0);
    Capture capture = new Capture(matrixStack);
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onRenderGameOverlayPost(RenderGameOverlayEvent event){
        this.matrixStack = event.getMatrixStack();
        if (!RenderGameOverlayEvent.ElementType.ALL.equals(event.getType())){
            return;
        }
        Minecraft minecraft = Minecraft.getInstance();
        Entity renderViewEntity = minecraft.getRenderViewEntity();
        if (renderViewEntity instanceof PlayerEntity){
            RenderDialogue();
            System.out.println("Rendering");
        }
    }
    public void RenderDialogue(){
        capture.render(5, dialogue.DialogueList.get(dialogue.message_counter));
        System.out.println("Before" + dialogue.message_counter +" " +jump);
        if (jump) {
            dialogue.message_counter++;
            jump = false;
            System.out.println("In" + dialogue.message_counter +" " +jump);
        }
        if (dialogue.message_counter >= 3){
            dialogue.message_counter = 0;
        }
        System.out.println("After" + dialogue.message_counter +" " +jump);
    }
}
