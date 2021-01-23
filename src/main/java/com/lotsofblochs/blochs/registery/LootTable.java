package com.lotsofblochs.blochs.registery;

import com.google.common.collect.Sets;
import net.minecraft.util.Identifier;

import java.util.Collections;
import java.util.Set;

public class LootTable {
    private static final Set<Identifier> LOOT_TABLES = Sets.newHashSet();
    private static final Set<Identifier> LOOT_TABLES_READ_ONLY;
    public static final Identifier CHICKLIN_BARTERING_GAMEPLAY;

    private static Identifier register(String id) {
        return registerLootTable(new Identifier(id));
    }

    private static Identifier registerLootTable(Identifier id) {
        if (LOOT_TABLES.add(id)) {
            return id;
        } else {
            throw new IllegalArgumentException(id + " is already a registered built-in loot table");
        }
    }

    public static Set<Identifier> getAll() {
        return LOOT_TABLES_READ_ONLY;
    }

    static{
        LOOT_TABLES_READ_ONLY = Collections.unmodifiableSet(LOOT_TABLES);
        CHICKLIN_BARTERING_GAMEPLAY = register("gameplay/chicklin_bartering");
    }
}
