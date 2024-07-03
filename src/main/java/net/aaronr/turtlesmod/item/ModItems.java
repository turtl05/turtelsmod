package net.aaronr.turtlesmod.item;

import net.aaronr.turtlesmod.TurtlesMod;
import net.aaronr.turtlesmod.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_SWORD = registerItem("copper_sword", new Item(new Item.Settings()));
    public static final Item SHURIKEN = registerItem("shuriken", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item MONEY = registerItem("money", new Item(new Item.Settings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new Item.Settings().maxDamage(128)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, new Item.Settings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_SWORD);
        entries.add(SHURIKEN);
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(MONEY);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TurtlesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TurtlesMod.LOGGER.info("Registering Mod Items for " + TurtlesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
