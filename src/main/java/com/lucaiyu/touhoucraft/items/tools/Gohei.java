package com.lucaiyu.touhoucraft.items.tools;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class Gohei extends SwordItem {
    private static final IItemTier iItemTier = new IItemTier() {
        @Override
        public int getUses() {
            return 65536;
        }

        @Override
        public float getSpeed() {
            return 0;
        }

        @Override
        public float getAttackDamageBonus() {
            return 30.0F;
        }

        @Override
        public int getLevel() {
            return 0;
        }

        @Override
        public int getEnchantmentValue() {
            return 0;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };
    public Gohei(){
        super(iItemTier, 30, -2.4F, new Properties().fireResistant().tab(GroupRegistry.touhouGroup));
    }

}
