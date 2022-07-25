package com.lucaiyu.touhoucraft.gui;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.container.DonateBoxContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DonateBoxGui extends ContainerScreen<DonateBoxContainer> {
    private static final ResourceLocation DONATE_BOX_GUI = new ResourceLocation(TouHouCraft.MOD_ID,"textures/gui/donate_box_gui.png");

    public DonateBoxGui(DonateBoxContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        this.guiLeft = 0;
        this.guiTop = 0;
        this.xSize = 176;
        this.ySize = 176;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.drawGuiContainerBackgroundLayer(matrixStack,partialTicks,mouseX,mouseY);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderHoveredTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int x, int y) {
        this.font.func_243248_b(matrixStack, this.playerInventory.getDisplayName(), (float) this.playerInventoryTitleX, (float) this.playerInventoryTitleY, 4210752);
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F,1.0F,1.0F,1.0F);
        this.minecraft.textureManager.bindTexture(DONATE_BOX_GUI);
        int x = (this.width-this.xSize)/2;
        int y = (this.height - this.ySize)/2;
        this.blit(matrixStack, x, y, 0, 0, this.xSize, this.ySize);

    }
}
