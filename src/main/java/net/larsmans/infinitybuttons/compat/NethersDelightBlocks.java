package net.larsmans.infinitybuttons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.larsmans.infinitybuttons.InfinityButtonsInit;
import net.larsmans.infinitybuttons.block.custom.HoglinMountButton;
import net.larsmans.infinitybuttons.block.custom.torch.PropelTorchButton;
import net.larsmans.infinitybuttons.block.custom.torch.PropelTorchLever;
import net.larsmans.infinitybuttons.block.custom.torch.PropelWallTorchButton;
import net.larsmans.infinitybuttons.block.custom.torch.PropelWallTorchLever;
import net.larsmans.infinitybuttons.item.InfinityButtonsItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NethersDelightBlocks {

    public static final Block HOGLIN_MOUNT_BUTTON = registerBlock("hoglin_mount_button",
            new HoglinMountButton(FabricBlockSettings.of(Material.WOOL, MapColor.BROWN).strength(0.8f).sounds(BlockSoundGroup.WOOL)), InfinityButtonsItemGroup.INFINITYBUTTONS);

    public static final Block PROPELPLANT_TORCH_BUTTON = registerBlock("propelplant_torch_button",
            new PropelTorchButton(FabricBlockSettings.of(Material.DECORATION).nonOpaque().noCollision().breakInstantly().luminance(12).sounds(BlockSoundGroup.WOOD)));

    public static final Block PROPELPLANT_WALL_TORCH_BUTTON = registerBlock("propelplant_wall_torch_button",
            new PropelWallTorchButton(FabricBlockSettings.of(Material.DECORATION).nonOpaque().noCollision().breakInstantly().luminance(12).sounds(BlockSoundGroup.WOOD).dropsLike(PROPELPLANT_TORCH_BUTTON)));

    public static final Block PROPELPLANT_TORCH_LEVER = registerBlock("propelplant_torch_lever",
            new PropelTorchLever(FabricBlockSettings.of(Material.DECORATION).nonOpaque().noCollision().breakInstantly().luminance(12).sounds(BlockSoundGroup.WOOD)));

    public static final Block PROPELPLANT_WALL_TORCH_LEVER = registerBlock("propelplant_wall_torch_lever",
            new PropelWallTorchLever(FabricBlockSettings.of(Material.DECORATION).nonOpaque().noCollision().breakInstantly().luminance(12).sounds(BlockSoundGroup.WOOD).dropsLike(PROPELPLANT_TORCH_LEVER)));

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(InfinityButtonsInit.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(InfinityButtonsInit.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(InfinityButtonsInit.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerCompatBlocks() {
        InfinityButtonsInit.LOGGER.debug("Registering Compat Blocks for Infinity Buttons");
    }
}
