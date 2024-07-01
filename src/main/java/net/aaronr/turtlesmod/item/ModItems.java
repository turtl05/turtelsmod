package net.aaronr.turtlesmod.item;

import net.aaronr.turtlesmod.TurtlesMod;
import net.aaronr.turtlesmod.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_SWORD = registerItem("copper_sword", new Item(new Item.Settings()));
    public static final Item SHURIKEN = registerItem("shuriken", new Item(new Item.Settings()));

    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new Item.Settings().maxDamage(128)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_SWORD);
        entries.add(SHURIKEN);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TurtlesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TurtlesMod.LOGGER.info("Registering Mod Items for " + TurtlesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
