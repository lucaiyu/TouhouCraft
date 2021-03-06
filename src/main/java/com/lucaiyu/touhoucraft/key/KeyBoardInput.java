package com.lucaiyu.touhoucraft.key;

import com.lucaiyu.touhoucraft.TouHouCraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber
public class KeyBoardInput {
    public static final KeyBinding JUMP_DIALOGUE = new KeyBinding("key.jump_dialogue", KeyConflictContext.IN_GAME, KeyModifier.NONE, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_Z, "key.category." + TouHouCraft.MOD_ID);

    @SubscribeEvent
    public static void onKeyboardInput(InputEvent.KeyInputEvent event) {
        return;
    }
}
