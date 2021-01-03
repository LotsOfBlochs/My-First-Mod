package com.lotsofblochs.blochs.registery;

import com.lotsofblochs.blochs.Blochs;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockItems {

    public static final BlockItem ASPECT_OF_LIFE_BLOCK = new BlockItem(ModBlocks.ASPECT_OF_LIFE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());
    public static final BlockItem NETHERITE_PLATED_GOLD = new BlockItem(ModBlocks.NETHERITE_PLATED_GOLD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "netherite_plated_gold"), NETHERITE_PLATED_GOLD);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_block"), ASPECT_OF_LIFE_BLOCK);
    }
}
