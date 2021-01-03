package com.lotsofblochs.blochs.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

import java.util.Set;

public class CustomAxeItem extends AxeItem {
    public CustomAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
