package com.lotsofblochs.blochs.items;

import com.lotsofblochs.blochs.registery.Items;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class AspectOfLifeArmor implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {15, 17, 18, 13};
    private static final int[] PROTECTION_VALUES = new int[] {6, 12, 16, 6};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 50;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(GenericItems.ASPECT_OF_LIFE_BOOTS);
    }

    @Override
    public String getName() {
        return "aspect_of_life";
    }

    @Override
    public float getToughness() {
        return 5.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1F;
    }
}
