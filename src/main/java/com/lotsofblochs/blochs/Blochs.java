package com.lotsofblochs.blochs;

import com.lotsofblochs.blochs.blocks.GenericBlocks;
import com.lotsofblochs.blochs.registery.BlockItems;
import com.lotsofblochs.blochs.registery.Blocks;
import com.lotsofblochs.blochs.registery.Entities;
import com.lotsofblochs.blochs.registery.Items;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.minecraft.util.Identifier;


public class Blochs implements ModInitializer{

    public static final String MOD_ID = "blochs";



    @Override
    public void onInitialize() {
        Items.init();
        Blocks.init();
        BlockItems.init();
        Entities.init();
        CustomPortalApiRegistry.addPortal(GenericBlocks.NETHERITE_PLATED_GOLD, PortalIgnitionSource.ItemUseSource(net.minecraft.item.Items.WATER_BUCKET), new Identifier("blochs", "the_alther"), 0, 0, 255);
    }
}
