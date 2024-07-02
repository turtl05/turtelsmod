package net.aaronr.turtlesmod.item;



import net.aaronr.turtlesmod.TurtlesMod;
import net.aaronr.turtlesmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    public static final ItemGroup COOL_SHIT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtlesMod.MOD_ID, "coolshit"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coolshit"))
                    .icon(() -> new ItemStack(ModItems.COPPER_SWORD)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.SHURIKEN);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModBlocks.CHEESE_BLOCK);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModBlocks.GREENTNT_BLOCK);
                        entries.add(Items.MILK_BUCKET);

                    }).build());


    public static void registerItemGroups() {
        TurtlesMod.LOGGER.info("Registering Item Groups for " + TurtlesMod.MOD_ID);
    }
}
