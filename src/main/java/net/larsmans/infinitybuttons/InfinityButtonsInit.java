package net.larsmans.infinitybuttons;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.larsmans.infinitybuttons.item.InfinityButtonsItems;
import net.larsmans.infinitybuttons.sounds.InfinityButtonsSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityButtonsInit implements ModInitializer {
	public static final String MOD_ID = "infinitybuttons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AutoConfig.register(InfinityButtonsConfig.class, JanksonConfigSerializer::new);
		InfinityButtonsItems.registerModItems();
		InfinityButtonsBlocks.registerModBlocks();
		InfinityButtonsSounds.registerSounds();
	}
}