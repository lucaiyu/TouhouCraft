package com.lucaiyu.touhoucraft.client.gui;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class GuideBookGui extends Screen {
    ResourceLocation GUIDE_BOOK_GUI_TEXTURE = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/guide_book_gui.png");
    Button buttonNextPage;
    Button buttonPreviousPage;
    private boolean leftButtonIsActive = false;
    private boolean rightButtonIsActive = false;
    //TranslationTextComponent content = new TranslationTextComponent("gui.touhoucraft.guide_book_title");
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
         * render button texture
         */
        if (this.leftButtonIsActive == false){
            this.blit(matrixStack, i+116, 159, 3, 194, 23, 13);
        }
        if (this.leftButtonIsActive == true){
            this.blit(matrixStack, i+116, 159, 3+23, 194, 46, 13);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.leftButtonIsActive = false;
        }
        if (this.rightButtonIsActive == false){
            this.blit(matrixStack, i+116, 159, 3, 194+13, 23, 13);
        }
        if (this.rightButtonIsActive == true){
            this.blit(matrixStack, i+43, 159, 3+23, 194+13, 46, 26);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.rightButtonIsActive = false;
        }
        /**
         * render other things
         */
        this.buttonNextPage.render(matrixStack, mouseX, mouseY, partialTicks);
        this.buttonPreviousPage.render(matrixStack, mouseX, mouseY, partialTicks);
        //drawCenteredString(matrixStack, this.font, content, this.width/2-10, 30, 0xeb0505);

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
        this.buttonNextPage = new Button(i+116, 159, 18, 10, new TranslationTextComponent(" "), (buttonNextPage)->{
            rightButtonIsActive = true;
        });
        this.buttonNextPage.setAlpha(0.0F);
        this.addButton(buttonNextPage);
        this.buttonPreviousPage = new Button(i+43, 159, 18, 10, new TranslationTextComponent(" "), (buttonPerviousPage)->{
            leftButtonIsActive = true;
        });
        this.buttonPreviousPage.setAlpha(0.0F);
        this.addButton(buttonPreviousPage);
    }
    @Override
    public void init() {
        this.minecraft.keyboardListener.enableRepeatEvents(true);
        initButton();
        super.init();

    }
}
