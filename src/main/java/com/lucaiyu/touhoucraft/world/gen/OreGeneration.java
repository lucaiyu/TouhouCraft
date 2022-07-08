package com.lucaiyu.touhoucraft.world.gen;

import com.lucaiyu.touhoucraft.blocks.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.touhou_crystal_ore.get().defaultBlockState(), 16, 6, 0, 7, 16);
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.magic_ore.get().defaultBlockState(), 1, 1, 0, 5, 1);
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BlockRegistry.touhou_crystal_ore_in_nether.get().defaultBlockState(), 3, 30, 0, 31, 2);
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.magic_ore_in_nether.get().defaultBlockState(), 16, 30, 0, 31, 16);
    }
    private static void oreGenerate(BiomeGenerationSettingsBuilder settings,
                                    RuleTest fillerType,
                                    BlockState state,
                                    int veinSize,
                                    int minimalHeight,
                                    int topOffset,
                                    int maximalHeight,
                                    int countPerChunk){
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minimalHeight, topOffset, maximalHeight))).squared().count(countPerChunk));
    }
}
