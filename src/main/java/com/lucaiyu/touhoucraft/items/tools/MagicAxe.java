package com.lucaiyu.touhoucraft.items.tools;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import com.lucaiyu.touhoucraft.items.ItemRegistry;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class MagicAxe extends AxeItem {
    private static final IItemTier iItemTier = new IItemTier() {
        @Override
        public int getUses() {
            return 512;
        }

        @Override
        public float getSpeed() {
            return 30.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            return 16.0F;
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
            return Ingredient.of(ItemRegistry.magic_ingot.get());
        }
    };
    public MagicAxe(){
        super(iItemTier,0,0.0F,new Properties().tab(GroupRegistry.touhouGroup));
    }
}
