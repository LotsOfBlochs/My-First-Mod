package com.lotsofblochs.first.registery;

import com.lotsofblochs.first.First;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockItems {
    public static final BlockItem NETHERITE_PLATED_GOLD = new BlockItem(ModBlocks.NETHERITE_PLATED_GOLD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(First.MOD_ID, "netherite_plated_gold"), NETHERITE_PLATED_GOLD);
    }
}
