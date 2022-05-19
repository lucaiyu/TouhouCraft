package com.lucaiyu.touhoucraft.world.gen;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenerater {
    public static void generateOres(final BiomeLoadingEvent event){
        if(!(event.getCategory().equals(Biome.Category.NETHER))){}
    }
}
