package com.lucaiyu.touhoucraft.events;

import com.lucaiyu.touhoucraft.TouHouCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TouHouCraft.MOD_ID);
    public static final RegistryObject<SoundEvent> title = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_01")));
    public static final RegistryObject<SoundEvent> stage_01_path = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_02")));
    public static final RegistryObject<SoundEvent> stage_01_final = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_03")));
    public static final RegistryObject<SoundEvent> stage_02_path = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_04")));
    public static final RegistryObject<SoundEvent> stage_02_final = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_05")));
    public static final RegistryObject<SoundEvent> stage_03_path = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_06")));
    public static final RegistryObject<SoundEvent> stage_03_final = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_07")));
    public static final RegistryObject<SoundEvent> stage_04_path = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_08")));
    public static final RegistryObject<SoundEvent> stage_04_final = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_09")));
    public static final RegistryObject<SoundEvent> stage_05_path = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_10")));
    public static final RegistryObject<SoundEvent> stage_05_final = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_11")));
    public static final RegistryObject<SoundEvent> stage_06_path = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_12")));
    public static final RegistryObject<SoundEvent> stage_06_final = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_13")));
    public static final RegistryObject<SoundEvent> stage_extra_path = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_14")));
    public static final RegistryObject<SoundEvent> stage_extra_final = SOUNDS.register("title", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_15")));
}
