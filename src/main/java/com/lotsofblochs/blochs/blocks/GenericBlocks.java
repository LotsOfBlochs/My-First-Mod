package com.lotsofblochs.blochs.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;

public class GenericBlocks {

    public static final Block ASPECT_OF_LIFE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(100, 2400).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 4).requiresTool());
    public static final Block NETHERITE_PLATED_GOLD = new Block(FabricBlockSettings.of(Material.METAL, MaterialColor.WHITE).strength(30.0f, 500.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool());
}
