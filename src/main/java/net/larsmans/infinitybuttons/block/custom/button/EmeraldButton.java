package net.larsmans.infinitybuttons.block.custom.button;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.larsmans.infinitybuttons.InfinityButtonsConfig;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EmeraldButton extends AbstractButton {
    InfinityButtonsConfig config = AutoConfig.getConfigHolder(InfinityButtonsConfig.class).getConfig();

    public EmeraldButton(FabricBlockSettings settings) {
        super(false, settings);
    }

    @Override
    public int getPressTicks() {
        return (int)Math.floor(Math.random()*(90-10+1)+10);
    }

    @Override
    protected SoundEvent getClickSound(boolean powered) {
        return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (config.tooltips) {
            if (Screen.hasShiftDown()) {
                tooltip.add(new TranslatableText("infinitybuttons.tooltip.emerald_button1").formatted(Formatting.GRAY));
                tooltip.add(new TranslatableText("infinitybuttons.tooltip.emerald_button2").formatted(Formatting.GRAY));
            } else {
                tooltip.add(new TranslatableText("infinitybuttons.tooltip.hold_shift").formatted(Formatting.GRAY));
            }
        }
    }
}