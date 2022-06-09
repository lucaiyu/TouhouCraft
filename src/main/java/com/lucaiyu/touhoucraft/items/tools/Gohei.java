package com.lucaiyu.touhoucraft.items.tools;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.BowItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class Gohei extends BowItem {
    private static final IItemTier iItemTier = new IItemTier() {
        @Override
        public int getUses() {
            return 25565;
        }

        @Override
        public float getSpeed() {
            return -2.4F;
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
            return 10;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };
    public Gohei(){
        super(new Properties().tab(GroupRegistry.touhouGroup));
    }

}
