package net.larsmans.infinitybuttons;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.larsmans.infinitybuttons.compatregistries.NethersDelightBlocks;
import net.minecraft.client.render.RenderLayer;

public class InfinityButtonsClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.TORCH_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.WALL_TORCH_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.TORCH_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.WALL_TORCH_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.SOUL_TORCH_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.SOUL_WALL_TORCH_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.SOUL_TORCH_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.SOUL_WALL_TORCH_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.REDSTONE_TORCH_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.REDSTONE_WALL_TORCH_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.REDSTONE_TORCH_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.REDSTONE_WALL_TORCH_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.RED_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.ORANGE_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.YELLOW_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.LIME_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.GREEN_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.CYAN_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.LIGHT_BLUE_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.BLUE_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.PURPLE_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.MAGENTA_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.PINK_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.BROWN_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.WHITE_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.LIGHT_GRAY_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.GRAY_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.BLACK_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(InfinityButtonsBlocks.FANCY_SAFE_EMERGENCY_BUTTON, RenderLayer.getCutout());

        if (FabricLoader.getInstance().isModLoaded("nethersdelight")) {
            BlockRenderLayerMap.INSTANCE.putBlock(NethersDelightBlocks.PROPELPLANT_TORCH_BUTTON, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NethersDelightBlocks.PROPELPLANT_WALL_TORCH_BUTTON, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NethersDelightBlocks.PROPELPLANT_TORCH_LEVER, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NethersDelightBlocks.PROPELPLANT_WALL_TORCH_LEVER, RenderLayer.getCutout());
        }
    }
}
