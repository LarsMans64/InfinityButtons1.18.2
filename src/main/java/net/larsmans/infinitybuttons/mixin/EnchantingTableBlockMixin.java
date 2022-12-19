package net.larsmans.infinitybuttons.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.fabricmc.loader.api.FabricLoader;
import net.larsmans.infinitybuttons.block.InfinityButtonsBlocks;
import net.larsmans.infinitybuttons.compat.CarpenterBlocks;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EnchantingTableBlock.class)
public abstract class EnchantingTableBlockMixin extends BlockWithEntity {

    public EnchantingTableBlockMixin(Settings settings) {
        super(settings);
    }

    @ModifyExpressionValue(
            method = "canAccessBookshelf",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    private static boolean addModdedBookshelves(boolean original, World world, BlockPos tablePos, BlockPos bookshelfOffset) {
        if (FabricLoader.getInstance().isModLoaded("carpenter")) {
            return (original
                    || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(InfinityButtonsBlocks.BOOKSHELF_SECRET_BUTTON)
                    || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(CarpenterBlocks.ACACIA_BOOKSHELF_SECRET_BUTTON)
                    || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(CarpenterBlocks.BIRCH_BOOKSHELF_SECRET_BUTTON)
                    || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(CarpenterBlocks.CRIMSON_BOOKSHELF_SECRET_BUTTON)
                    || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(CarpenterBlocks.DARK_OAK_BOOKSHELF_SECRET_BUTTON)
                    || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(CarpenterBlocks.JUNGLE_BOOKSHELF_SECRET_BUTTON)
                    || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(CarpenterBlocks.SPRUCE_BOOKSHELF_SECRET_BUTTON)
                    || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(CarpenterBlocks.WARPED_BOOKSHELF_SECRET_BUTTON));
        }
        return (original || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(InfinityButtonsBlocks.BOOKSHELF_SECRET_BUTTON));
    }
}
