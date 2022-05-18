package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Item;

public class TouhouCrystalOre extends Item {
    public TouhouCrystalOre() {
        super(new Properties().tab(GroupRegistry.touhouGroup));
    }
}