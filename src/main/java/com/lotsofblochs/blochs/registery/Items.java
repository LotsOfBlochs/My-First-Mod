package com.lotsofblochs.blochs.registery;

import com.lotsofblochs.blochs.Blochs;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static com.lotsofblochs.blochs.items.GenericItems.*;

public class Items {

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "soul_fragment"), SOUL_FRAGMENT);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "soul"), SOUL);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "heart"), HEART);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life"), ASPECT_OF_LIFE);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "diamond_fragment"), DIAMOND_FRAGMENT);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_sword"), ASPECT_OF_LIFE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_shovel"), ASPECT_OF_LIFE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_pickaxe"), ASPECT_OF_LIFE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_axe"), ASPECT_OF_LIFE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_hoe"), ASPECT_OF_LIFE_HOE);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_helmet"), ASPECT_OF_LIFE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_chestplate"), ASPECT_OF_LIFE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_leggings"), ASPECT_OF_LIFE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, "aspect_of_life_boots"), ASPECT_OF_LIFE_BOOTS);
    }
}
