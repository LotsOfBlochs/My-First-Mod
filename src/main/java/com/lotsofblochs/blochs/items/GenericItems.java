package com.lotsofblochs.blochs.items;

import com.lotsofblochs.blochs.items.tools.*;
import com.lotsofblochs.blochs.items.AspectOfLifeArmor.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

public class GenericItems {
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

}
