package net.aaronr.turtlesmod.datagen;

import net.aaronr.turtlesmod.block.ModBlocks;
import net.aaronr.turtlesmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

 public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHEESE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHURIKEN, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
    }
}
