package net.larsmans.infinitybuttons.block.custom.torch;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class RedstoneWallTorchLever extends RedstoneWallTorchButton {

    public RedstoneWallTorchLever(FabricBlockSettings settings, Block jadeBlock) {
        super(settings, jadeBlock);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(LIT)) {
            this.powerOff(state, world, pos);
            this.playClickSound(player, world, pos, false);
            world.emitGameEvent(player, GameEvent.BLOCK_UNPRESS, pos);
        } else {
            this.powerOn(state, world, pos);
            this.playClickSound(player, world, pos, true);
            world.emitGameEvent(player, GameEvent.BLOCK_PRESS, pos);
        }
        return ActionResult.success(world.isClient);
    }

    @Override
    public void powerOn(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, state.with(LIT, true), Block.NOTIFY_ALL);
        this.updateNeighbors(state, world, pos);
    }

    public void powerOff(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, state.with(LIT, false), Block.NOTIFY_ALL);
        this.updateNeighbors(state, world, pos);
    }
}
