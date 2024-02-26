package net.louis.mushrooomsmod.entity.client;

import net.louis.mushrooomsmod.MushrooomsMod;
import net.louis.mushrooomsmod.entity.custom.BoleteCowEntity;
import net.louis.mushrooomsmod.entity.custom.GrokiEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BoleteCowRenderer extends GeoEntityRenderer<BoleteCowEntity> {
    public BoleteCowRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new BoleteCowModel());
    }
    @Override
    public Identifier getTextureLocation(BoleteCowEntity animatable) {
        return new Identifier(MushrooomsMod.MOD_ID, "textures/entity/bolete_cow.png");
    }

    @Override
    public void render(BoleteCowEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

}
