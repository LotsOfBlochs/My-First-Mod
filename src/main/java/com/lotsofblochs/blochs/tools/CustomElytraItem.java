package com.lotsofblochs.blochs.tools;

import com.lotsofblochs.blochs.registery.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CustomElytraItem extends ArmorItem{
    public CustomElytraItem(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings) {
        super(material, slot, settings);
    }

    public static boolean isUsable(ItemStack stack) {
        return stack.getDamage() < stack.getMaxDamage() - 1;
    }

    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.getItem() == ModItems.ASPECT_OF_LIFE;
    }

}
