package com.lucaiyu.touhoucraft.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class Gohei extends SwordItem {
    private static IItemTier iItemTier = new IItemTier() {
        @Override
        public int getUses() {
            return 4096;
        }

        @Override
        public float getSpeed() {
            return 10.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            return 10.0F;
        }

        @Override
        public int getLevel() {
            return 0;
        }

        @Override
        public int getEnchantmentValue() {
            return 30;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    public Gohei() {
        super(iItemTier, 10, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT));
    }
}
