package com.lucaiyu.touhoucraft.items;

import com.lucaiyu.touhoucraft.groups.GroupRegistry;
import net.minecraft.item.Item;

public class GuideBook extends Item {
    public GuideBook(){
        super(new Properties().group(GroupRegistry.touhouGroup));
    }
}
