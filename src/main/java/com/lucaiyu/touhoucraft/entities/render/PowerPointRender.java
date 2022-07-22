package com.lucaiyu.touhoucraft.entities.render;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.entities.HakureiReimu;
import com.lucaiyu.touhoucraft.entities.PowerPoint;
import com.lucaiyu.touhoucraft.entities.model.PowerPointModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class PowerPointRender extends EntityRenderer<PowerPoint> {
    private EntityModel<PowerPoint> powerPointModel;
    private static final ResourceLocation POWER_POINT_TEXTURE = new ResourceLocation(TouHouCraft.MOD_ID, "textures/entity/power_point.png");
    public PowerPointRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
        powerPointModel = new PowerPointModel();
    }
    //public PowerPointRender(EntityRendererManager renderManagerIn, PowerPointModel entityModelIn, float shadowSizeIn) {
        //super(renderManagerIn, entityModelIn, shadowSizeIn);
    //}

    @Override
    public ResourceLocation getEntityTexture(PowerPoint entity) {
        return POWER_POINT_TEXTURE;
    }
    @Override
    public void render(PowerPoint entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.push();
        matrixStackIn.rotate(Vector3f.YN.rotationDegrees(0));
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.powerPointModel.getRenderType(this.getEntityTexture(entityIn)));
        this.powerPointModel.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.pop();
    }
}
