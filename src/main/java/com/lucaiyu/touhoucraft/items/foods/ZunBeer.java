package com.lucaiyu.touhoucraft.items.foods;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ZunBeer extends Item {
    private static final EffectInstance effectInstance=new EffectInstance(Effects.POISON,3*20,1);
    private static final Food food=(new Food.Builder())
            .saturationMod(2.0F)
            .nutrition(8)
            .effect(()->new EffectInstance(Effects.DAMAGE_BOOST,1000,2),1f).alwaysEat().build();

    public ZunBeer(){
        super(new Properties().food(food).tab(GroupRegistry.touhouGroup));
    }
}
