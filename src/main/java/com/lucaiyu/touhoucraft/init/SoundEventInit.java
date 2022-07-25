package com.lucaiyu.touhoucraft.init;

import com.lucaiyu.touhoucraft.TouHouCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundEventInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TouHouCraft.MOD_ID);
    public static final RegistryObject<SoundEvent> title = SOUNDS.register("TH10_01", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_01")));
    public static final RegistryObject<SoundEvent> stage_01_path = SOUNDS.register("TH10_02", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_02")));
    public static final RegistryObject<SoundEvent> stage_01_final = SOUNDS.register("TH10_03", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_03")));
    public static final RegistryObject<SoundEvent> stage_02_path = SOUNDS.register("TH10_04", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_04")));
    public static final RegistryObject<SoundEvent> stage_02_final = SOUNDS.register("TH10_05", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_05")));
    public static final RegistryObject<SoundEvent> stage_03_path = SOUNDS.register("TH10_06", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_06")));
    public static final RegistryObject<SoundEvent> stage_03_final = SOUNDS.register("TH10_07", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_07")));
    public static final RegistryObject<SoundEvent> stage_04_path = SOUNDS.register("TH10_08", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_08")));
    public static final RegistryObject<SoundEvent> stage_04_final = SOUNDS.register("TH10_09", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_09")));
    public static final RegistryObject<SoundEvent> stage_05_path = SOUNDS.register("TH10_10", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_10")));
    public static final RegistryObject<SoundEvent> stage_05_final = SOUNDS.register("TH10_11", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_11")));
    public static final RegistryObject<SoundEvent> stage_06_path = SOUNDS.register("TH10_12", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_12")));
    public static final RegistryObject<SoundEvent> stage_06_final = SOUNDS.register("TH10_13", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_13")));
    public static final RegistryObject<SoundEvent> stage_extra_path = SOUNDS.register("TH10_14", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_14")));
    public static final RegistryObject<SoundEvent> stage_extra_final = SOUNDS.register("TH10_15", () -> new SoundEvent(new ResourceLocation(TouHouCraft.MOD_ID, "TH10_15")));
}
