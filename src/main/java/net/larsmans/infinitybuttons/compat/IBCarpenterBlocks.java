package net.larsmans.infinitybuttons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.larsmans.infinitybuttons.InfinityButtonsInit;
import net.larsmans.infinitybuttons.block.custom.secretbutton.BookshelfSecretButton;
import net.larsmans.infinitybuttons.item.InfinityButtonsItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class IBCarpenterBlocks {

    public static final Block SPRUCE_BOOKSHELF_SECRET_BUTTON = registerBookshelfSecretButton("spruce");
    public static final Block BIRCH_BOOKSHELF_SECRET_BUTTON = registerBookshelfSecretButton("birch");
    public static final Block JUNGLE_BOOKSHELF_SECRET_BUTTON = registerBookshelfSecretButton("jungle");
    public static final Block ACACIA_BOOKSHELF_SECRET_BUTTON = registerBookshelfSecretButton("acacia");
    public static final Block DARK_OAK_BOOKSHELF_SECRET_BUTTON = registerBookshelfSecretButton("dark_oak");
    public static final Block CRIMSON_BOOKSHELF_SECRET_BUTTON = registerBookshelfSecretButton("crimson");
    public static final Block WARPED_BOOKSHELF_SECRET_BUTTON = registerBookshelfSecretButton("warped");
    
    private static Block registerBookshelfSecretButton(String name) {
        return registerBlockWithItem("carpenter_" + name + "_bookshelf_secret_button", new BookshelfSecretButton(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).strength(1.5f), byName(name + "_bookshelf")));
    }

    private static Block byName(String block) {
        return Registry.BLOCK.get(new Identifier("carpenter", block));
    }

    private static Block registerBlockWithItem(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier("infinitybuttons", name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier("infinitybuttons", name),
                new BlockItem(block, new FabricItemSettings().group(InfinityButtonsItemGroup.INFINITYBUTTONS)));
    }

    public static void registerCompatBlocks() {
        InfinityButtonsInit.LOGGER.debug("Registering Carpenter Compat Blocks for Infinity Buttons");
    }
}
