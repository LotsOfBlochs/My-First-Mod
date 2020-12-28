package com.lotsofblochs.blochs;

import com.lotsofblochs.blochs.registery.ModBlockItems;
import com.lotsofblochs.blochs.registery.ModBlocks;
import com.lotsofblochs.blochs.registery.ModItems;
import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import net.fabricmc.api.ClientModInitializer;
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class BlochsClient implements ClientModInitializer {

    public static final String MOD_ID = "blochs";


    @Override
    public void onInitializeClient() {
        ModItems.registerItems();
        ModBlocks.registerItems();
        ModBlockItems.registerBlockItems();
        CustomPortalApiRegistry.addPortal(ModBlocks.NETHERITE_PLATED_GOLD, PortalIgnitionSource.ItemUseSource(Items.WATER_BUCKET), new Identifier("first", "the_alther"), 0, 0, 255);
        CrowdinTranslate.downloadTranslations("blochs", "blochs");
    }
}
