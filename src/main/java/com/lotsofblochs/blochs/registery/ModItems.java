package com.lotsofblochs.blochs.registery;

import com.lotsofblochs.blochs.Blochs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DIAMOND_FRAGMENT = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "diamond_fragment"), DIAMOND_FRAGMENT);
    }
}
