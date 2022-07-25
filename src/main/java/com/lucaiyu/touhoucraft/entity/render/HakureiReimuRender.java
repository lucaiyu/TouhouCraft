package com.lucaiyu.touhoucraft.entity.render;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.entity.HakureiReimu;
import com.lucaiyu.touhoucraft.entity.model.HakureiReimuModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HakureiReimuRender extends MobRenderer<HakureiReimu, HakureiReimuModel> {
    public HakureiReimuRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HakureiReimuModel(), 1F);
    }

    public HakureiReimuRender(EntityRendererManager renderManagerIn, HakureiReimuModel entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    @Override
    public ResourceLocation getEntityTexture(HakureiReimu entity) {
        return new ResourceLocation(TouHouCraft.MOD_ID, "textures/entity/hakurei_reimu.png");
    }
}
