package com.lucaiyu.touhoucraft.entities.render;

import com.lucaiyu.touhoucraft.TouHouCraft;
import com.lucaiyu.touhoucraft.entities.PowerPoint;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class PowerPointRender extends EntityRenderer<PowerPoint> {
    private static final ResourceLocation POWER_POINT_TEXTURE = new ResourceLocation(TouHouCraft.MOD_ID, "texture/entity/power_point.png");
    public PowerPointRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
        this.shadowSize = 0.15F;
    }

    @Override
    public ResourceLocation getEntityTexture(PowerPoint entity) {
        return POWER_POINT_TEXTURE;
    }
}
