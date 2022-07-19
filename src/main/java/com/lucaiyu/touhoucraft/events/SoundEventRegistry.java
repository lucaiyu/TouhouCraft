package com.lucaiyu.touhoucraft.events;

import com.lucaiyu.touhoucraft.TouHouCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TouHouCraft.MOD_ID);
    public static final RegistryObject<SoundEvent> meaSound = SOUNDS.register("dream_battle", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "dream_battle")));
}
