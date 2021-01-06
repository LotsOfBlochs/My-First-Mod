package com.lotsofblochs.blochs;

import com.lotsofblochs.blochs.registery.Blocks;
import com.lotsofblochs.blochs.registery.Entities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class BlochsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){
        Blocks.initClient();
        Entities.initClient();
    }
}
