package com.lotsofblochs.blochs.tools;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomPickaxeItem extends PickaxeItem {
    public CustomPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}