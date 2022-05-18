package com.lucaiyu.touhoucraft.groups;

import com.lucaiyu.touhoucraft.items.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GroupMoreItem extends ItemGroup {
    public GroupMoreItem(){
        super("touhouGroup");
    }
    public ItemStack makeIcon(){
        return new ItemStack(ItemRegistry.gohei.get());
    }

}
