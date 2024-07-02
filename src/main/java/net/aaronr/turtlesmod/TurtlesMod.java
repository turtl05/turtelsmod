package net.aaronr.turtlesmod;

import net.aaronr.turtlesmod.block.ModBlocks;
import net.aaronr.turtlesmod.item.ModItemGroups;
import net.aaronr.turtlesmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TurtlesMod implements ModInitializer {

	public static final String MOD_ID = "turtlesmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.MONEY, 1200);
	}
}