package com.lucaiyu.touhoucraft.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import com.lucaiyu.touhoucraft.entities.PowerPoint;

public class PowerPointModel extends EntityModel<PowerPoint> {
	private final ModelRenderer bb_main;

	public PowerPointModel() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -0.5F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(PowerPoint entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}