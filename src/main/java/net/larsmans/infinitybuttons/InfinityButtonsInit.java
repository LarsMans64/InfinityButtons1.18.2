package net.larsmans.infinitybuttons;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.larsmans.infinitybuttons.compatregistries.NethersDelightBlocks;
import net.larsmans.infinitybuttons.compatregistries.NethersDelightItems;
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
		AutoConfig.register(InfinityButtonsConfig.class, Toml4jConfigSerializer::new);
		config = AutoConfig.getConfigHolder(InfinityButtonsConfig.class).getConfig();

		InfinityButtonsItems.registerModItems();
		InfinityButtonsBlocks.registerModBlocks();
		InfinityButtonsSounds.registerSounds();

		if (FabricLoader.getInstance().isModLoaded("nethersdelight")) {
			NethersDelightItems.registerCompatItems();
			NethersDelightBlocks.registerCompatBlocks();
		}
	}
}