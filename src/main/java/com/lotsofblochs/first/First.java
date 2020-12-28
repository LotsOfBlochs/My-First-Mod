package com.lotsofblochs.first;

import com.lotsofblochs.first.registery.ModBlockItems;
import com.lotsofblochs.first.registery.ModBlocks;
import com.lotsofblochs.first.registery.ModItems;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;


public class First implements ModInitializer {

    public static final String MOD_ID = "first";


    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerItems();
        ModBlockItems.registerBlockItems();
        CustomPortalApiRegistry.addPortal(ModBlocks.NETHERITE_PLATED_GOLD, PortalIgnitionSource.ItemUseSource(Items.WATER_BUCKET), new Identifier("first", "the_alther"), 0, 0, 255);
    }
}
