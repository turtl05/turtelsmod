package net.aaronr.turtlesmod.datagen;

import net.aaronr.turtlesmod.block.ModBlocks;
import net.aaronr.turtlesmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider<Block> {

    public ModBlockTagProvider(FabricDataOutput output, RegistryKey registryKey, CompletableFuture registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.RUBY_ORE)
        .forceAddTag(BlockTags.GOLD_ORES)
        .forceAddTag(BlockTags.EMERALD_ORES)
        .forceAddTag(BlockTags.REDSTONE_ORES)
        .forceAddTag(BlockTags.LAPIS_ORES)
        .forceAddTag(BlockTags.DIAMOND_ORES)
        .forceAddTag(BlockTags.IRON_ORES)
        .forceAddTag(BlockTags.COPPER_ORES)
        .forceAddTag(BlockTags.COAL_ORES);


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.END_STONE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.CHEESE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.END_STONE_RUBY_ORE);
    }
}
