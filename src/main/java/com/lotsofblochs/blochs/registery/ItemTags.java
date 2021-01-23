package com.lotsofblochs.blochs.registery;

import net.minecraft.item.Item;
import net.minecraft.tag.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemTags {
    protected static final RequiredTagList<Item> REQUIRED_TAGS = RequiredTagListRegistry.register(new Identifier("item"), TagManager::getItems);
    public static final Tag.Identified<Item> CHICKLIN_REPELLENTS = register("chicklin_repellents");
    public static final Tag.Identified<Item> CHICKLIN_LOVED = register("chicklin_loved");
    public static final Tag.Identified<Item> DIAMOND_ORES = register("diamond_ores");

    private static Tag.Identified<Item> register(String id) {
        return REQUIRED_TAGS.add(id);
    }
}
