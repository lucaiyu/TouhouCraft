package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Item;

public class MagicOre extends Item {
    public MagicOre(){
        super(new Properties().tab(GroupRegistry.touhouGroup));
    }
}
