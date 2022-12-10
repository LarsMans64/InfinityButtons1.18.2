package net.larsmans.infinitybuttons.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.larsmans.infinitybuttons.InfinityButtonsInit;
import net.larsmans.infinitybuttons.block.custom.secretbutton.BookshelfSecretButton;
import net.larsmans.infinitybuttons.item.InfinityButtonsItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CarpenterBlocks {
    
    private static final Block BIRCH_BOOKSHELF_SECRET_BUTTON = registerBookshelf("birch");
    
    private static final Block SPRUCE_BOOKSHELF_SECRET_BUTTON = registerBookshelf("spruce");
    
    private static final Block ACACIA_BOOKSHELF_SECRET_BUTTON = registerBookshelf("acacia");
    
    private static final Block DARK_OAK_BOOKSHELF_SECRET_BUTTON = registerBookshelf("dark_oak");
    
    private static final Block JUNGLE_BOOKSHELF_SECRET_BUTTON = registerBookshelf("jungle");
    
    private static final Block CRIMSON_BOOKSHELF_SECRET_BUTTON = registerBookshelf("crimson");
    
    private static final Block WARPED_BOOKSHELF_SECRET_BUTTON = registerBookshelf("warped");
    
    private static final Block registerBookshelf(String wood) {
        return registerBlock("carpenter_" + wood + "_bookshelf_secret_button", new BookshelfSecretButton(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).strength(1.5f)));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(InfinityButtonsInit.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(InfinityButtonsInit.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(InfinityButtonsItemGroup.INFINITYBUTTONS)));
    }

    public static void registerCompatBlocks() {
        InfinityButtonsInit.LOGGER.debug("Registering Carpenter Compat Blocks for Infinity Buttons");
    }
}
