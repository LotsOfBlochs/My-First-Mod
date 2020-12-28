package com.lotsofblochs.blochs;

import com.lotsofblochs.blochs.registery.ModBlocks;
import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class BlochsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){
        CrowdinTranslate.downloadTranslations("blochs", Blochs.MOD_ID);
        ModBlocks.initClient();
    }
}
