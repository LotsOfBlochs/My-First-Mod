package com.lotsofblochs.blochs.registery;

import com.lotsofblochs.blochs.Blochs;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static com.lotsofblochs.blochs.items.GenericBlockItems.*;

public class BlockItems {

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "netherite_plated_gold"), NETHERITE_PLATED_GOLD);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_block"), ASPECT_OF_LIFE_BLOCK);
    }
}
