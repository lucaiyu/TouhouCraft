package com.lucaiyu.touhoucraft.world.gen;

import com.lucaiyu.touhoucraft.init.BlockInit;
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
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.touhou_crystal_ore.get().getDefaultState(), 16, 6, 0, 7, 16);
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.magic_ore.get().getDefaultState(), 1, 1, 0, 5, 1);
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, BlockInit.touhou_crystal_ore_in_nether.get().getDefaultState(), 3, 30, 0, 31, 2);
        oreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, BlockInit.magic_ore_in_nether.get().getDefaultState(), 16, 30, 0, 31, 16);
    }
    private static void oreGenerate(BiomeGenerationSettingsBuilder settings,
                                    RuleTest fillerType,
                                    BlockState state,
                                    int veinSize,
                                    int minimalHeight,
                                    int topOffset,
                                    int maximalHeight,
                                    int countPerChunk){
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minimalHeight, topOffset, maximalHeight))).square().func_242731_b(countPerChunk));
    }
}
