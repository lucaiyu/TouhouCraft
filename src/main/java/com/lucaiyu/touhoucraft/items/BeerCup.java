package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Item;

public class BeerCup extends Item {
    public BeerCup() {
        super(new Properties().group(GroupRegistry.touhouGroup));
    }
}
