package com.lucaiyu.touhoucraft.gui;

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
    public void render(int captureId, String message) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        switch (captureId) {
            case 0:
                this.minecraft.getTextureManager().bindTexture(REIMU_ANGRY);break;
            case 1:
                this.minecraft.getTextureManager().bindTexture(REIMU_SING);break;
            case 2:
                this.minecraft.getTextureManager().bindTexture(REIMU_HAPPY_1);break;
            case 3:
                this.minecraft.getTextureManager().bindTexture(REIMU_HAPPY_2);break;
            case 4:
                this.minecraft.getTextureManager().bindTexture(REIMU);break;
            case 5:
                this.minecraft.getTextureManager().bindTexture(REIMU_SAD);break;
            case 6:
                this.minecraft.getTextureManager().bindTexture(REIMU_SURPRISE);break;
            case 7:
                this.minecraft.getTextureManager().bindTexture(REIMU_TIRED);break;
        }
        blit(matrixStack, 0, height-172, 0, 0, 128, 128, 128, 128);
        drawCenteredString(this.matrixStack, this.minecraft.fontRenderer, message, 64, height-32, 0xFFFFFF);
    }
}
