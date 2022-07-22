package com.lucaiyu.touhoucraft.entities.model;

import com.lucaiyu.touhoucraft.entities.PowerPoint;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class PowerPointModel extends EntityModel<PowerPoint> {
	private final ModelRenderer bb_main;

	public PowerPointModel() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 5).addBox(-2.0F, -2.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 7).addBox(1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(PowerPoint entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
		// todo
	}
}