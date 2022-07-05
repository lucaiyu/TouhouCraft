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
    public void generatrOres(final BiomeLoadingEvent event){
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.touhou_crystal_ore.get().defaultBlockState(), 8, 8, 0, 64, 8);
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.magic_ore.get().defaultBlockState(), 8, 8, 0, 64, 8);
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
