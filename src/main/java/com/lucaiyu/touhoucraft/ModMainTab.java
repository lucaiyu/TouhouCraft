package com.lucaiyu.touhoucraft;

import com.lucaiyu.touhoucraft.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModMainTab extends ItemGroup {
    public ModMainTab(){
        super("touhouGroup");
    }
    public ItemStack createIcon(){
        return new ItemStack(ItemInit.gohei.get());
    }

}
