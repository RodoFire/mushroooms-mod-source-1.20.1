package net.louis.mushrooomsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.louis.mushrooomsmod.block.ModBlocks;
import net.louis.mushrooomsmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUMINESCENT_MUSHROOM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUMINESCENT_MUSHROOM_STEM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_MUSHROOM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_MUSHROOM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_MUSHROOM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUMINESCENT_PINK_MUSHROOM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRANSPARENT_MUSHROOM_STEM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COMPRESSED_PURPLE_MUSHROOM);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_MUSHROOM, ModBlocks.POTTED_BLUE_MUSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GREEN_MUSHROOM, ModBlocks.POTTED_GREEN_MUSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_MUSHROOM, ModBlocks.POTTED_PURPLE_MUSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LUMINESCENT_MUSHROOM, ModBlocks.POTTED_LUMINESCENT_MUSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LUMINESCENT_PINK_MUSHROOM, ModBlocks.POTTED_LUMINESCENT_PINK_MUSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.OCULAE, ModBlocks.POTTED_OCULAE, BlockStateModelGenerator.TintType.NOT_TINTED);




        blockStateModelGenerator.registerLantern(ModBlocks.RED_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.GREEN_LANTERN);
        blockStateModelGenerator.registerTorch(ModBlocks.GREEN_TORCH, ModBlocks.WALL_GREEN_TORCH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BAGUETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIG_GREEN_MUSHROOM_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.HYMNE_URSS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HYMNE_FRANCAIS_MUSIC_DISC, Models.GENERATED);
        //itemModelGenerator.register(ModItems.PINK_MUSHROOM_VINES_ITEM, Models.GENERATED);
    }

}
