package com.lotsofblochs.blochs.registery;

import com.lotsofblochs.blochs.Blochs;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {


    public static final Block NETHERITE_PLATED_GOLD = new Block(FabricBlockSettings.of(Material.METAL).strength(30.0f, 500.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool());

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(Blochs.MOD_ID, "netherite_plated_gold"), NETHERITE_PLATED_GOLD);
    }
    public static void initClient(){
        BlockRenderLayerMap.INSTANCE.putBlock(NETHERITE_PLATED_GOLD, RenderLayer.getCutoutMipped());
    }
}