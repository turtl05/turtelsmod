package net.aaronr.turtlesmod.block;

import net.aaronr.turtlesmod.TurtlesMod;
import net.aaronr.turtlesmod.block.custom.GreenTntBlock;
import net.aaronr.turtlesmod.block.custom.SoundBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CHEESE_BLOCK = registerBlock("cheese_block",
            new Block(AbstractBlock.Settings.copy(Blocks.WET_SPONGE)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block GREENTNT_BLOCK = registerBlock("greentnt_block",
            new GreenTntBlock(AbstractBlock.Settings.copy(Blocks.TNT)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_ORE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TurtlesMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(TurtlesMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

        TurtlesMod.LOGGER.info("Registering ModBlocks for " + TurtlesMod.MOD_ID);

    }
}
