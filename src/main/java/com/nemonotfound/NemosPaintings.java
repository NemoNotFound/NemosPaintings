package com.nemonotfound;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.enums.ArtType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.event.defs.CommonEvents;
import turniplabs.halplibe.helper.EnvironmentHelper;
import turniplabs.halplibe.helper.TextureHelper;
import turniplabs.halplibe.util.dependency.Key;

public class NemosPaintings implements ModInitializer {
	public static final String MOD_ID = HalpLibe.registerMod("nemos_paintings", true);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ArtType BEST_MODERATOR;
	public static ArtType NEMOS_PORTRAIT;
	public static ArtType DEEP_BLUE;
	public static ArtType BEACH;
	public static ArtType NIGHT_WATCHING;
	public static ArtType CRIMSON;
	public static ArtType CRIMSON_CLAW;
	public static ArtType LONE_WOLF;
	public static ArtType NETHER_WASTES;
	public static ArtType CATS_SUNSET;

	@Override
	public void onInitialize() {
		CommonEvents.BEFORE_GAME_START.listen(Key.of(MOD_ID), this::beforeGameStart);
		BEST_MODERATOR = new ArtType("best_moderator", "Best Moderator", "Nemo", "nemos_paintings:art/best_moderator", 64, 32);
		NEMOS_PORTRAIT = new ArtType("nemos_portrait", "Nemo's Portrait", "Nemo", "nemos_paintings:art/nemos_portrait", 16, 16);
		DEEP_BLUE = new ArtType("deep_blue", "Deep Blue", "ChemDrop", "nemos_paintings:art/deep_blue", 16, 16);
		BEACH = new ArtType("beach", "Beach", "Nemo", "nemos_paintings:art/beach", 32, 16);
		NIGHT_WATCHING = new ArtType("night_watching", "Night Watching", "Pnku", "nemos_paintings:art/night_watching", 16, 16);
		CRIMSON = new ArtType("crimson", "Crimson", "Nemo", "nemos_paintings:art/crimson", 16, 16);
		CRIMSON_CLAW = new ArtType("crimson_claw", "Crimson Claw", "ChemDrop", "nemos_paintings:art/crimson_claw", 16, 16);
		LONE_WOLF = new ArtType("lone_wolf", "Lone Wolf", "ChemDrop", "nemos_paintings:art/lone_wolf", 32, 32);
		NETHER_WASTES = new ArtType("nether_wastes", "Nether Wastes", "ChemDrop", "nemos_paintings:art/nether_wastes", 16, 32);
		CATS_SUNSET = new ArtType("cats_sunset", "Cat's Sunset", "Seli", "nemos_paintings:art/cats_sunset", 32, 32);
		LOGGER.info("Thank you for using Nemo's");
	}

	public void beforeGameStart() {
		if (!EnvironmentHelper.isMultiplayerServer()) {
		TextureHelper.initializeAllFiles(MOD_ID, TextureRegistry.artAtlas, true);
		}
	}
}
