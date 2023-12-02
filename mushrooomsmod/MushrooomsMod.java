package net.louis.mushrooomsmod;

import net.fabricmc.api.ModInitializer;

import net.louis.mushrooomsmod.block.ModBlocks;
import net.louis.mushrooomsmod.item.ModItems;
import net.louis.mushrooomsmod.particle.ModParticles;
import net.louis.mushrooomsmod.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MushrooomsMod implements ModInitializer {

	public static final String MOD_ID = "mushrooomsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModParticles.registerParticles();
		ModSounds.registerModSound();
		System.out.println("Starting Mushroooms Mod!");

	}
}