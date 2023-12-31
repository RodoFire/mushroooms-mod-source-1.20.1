package net.louis.mushrooomsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.louis.mushrooomsmod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        //Pickaxe
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLUE_LUMINESCENT_SCHROOM_DEESLATE)
                .add(ModBlocks.PURPLE_SCHROOM_DEESLATE)
                .add(ModBlocks.GREEN_STONY_SCHROOM_DEPOT)
                .add(ModBlocks.RED_LANTERN)
                .add(ModBlocks.GREEN_LANTERN)
                .add(ModBlocks.GREEN_CAMPFIRE)
                .add(ModBlocks.RHYOLITE);

        //Shovel
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.COMPRESSED_PURPLE_MUSHROOM)
                .add(ModBlocks.COMPRESSED_DIRT)
                .add(ModBlocks.LIGHT_COMPRESSED_DIRT);

        //Axe
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BLUE_MUSHROOM_BLOCK)
                .add(ModBlocks.PURPLE_MUSHROOM_BLOCK)
                .add(ModBlocks.LUMINESCENT_PINK_MUSHROOM_BLOCK)
                .add(ModBlocks.BLUE_LUMINESCENT_MUSHROOM_BLOCK)
                .add(ModBlocks.GREEN_MUSHROOM_BLOCK)
                .add(ModBlocks.YELLOW_MUSHROOM_BLOCK)
                .add(ModBlocks.ORANGE_MUSHROOM_BLOCK)

                .add(ModBlocks.DARK_MUSHROOM_BLUE_LUMINESCENT_BLOCK)
                .add(ModBlocks.DARK_LUMINESCENT_PINK_MUSHROOM_BLOCK)
                .add(ModBlocks.DARK_GREEN_MUSHROOM_BLOCK)
                .add(ModBlocks.DARK_PURPLE_MUSHROOM_BLOCK)
                .add(ModBlocks.DARK_ORANGE_MUSHROOM_BLOCK)
                .add(ModBlocks.DARK_YELLOW_MUSHROOM_BLOCK)
                .add(ModBlocks.DARK_BLUE_MUSHROOM_BLOCK)
                .add(ModBlocks.DARK_RED_MUSHROOM_BLOCK)



                .add(ModBlocks.LUMINESCENT_MUSHROOM_STEM)
                .add(ModBlocks.GREEN_MUSHROOM_STEM)
                .add(ModBlocks.TRANSPARENT_MUSHROOM_STEM);
    }
}
