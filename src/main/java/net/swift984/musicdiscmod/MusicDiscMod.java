package net.swift984.musicdiscmod;

import net.fabricmc.api.ModInitializer;
import net.swift984.musicdiscmod.item.ModItems;
import net.swift984.musicdiscmod.sound.ModSounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MusicDiscMod implements ModInitializer {
	public static final String MOD_ID = "musicdiscmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();


		LOGGER.info("Good evening my brothers and sisters. Welcome to my modification.");

	}
}