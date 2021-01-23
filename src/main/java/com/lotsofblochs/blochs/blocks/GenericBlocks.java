package com.lotsofblochs.blochs.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class GenericBlocks {
    public static final Block ASPECT_OF_LIFE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL, MaterialColor.WHITE).strength(100, 2400).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 4).requiresTool());
    public static final Block NETHERITE_PLATED_GOLD = new Block(FabricBlockSettings.of(Material.METAL).strength(30.0f, 500.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool());
    public static final Block ALTHER_DIAMOND_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F));
}
