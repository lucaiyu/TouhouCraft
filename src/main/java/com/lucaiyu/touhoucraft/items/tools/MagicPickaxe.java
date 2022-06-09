package com.lucaiyu.touhoucraft.items.tools;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import com.lucaiyu.touhoucraft.items.ItemRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.Ingredient;

public class MagicPickaxe extends PickaxeItem {
    private static final IItemTier iItemTier = new IItemTier(){
        @Override
        public int getUses() {
            return 512;
        }

        @Override
        public float getSpeed() {
            return 30.0F;
        }

        @Override
        public int getEnchantmentValue() {
            return 30;
        }

        @Override
        public int getLevel() {
            return 3;
        }

        @Override
        public float getAttackDamageBonus() {
            return 7.0F;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ItemRegistry.magic_ingot.get());
        }
    };

    public MagicPickaxe(){
        super(iItemTier,0,0.0F,new Properties().tab(GroupRegistry.touhouGroup));
    }
}
