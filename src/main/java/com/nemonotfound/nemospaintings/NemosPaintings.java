package com.nemonotfound.nemospaintings;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosPaintings implements ModInitializer {

	public static final String MOD_ID = "nemos-paintings";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Paintings!");
	}
}