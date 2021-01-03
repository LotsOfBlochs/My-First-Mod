package com.lotsofblochs.blochs.registery;

import com.lotsofblochs.blochs.Blochs;
import com.lotsofblochs.blochs.tools.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SOUL_FRAGMENT = new Item(new Item.Settings().maxCount(16).group(ItemGroup.MISC).fireproof());
    public static final Item SOUL = new Item(new Item.Settings().group(ItemGroup.MISC).fireproof());
    public static final Item HEART = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ASPECT_OF_LIFE = new Item(new Item.Settings().group(ItemGroup.MISC).fireproof());
    public static final Item DIAMOND_FRAGMENT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static ToolItem ASPECT_OF_LIFE_SWORD = new SwordItem(AspectOfLifeTier.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static ToolItem ASPECT_OF_LIFE_SHOVEL = new ShovelItem(AspectOfLifeTier.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem ASPECT_OF_LIFE_PICKAXE = new CustomPickaxeItem(AspectOfLifeTier.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem ASPECT_OF_LIFE_AXE = new CustomAxeItem(AspectOfLifeTier.INSTANCE, 5.0F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem ASPECT_OF_LIFE_HOE = new CustomHoeItem(AspectOfLifeTier.INSTANCE, -3, 0, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static final ArmorMaterial aspectOfLifeArmor = new AspectOfLifeArmor();
    public static final ArmorItem ASPECT_OF_LIFE_HELMET = new ArmorItem(aspectOfLifeArmor, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final ArmorItem ASPECT_OF_LIFE_CHESTPLATE = new ArmorItem(aspectOfLifeArmor, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final ArmorItem ASPECT_OF_LIFE_LEGGINGS = new ArmorItem(aspectOfLifeArmor, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static final ArmorItem ASPECT_OF_LIFE_BOOTS = new ArmorItem(aspectOfLifeArmor, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).fireproof());




    public static void init() {
        //Registry.register(Registry.ITEM, new Identifier(Blochs.MOD_ID, ""), );
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
