package net.larsmans.infinitybuttons;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "infinitybuttons")
@Config.Gui.Background("infinitybuttons:textures/block/copper_button.png")
public class InfinityButtonsConfig implements ConfigData {
    @ConfigEntry.Gui.Tooltip
    public boolean alarmSound = true;
    @ConfigEntry.Gui.Tooltip
    public boolean tooltips = true;
    @ConfigEntry.Gui.Tooltip
    public boolean diamondParticles = true;
}
