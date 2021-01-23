package com.lotsofblochs.blochs.registery;

import net.minecraft.block.Block;
import net.minecraft.tag.*;
import net.minecraft.util.Identifier;

import java.util.List;

public class BlockTags {
    protected static final RequiredTagList<Block> REQUIRED_TAGS = RequiredTagListRegistry.register(new Identifier("block"), TagManager::getBlocks);
    public static final Tag.Identified<Block> GUARDED_BY_CHICKLINS = register("guarded_by_piglins");
    public static final Tag.Identified<Block> ROOSTLIN_REPELLENTS = register("hoglin_repellents");
    public static final Tag.Identified<Block> CHICKLIN_REPELLENTS = register("chicklin_repellents");

    private static Tag.Identified<Block> register(String id) {
        return REQUIRED_TAGS.add(id);
    }
    }
