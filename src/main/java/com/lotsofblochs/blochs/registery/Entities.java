package com.lotsofblochs.blochs.registery;

import com.lotsofblochs.blochs.entities.souleater.SoulEaterEntity;
import com.lotsofblochs.blochs.entities.souleater.SoulEaterEntityRenderer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class Entities {

    public static void init(){
        FabricDefaultAttributeRegistry.register(SoulEaterEntity.SOUL_EATER, SoulEaterEntity.createHostileAttributes());
    }

    public static void initClient(){
        EntityRendererRegistry.INSTANCE.register(SoulEaterEntity.SOUL_EATER, (dispatcher, context) -> {
            return new SoulEaterEntityRenderer(dispatcher);
        });
    }
}
