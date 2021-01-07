package com.lotsofblochs.blochs.entities.souleater;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SoulEaterEntityModel extends EntityModel<SoulEaterEntity> {

    private final ModelPart base;

    public SoulEaterEntityModel() {
        base = new ModelPart(this, 0, 0);
        base.addCuboid(-12, -38, -12, 24, 44, 24);
    }

    @Override
    public void setAngles(SoulEaterEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        // translate model down
        matrices.translate(0, 1.125, 0);

        // render cube
        base.render(matrices, vertices, light, overlay);
    }
}
