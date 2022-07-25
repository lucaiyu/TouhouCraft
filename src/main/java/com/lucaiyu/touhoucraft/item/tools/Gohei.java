package com.lucaiyu.touhoucraft.item.tools;

import com.lucaiyu.touhoucraft.init.TabInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class Gohei extends SwordItem {
    private static final IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 65535;
        }

        @Override
        public float getEfficiency() {
            return 20.0F;
        }

        @Override
        public float getAttackDamage() {
            return 30.0F;
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
            return null;
        }
    };
    public Gohei(){
        super(iItemTier, 30, -2.4F, new Properties().isImmuneToFire().group(TabInit.touhouGroup));
    }

}
