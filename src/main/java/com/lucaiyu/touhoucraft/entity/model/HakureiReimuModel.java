package com.lucaiyu.touhoucraft.entity.model;// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.lucaiyu.touhoucraft.entity.HakureiReimu;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class HakureiReimuModel extends EntityModel<HakureiReimu> {
	private final ModelRenderer head;
	private final ModelRenderer hair_r1;
	private final ModelRenderer hair_r2;
	private final ModelRenderer rope_r1;
	private final ModelRenderer rope_r2;
	private final ModelRenderer rope_r3;
	private final ModelRenderer rope_r4;
	private final ModelRenderer body;
	private final ModelRenderer lefthand;
	private final ModelRenderer lefthand_r1;
	private final ModelRenderer righthand;
	private final ModelRenderer righthand_r1;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public HakureiReimuModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(31, 30).addBox(-5.0F, -16.0F, 0.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		hair_r1 = new ModelRenderer(this);
		hair_r1.setRotationPoint(0.0F, -11.0F, 0.0F);
		head.addChild(hair_r1);
		setRotationAngle(hair_r1, 0.1745F, 0.0F, 0.0F);
		hair_r1.setTextureOffset(5, 17).addBox(-1.0F, 0.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hair_r2 = new ModelRenderer(this);
		hair_r2.setRotationPoint(0.0F, -11.0F, 0.0F);
		head.addChild(hair_r2);
		setRotationAngle(hair_r2, 0.1745F, 0.0F, 0.0873F);
		hair_r2.setTextureOffset(5, 27).addBox(-5.0F, 1.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		rope_r1 = new ModelRenderer(this);
		rope_r1.setRotationPoint(0.0F, -11.0F, 0.0F);
		head.addChild(rope_r1);
		setRotationAngle(rope_r1, 0.0F, 0.0F, 0.3927F);
		rope_r1.setTextureOffset(33, 3).addBox(-9.0F, -4.0F, -1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		rope_r2 = new ModelRenderer(this);
		rope_r2.setRotationPoint(0.0F, -11.0F, 0.0F);
		head.addChild(rope_r2);
		setRotationAngle(rope_r2, 0.0F, 0.0F, -0.3927F);
		rope_r2.setTextureOffset(33, 6).addBox(-1.0F, -6.0F, -1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		rope_r3 = new ModelRenderer(this);
		rope_r3.setRotationPoint(0.0F, -11.0F, 0.0F);
		head.addChild(rope_r3);
		setRotationAngle(rope_r3, 0.0F, 0.1309F, 0.9163F);
		rope_r3.setTextureOffset(16, 32).addBox(-4.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);

		rope_r4 = new ModelRenderer(this);
		rope_r4.setRotationPoint(0.0F, -11.0F, 0.0F);
		head.addChild(rope_r4);
		setRotationAngle(rope_r4, 0.0F, -0.1309F, -0.9163F);
		rope_r4.setTextureOffset(33, 0).addBox(-5.0F, -6.0F, -1.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(31, 20).addBox(-5.0F, -11.0F, -1.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(27, 12).addBox(-6.0F, -7.0F, -2.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(0, 22).addBox(-7.0F, -6.0F, -3.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 12).addBox(-7.0F, -5.0F, -3.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-8.0F, -4.0F, -4.0F, 11.0F, 1.0F, 11.0F, 0.0F, false);
		body.setTextureOffset(0, 32).addBox(-5.0F, -8.0F, -2.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		lefthand_r1 = new ModelRenderer(this);
		lefthand_r1.setRotationPoint(0.0F, -11.0F, 0.0F);
		lefthand.addChild(lefthand_r1);
		setRotationAngle(lefthand_r1, 0.6109F, 0.0F, 0.5672F);
		lefthand_r1.setTextureOffset(0, 12).addBox(-5.0F, 4.0F, 0.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		righthand_r1 = new ModelRenderer(this);
		righthand_r1.setRotationPoint(0.0F, -11.0F, 0.0F);
		righthand.addChild(righthand_r1);
		setRotationAngle(righthand_r1, 0.6109F, 0.0F, -0.4363F);
		righthand_r1.setTextureOffset(0, 22).addBox(-1.0F, 1.0F, 0.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftleg.setTextureOffset(0, 5).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightleg.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(HakureiReimu entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		lefthand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		righthand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}