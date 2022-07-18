package com.lucaiyu.touhoucraft.client.gui;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class Capture extends AbstractGui {
    private int width;
    private int height;
    private Minecraft minecraft;
    private final ResourceLocation REIMU_ANGRY = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/face_pl00an_u.png");
    private MatrixStack matrixStack;
    public Capture(MatrixStack matrixStack) {
        this.width = Minecraft.getInstance().getMainWindow().getScaledWidth();
        this.height = Minecraft.getInstance().getMainWindow().getScaledHeight();
        this.minecraft = Minecraft.getInstance();
        this.matrixStack = matrixStack;
    }
    public void setMatrixStack(MatrixStack stack) {
        this.matrixStack = stack;
    }
    public void render() {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(REIMU_ANGRY);
        blit(matrixStack, 0, height-256, 0, 0, 256, 256, 256, 256);
        System.out.println("Rendering capture");
    }
}
