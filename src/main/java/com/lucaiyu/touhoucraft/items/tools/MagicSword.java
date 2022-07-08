package com.lucaiyu.touhoucraft.items.tools;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import com.lucaiyu.touhoucraft.items.ItemRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class MagicSword extends SwordItem {
    private static final IItemTier iItemTier=new IItemTier(){
        @Override
        public int getUses() {
            return 128;
        }

        @Override
        public float getSpeed() {
            return 10.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            return 15.0F;
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
            return Ingredient.of(ItemRegistry.magic_ingot.get());
        }
    };
    public MagicSword(){
        super(iItemTier, 0, -2.4F, new Item.Properties().tab(GroupRegistry.touhouGroup));
    }

}
