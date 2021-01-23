package com.lotsofblochs.blochs.registery;

import com.lotsofblochs.blochs.Blochs;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static com.lotsofblochs.blochs.blocks.GenericBlocks.*;


public class Blocks {

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(Blochs.MOD_ID, "netherite_plated_gold"), NETHERITE_PLATED_GOLD);
        Registry.register(Registry.BLOCK, new Identifier(Blochs.MOD_ID, "aspect_of_life_block"), ASPECT_OF_LIFE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Blochs.MOD_ID, "alther_diamond_ore"), ALTHER_DIAMOND_ORE);
    }
    public static void initClient(){
        BlockRenderLayerMap.INSTANCE.putBlock(NETHERITE_PLATED_GOLD, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ASPECT_OF_LIFE_BLOCK, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ALTHER_DIAMOND_ORE, RenderLayer.getCutoutMipped());
    }
}