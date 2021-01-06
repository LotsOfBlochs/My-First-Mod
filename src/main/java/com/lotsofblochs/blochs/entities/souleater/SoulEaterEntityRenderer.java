package com.lotsofblochs.blochs.entities.souleater;

import com.lotsofblochs.blochs.Blochs;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SoulEaterEntityRenderer extends MobEntityRenderer<SoulEaterEntity, SoulEaterEntityModel> {

    public SoulEaterEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new SoulEaterEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(SoulEaterEntity entity) {
        return new Identifier(Blochs.MOD_ID, "textures/entity/soul_eater/soul_eater.png");
    }
}
