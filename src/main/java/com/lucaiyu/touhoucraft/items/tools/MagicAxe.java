package com.lucaiyu.touhoucraft.items.tools;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import com.lucaiyu.touhoucraft.items.ItemRegistry;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class MagicAxe extends AxeItem {
    private static final IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 512;
        }

        @Override
        public float getEfficiency() {
            return 30.0F;
        }

        @Override
        public float getAttackDamage() {
            return 16.0F;
        }

        @Override
        public int getHarvestLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 0;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ItemRegistry.magic_ingot.get());
        }
    };
    public MagicAxe(){
        super(iItemTier,0,0.0F,new Properties().group(GroupRegistry.touhouGroup));
    }
}
