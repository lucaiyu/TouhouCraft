package com.lucaiyu.touhoucraft.items.foods;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ZunBeer extends Item {
    private static final EffectInstance effectInstance=new EffectInstance(Effects.POISON,3*20,1);
    private static final Food food=(new Food.Builder())
            .saturation(2.0F)
            .hunger(8)
            .effect(()->new EffectInstance(Effects.NAUSEA,100,2),0.5f)
            .effect(()->new EffectInstance(Effects.STRENGTH,1000,2),1f).build();

    public ZunBeer(){
        super(new Properties().food(food).group(GroupRegistry.touhouGroup));
    }
}
