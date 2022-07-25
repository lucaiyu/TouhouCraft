package com.lucaiyu.touhoucraft.gui;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.ChangePageButton;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;

@OnlyIn(Dist.CLIENT)
public class GuideBookGui extends Screen {
    ResourceLocation GUIDE_BOOK_GUI_TEXTURE = new ResourceLocation(TouHouCraft.MOD_ID, "textures/gui/guide_book_gui.png");
    ChangePageButton buttonNextPage;
    ChangePageButton buttonPreviousPage;
    private ArrayList<ArrayList<String>> pages = new ArrayList<>();
    private ArrayList<String> page1 = new ArrayList<>();
    private ArrayList<String> page2 = new ArrayList<>();
    private ArrayList<String> page3 = new ArrayList<>();
    private ArrayList<String> page4 = new ArrayList<>();
    private ArrayList<String> page5 = new ArrayList<>();
    private ArrayList<String> page6 = new ArrayList<>();
    private ArrayList<String> page7 = new ArrayList<>();
    private ArrayList<String> page8 = new ArrayList<>();
    private ArrayList<String> page9 = new ArrayList<>();
    private ArrayList<String> page10 = new ArrayList<>();
    private static int page = 1;
    private static final int totalpage = 10;

    private final boolean pageTurnSounds = false;
    private void addPage(){
        pages.add(page1);
        pages.add(page2);
        pages.add(page3);
        pages.add(page4);
        pages.add(page5);
        pages.add(page6);
        pages.add(page7);
        pages.add(page8);
        pages.add(page9);
        pages.add(page10);
        for(int i = 0; i<9; i++){
            page1.add("0000000000000000000"+i);
            page2.add("1000000000000000000"+i);
            page3.add("2000000000000000000"+i);
            page4.add("3000000000000000000"+i);
            page5.add("4000000000000000000"+i);
            page6.add("5000000000000000000"+i);
            page7.add("6000000000000000000"+i);
            page8.add("7000000000000000000"+i);
            page9.add("8000000000000000000"+i);
            page10.add("9000000000000000000"+i);
        }

    }
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
         *render text
         */
        for(int k = 0; k<9; k++){
            switch (this.page){
                case 1:drawCenteredString(matrixStack, this.font, page1.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 2:drawCenteredString(matrixStack, this.font, page2.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 3:drawCenteredString(matrixStack, this.font, page3.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 4:drawCenteredString(matrixStack, this.font, page4.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 5:drawCenteredString(matrixStack, this.font, page5.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 6:drawCenteredString(matrixStack, this.font, page6.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 7:drawCenteredString(matrixStack, this.font, page7.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 8:drawCenteredString(matrixStack, this.font, page8.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 9:drawCenteredString(matrixStack, this.font, page9.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                case 10:drawCenteredString(matrixStack, this.font, page10.get(k), (this.width-192)/2+89, 22+k*16, 0xffffff);break;
                default:drawCenteredString(matrixStack, this.font, "ERROR", (this.width-192)/2+89, 22+k*16, 0xff0000);break;
            }
        }
        /**
         * render buttons
         */
        updateButton();
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
        this.buttonNextPage = new ChangePageButton(i+116, 159, true, (buttonNextPage)->{
            this.page+=1;
        }, pageTurnSounds);
        this.addButton(buttonNextPage);
        this.buttonPreviousPage = new ChangePageButton(i+43, 159,  false, (buttonPreviousPage)->{
            this.page -= 1;
        }, pageTurnSounds);
        this.addButton(buttonPreviousPage);
    }
    private void updateButton(){
        this.buttonNextPage.visible = this.page < this.totalpage;
        this.buttonPreviousPage.visible = this.page > 1;
    }
    @Override
    public void init() {
        this.minecraft.keyboardListener.enableRepeatEvents(true);
        initButton();
        addPage();
        super.init();

    }
}
