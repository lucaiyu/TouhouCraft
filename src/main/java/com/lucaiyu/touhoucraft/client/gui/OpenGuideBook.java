package com.lucaiyu.touhoucraft.client.gui;

import com.lucaiyu.touhoucraft.TouHouCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TranslationTextComponent;

public class OpenGuideBook {
    public OpenGuideBook(){
        Minecraft.getInstance().displayGuiScreen(new GuideBookGui(new TranslationTextComponent(TouHouCraft.MOD_ID + "guide_book")));
    }
}
