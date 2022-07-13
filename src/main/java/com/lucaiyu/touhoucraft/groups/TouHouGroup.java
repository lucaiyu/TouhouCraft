package com.lucaiyu.touhoucraft.groups;

import com.lucaiyu.touhoucraft.items.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TouHouGroup extends ItemGroup {
    public TouHouGroup(){
        super("touhouGroup");
    }
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistry.gohei.get());
    }

}
