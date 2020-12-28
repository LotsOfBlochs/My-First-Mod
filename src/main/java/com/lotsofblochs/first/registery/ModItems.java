package com.lotsofblochs.first.registery;

import com.lotsofblochs.first.First;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DIAMOND_FRAGMENT = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(First.MOD_ID, "diamond_fragment"), DIAMOND_FRAGMENT);
    }
}
