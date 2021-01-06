package com.lotsofblochs.blochs.items;

import com.lotsofblochs.blochs.blocks.GenericBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class GenericBlockItems {
    public static final BlockItem ASPECT_OF_LIFE_BLOCK = new BlockItem(GenericBlocks.ASPECT_OF_LIFE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());
    public static final BlockItem NETHERITE_PLATED_GOLD = new BlockItem(GenericBlocks.NETHERITE_PLATED_GOLD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());
}
