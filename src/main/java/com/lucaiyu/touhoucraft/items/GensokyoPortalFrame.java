package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class GensokyoPortalFrame extends Item {
    public GensokyoPortalFrame() {
        super(new Properties().tab(GroupRegistry.touhouGroup));
    }
}
