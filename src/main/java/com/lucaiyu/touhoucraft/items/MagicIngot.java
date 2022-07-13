package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Item;

public class MagicIngot extends Item {
    public MagicIngot() {
        super(new Properties().group(GroupRegistry.touhouGroup));
    }
}
