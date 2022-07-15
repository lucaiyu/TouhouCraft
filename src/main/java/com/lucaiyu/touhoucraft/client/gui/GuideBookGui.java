package com.lucaiyu.touhoucraft.client.gui;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class GuideBookGui extends Screen {
    ResourceLocation GUIDE_BOOK_GUI_TEXTURE = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/guide_book.png");
    TranslationTextComponent content = new TranslationTextComponent("gui.touhoucraft.guide_book");
    protected GuideBookGui(ITextComponent titleIn) {
        super(titleIn);
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderBackground(matrixStack);
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUIDE_BOOK_GUI_TEXTURE);
        int textureWidth = 145;
        int textureHeight = 179;
        /**
         * method blit
         * x, y, u, v, width, height, textureWidth, textureHeight
         **/
        /**
         * method drawCenteredString
         * x, y, colour(HEX)
         */
        this.blit(matrixStack, width/2-145, height / 2+179, 0, 0, this.width, this.height, textureWidth, textureHeight);
        drawCenteredString(matrixStack, this.font, content, 0, 0, 0xffffff);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
    }

    @Override
    public void init(Minecraft minecraft, int width, int height) {
        super.init(minecraft, width, height);
        this.minecraft.keyboardListener.enableRepeatEvents(true);
        super.init();

    }
}
