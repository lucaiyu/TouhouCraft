package com.lucaiyu.touhoucraft.client.gui;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.ChangePageButton;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import java.util.ArrayList;

public class GuideBookGui extends Screen {
    ResourceLocation GUIDE_BOOK_GUI_TEXTURE = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/guide_book_gui.png");
    ChangePageButton buttonNextPage;
    ChangePageButton buttonPreviousPage;
    ArrayList<ArrayList<?>> pages = new ArrayList<ArrayList<?>>();

    private final boolean pageTurnSounds = false;
    protected GuideBookGui(ITextComponent titleIn) {
        super(titleIn);
    }
    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        /**
         * init renderer
         */
        this.renderBackground(matrixStack);
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUIDE_BOOK_GUI_TEXTURE);
        /**
         * render book page
         */
        int i = (this.width - 192) / 2;
        int j = 2;
        this.blit(matrixStack, i, j, 0, 0, 192, 192);
        /**
         * render other things
         */
        this.buttonNextPage.render(matrixStack, mouseX, mouseY, partialTicks);
        this.buttonPreviousPage.render(matrixStack, mouseX, mouseY, partialTicks);

        super.render(matrixStack, mouseX, mouseY, partialTicks);
        /**
         * method blit
         * x, y, u, v, width, height, textureWidth, textureHeight
         **/
        /**
         * method drawCenteredString
         * x, y, colour(HEX)
         */
    }
    private void initButton(){
        int i = (this.width - 192) / 2;
        this.buttonNextPage = new ChangePageButton(i+116, 159, true, (buttonNextPage)->{}, pageTurnSounds);
        this.addButton(buttonNextPage);
        this.buttonPreviousPage = new ChangePageButton(i+43, 159,  false, (buttonPreviousPage)->{}, pageTurnSounds);
        this.addButton(buttonPreviousPage);
    }
    @Override
    public void init() {
        this.minecraft.keyboardListener.enableRepeatEvents(true);
        initButton();
        super.init();

    }
}
