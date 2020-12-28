package com.lotsofblochs.blochs;

import com.lotsofblochs.blochs.registery.ModBlockItems;
import com.lotsofblochs.blochs.registery.ModBlocks;
import com.lotsofblochs.blochs.registery.ModItems;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;


public class Blochs implements ModInitializer{

    public static final String MOD_ID = "blochs";


    @Override
    public void onInitialize() {
        ModItems.init();
        ModBlocks.init();
        ModBlockItems.init();
        CustomPortalApiRegistry.addPortal(ModBlocks.NETHERITE_PLATED_GOLD, PortalIgnitionSource.ItemUseSource(Items.WATER_BUCKET), new Identifier("blochs", "the_alther"), 0, 0, 255);
    }
}
