package net.larsmans.infinitybuttons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.larsmans.infinitybuttons.compat.IBCarpenterBlocks;
import net.larsmans.infinitybuttons.compat.IBNethersDelightBlocks;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class LootTableGen extends SimpleFabricLootTableProvider {
    public LootTableGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> i) {
        generateLootTable(i, InfinityButtonsBlocks.DEEPSLATE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GRANITE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DIORITE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.ANDESITE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CALCITE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.TUFF_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DRIPSTONE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.EXPOSED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WEATHERED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.OXIDIZED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WAXED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STICKY_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STICKY_EXPOSED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STICKY_WEATHERED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STICKY_OXIDIZED_COPPER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.IRON_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GOLD_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.EMERALD_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DIAMOND_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PRISMARINE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PRISMARINE_BRICK_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DARK_PRISMARINE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.SAND_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.RED_SAND_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GRAVEL_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WHITE_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIGHT_GRAY_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GRAY_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BLACK_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BROWN_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.RED_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.ORANGE_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.YELLOW_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIME_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GREEN_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CYAN_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIGHT_BLUE_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BLUE_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PURPLE_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.MAGENTA_CONCRETE_POWDER_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PINK_CONCRETE_POWDER_BUTTON);

        generateLootTable(i, InfinityButtonsBlocks.OAK_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.SPRUCE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BIRCH_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.JUNGLE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.ACACIA_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DARK_OAK_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CRIMSON_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WARPED_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STONE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DEEPSLATE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GRANITE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DIORITE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.ANDESITE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CALCITE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.TUFF_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DRIPSTONE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.EXPOSED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WEATHERED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.OXIDIZED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WAXED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WAXED_EXPOSED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WAXED_WEATHERED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WAXED_OXIDIZED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STICKY_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STICKY_EXPOSED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STICKY_WEATHERED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STICKY_OXIDIZED_COPPER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.IRON_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GOLD_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.EMERALD_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DIAMOND_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PRISMARINE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PRISMARINE_BRICK_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DARK_PRISMARINE_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.SAND_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.RED_SAND_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GRAVEL_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WHITE_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIGHT_GRAY_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GRAY_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BLACK_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BROWN_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.RED_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.ORANGE_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.YELLOW_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIME_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GREEN_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CYAN_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIGHT_BLUE_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BLUE_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PURPLE_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.MAGENTA_CONCRETE_POWDER_LARGE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PINK_CONCRETE_POWDER_LARGE_BUTTON);

        generateLootTable(i, InfinityButtonsBlocks.WHITE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIGHT_GRAY_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GRAY_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BLACK_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BROWN_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.RED_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.ORANGE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.YELLOW_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIME_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GREEN_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CYAN_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIGHT_BLUE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BLUE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PURPLE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.MAGENTA_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PINK_EMERGENCY_BUTTON);

        generateLootTable(i, InfinityButtonsBlocks.WHITE_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIGHT_GRAY_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GRAY_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BLACK_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BROWN_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.RED_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.ORANGE_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.YELLOW_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIME_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.GREEN_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CYAN_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LIGHT_BLUE_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BLUE_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PURPLE_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.MAGENTA_SAFE_EMERGENCY_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.PINK_SAFE_EMERGENCY_BUTTON);

        generateLootTable(i, InfinityButtonsBlocks.BOOKSHELF_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.STONE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.MOSSY_STONE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CRACKED_STONE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CHISELED_STONE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DEEPSLATE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CRACKED_DEEPSLATE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DEEPSLATE_TILE_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CRACKED_DEEPSLATE_TILE_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.OAK_PLANK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.SPRUCE_PLANK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BIRCH_PLANK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.JUNGLE_PLANK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.ACACIA_PLANK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DARK_OAK_PLANK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CRIMSON_PLANK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.WARPED_PLANK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.END_STONE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.QUARTZ_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.DARK_PRISMARINE_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.POLISHED_BLACKSTONE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CHISELED_POLISHED_BLACKSTONE_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.NETHER_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CRACKED_NETHER_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CHISELED_NETHER_BRICK_SECRET_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.RED_NETHER_BRICK_SECRET_BUTTON);

        generateLootTable(i, IBCarpenterBlocks.SPRUCE_BOOKSHELF_SECRET_BUTTON);
        generateLootTable(i, IBCarpenterBlocks.BIRCH_BOOKSHELF_SECRET_BUTTON);
        generateLootTable(i, IBCarpenterBlocks.JUNGLE_BOOKSHELF_SECRET_BUTTON);
        generateLootTable(i, IBCarpenterBlocks.ACACIA_BOOKSHELF_SECRET_BUTTON);
        generateLootTable(i, IBCarpenterBlocks.DARK_OAK_BOOKSHELF_SECRET_BUTTON);
        generateLootTable(i, IBCarpenterBlocks.CRIMSON_BOOKSHELF_SECRET_BUTTON);
        generateLootTable(i, IBCarpenterBlocks.WARPED_BOOKSHELF_SECRET_BUTTON);

        generateLootTable(i, InfinityButtonsBlocks.DOORBELL);
        generateLootTable(i, InfinityButtonsBlocks.DOORBELL_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LAMP_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LAMP_LEVER);
        generateLootTable(i, InfinityButtonsBlocks.LANTERN_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LANTERN_LEVER);
        generateLootTable(i, InfinityButtonsBlocks.SOUL_LANTERN_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.SOUL_LANTERN_LEVER);
        generateLootTable(i, IBNethersDelightBlocks.HOGLIN_MOUNT_BUTTON);

        generateLootTable(i, InfinityButtonsBlocks.SMALL_CONSOLE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.SMALL_CONSOLE_LEVER);
        generateLootTable(i, InfinityButtonsBlocks.CONSOLE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.CONSOLE_LEVER);
        generateLootTable(i, InfinityButtonsBlocks.LARGE_CONSOLE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.LARGE_CONSOLE_LEVER);
        generateLootTable(i, InfinityButtonsBlocks.BIG_CONSOLE_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.BIG_CONSOLE_LEVER);

        generateLootTable(i, InfinityButtonsBlocks.TORCH_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.TORCH_LEVER);
        generateLootTable(i, InfinityButtonsBlocks.SOUL_TORCH_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.SOUL_TORCH_LEVER);
        generateLootTable(i, InfinityButtonsBlocks.REDSTONE_TORCH_BUTTON);
        generateLootTable(i, InfinityButtonsBlocks.REDSTONE_TORCH_LEVER);
        generateLootTable(i, IBNethersDelightBlocks.PROPELPLANT_TORCH_BUTTON);
        generateLootTable(i, IBNethersDelightBlocks.PROPELPLANT_TORCH_LEVER);
    }

    public void generateLootTable(BiConsumer<Identifier, LootTable.Builder> i, ItemConvertible item) {
        i.accept(new Identifier("infinitybuttons", "blocks/" + item.asItem().toString()), BlockLootTableGenerator.drops(item));
    }
}
