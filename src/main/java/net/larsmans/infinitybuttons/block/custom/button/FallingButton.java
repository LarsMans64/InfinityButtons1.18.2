package net.larsmans.infinitybuttons.block.custom.button;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.larsmans.infinitybuttons.InfinityButtonsConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class FallingButton extends AbstractButton {
    InfinityButtonsConfig config = AutoConfig.getConfigHolder(InfinityButtonsConfig.class).getConfig();

    public boolean gravel;

    public FallingButton(boolean gravel, FabricBlockSettings settings) {
        super(false, settings);
        this.gravel = gravel;
    }

    @Override
    public int getPressTicks() {
        return 10;
    }

    @Override
    protected SoundEvent getClickSound(boolean pressed) {
        return gravel ? SoundEvents.BLOCK_GRAVEL_BREAK : SoundEvents.BLOCK_SAND_BREAK;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.get(PRESSED)) {
            world.setBlockState(pos, (BlockState)state.with(PRESSED, false), Block.NOTIFY_ALL);
            this.updateNeighbors(state, world, pos);
            this.playClickSound(null, world, pos, false);
            world.breakBlock(pos, false);
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (config.tooltips) {
            if (Screen.hasShiftDown()) {
                tooltip.add(new TranslatableText("infinitybuttons.tooltip.falling_button").formatted(Formatting.GRAY));
            } else {
                tooltip.add(new TranslatableText("infinitybuttons.tooltip.hold_shift").formatted(Formatting.GRAY));
            }
        }
    }
}
