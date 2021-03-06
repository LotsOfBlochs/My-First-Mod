package com.lotsofblochs.blochs.items.tools;

import com.lotsofblochs.blochs.items.GenericItems;
import com.lotsofblochs.blochs.registery.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AspectOfLifeTier implements ToolMaterial {

    public static final AspectOfLifeTier INSTANCE = new AspectOfLifeTier();

    @Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 50;
    }

    @Override
    public float getAttackDamage() {
        return 6;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(GenericItems.ASPECT_OF_LIFE_BOOTS);
    }
}
