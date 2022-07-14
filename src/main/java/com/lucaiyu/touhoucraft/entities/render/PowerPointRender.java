package com.lucaiyu.touhoucraft.entities.render;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.entities.PowerPoint;
import com.lucaiyu.touhoucraft.entities.model.PowerPointModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PowerPointRender extends MobRenderer<PowerPoint, PowerPointModel> {
    private static final ResourceLocation POWER_POINT_TEXTURE = new ResourceLocation(TouHouCraft.MOD_ID, "texture/entity/power_point.png");
    public PowerPointRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PowerPointModel(), 0.8F);
    }
    public PowerPointRender(EntityRendererManager renderManagerIn, PowerPointModel entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    @Override
    public ResourceLocation getEntityTexture(PowerPoint entity) {
        return POWER_POINT_TEXTURE;
    }
}
