package net.larsmans.infinitybuttons;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.larsmans.infinitybuttons.compat.IBCarpenterBlocks;
import net.larsmans.infinitybuttons.compat.IBNethersDelightBlocks;
import net.larsmans.infinitybuttons.compat.IBNethersDelightItems;
import net.larsmans.infinitybuttons.config.InfinityButtonsConfig;
import net.larsmans.infinitybuttons.item.InfinityButtonsItems;
import net.larsmans.infinitybuttons.sounds.InfinityButtonsSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityButtonsInit implements ModInitializer {
	public static final String MOD_ID = "infinitybuttons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static InfinityButtonsConfig config;

	@Override
	public void onInitialize() {
		AutoConfig.register(InfinityButtonsConfig.class, JanksonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(InfinityButtonsConfig.class).getConfig();

		InfinityButtonsItems.registerModItems();
		InfinityButtonsBlocks.registerModBlocks();
		InfinityButtonsSounds.registerSounds();

		if (FabricLoader.getInstance().isModLoaded("nethersdelight")) {
			IBNethersDelightItems.registerCompatItems();
			IBNethersDelightBlocks.registerCompatBlocks();
		}

		if (FabricLoader.getInstance().isModLoaded("carpenter")) {
			IBCarpenterBlocks.registerCompatBlocks();
		}
	}
}