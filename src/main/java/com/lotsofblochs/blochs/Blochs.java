package com.lotsofblochs.blochs;

import com.lotsofblochs.blochs.registery.BlockItems;
import com.lotsofblochs.blochs.registery.Blocks;
import com.lotsofblochs.blochs.registery.Entities;
import com.lotsofblochs.blochs.registery.Items;
import net.fabricmc.api.ModInitializer;

public class Blochs implements ModInitializer{

    public static final String MOD_ID = "blochs";

    @Override
    public void onInitialize() {
        Items.init();
        Blocks.init();
        BlockItems.init();
        Entities.init();

    }
}
