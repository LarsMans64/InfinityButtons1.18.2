package net.larsmans.infinitybuttons.block.custom.button;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.larsmans.infinitybuttons.InfinityButtonsConfig;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ArrowButton extends AbstractButton {
    
    InfinityButtonsConfig config = AutoConfig.getConfigHolder(InfinityButtonsConfig.class).getConfig();
    public ArrowButton(FabricBlockSettings settings) {
        super(true, settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return ActionResult.FAIL;
    }

    @Override
    public int getPressTicks() {
        return 10;
    }

    @Override
    protected SoundEvent getClickSound(boolean powered) {
        return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (config.tooltips) {
            if (Screen.hasShiftDown()) {
                tooltip.add(new TranslatableText("infinitybuttons.tooltip.arrow_button").formatted(Formatting.GRAY));
            } else {
                tooltip.add(new TranslatableText("infinitybuttons.tooltip.hold_shift").formatted(Formatting.GRAY));
            }
        }
    }
}