package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Item;

public class TouhouCrystal extends Item {
    public TouhouCrystal(){
        super(new Properties().tab(GroupRegistry.touhouGroup));
    }
}
