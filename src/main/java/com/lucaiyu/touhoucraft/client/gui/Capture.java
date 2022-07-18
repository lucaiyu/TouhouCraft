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
    private final ResourceLocation REIMU_SING = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/face_pl00dp_u.png");
    private final ResourceLocation REIMU_HAPPY_1 = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/face_pl00hp_u.png");
    private final ResourceLocation REIMU_HAPPY_2 = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/face_pl00n2_u.png");
    private final ResourceLocation REIMU = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/face_pl00no_u.png");
    private final ResourceLocation REIMU_SAD = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/face_pl00pr_u.png");
    private final ResourceLocation REIMU_SURPRISE = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/face_pl00sp_u.png");
    private final ResourceLocation REIMU_TIRED = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/face_pl00sw_u.png");
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
    public void render(int captureId) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        switch (captureId) {
            case 0:
                this.minecraft.getTextureManager().bindTexture(REIMU_ANGRY);
            case 1:
                this.minecraft.getTextureManager().bindTexture(REIMU_SING);
            case 2:
                this.minecraft.getTextureManager().bindTexture(REIMU_HAPPY_1);
            case 3:
                this.minecraft.getTextureManager().bindTexture(REIMU_HAPPY_2);
            case 4:
                this.minecraft.getTextureManager().bindTexture(REIMU);
            case 5:
                this.minecraft.getTextureManager().bindTexture(REIMU_SAD);
            case 6:
                this.minecraft.getTextureManager().bindTexture(REIMU_SURPRISE);
            case 7:
                this.minecraft.getTextureManager().bindTexture(REIMU_TIRED);
        }
        blit(matrixStack, 0, height-256, 0, 0, 256, 256, 256, 256);
        System.out.println("Rendering capture");
    }
}
