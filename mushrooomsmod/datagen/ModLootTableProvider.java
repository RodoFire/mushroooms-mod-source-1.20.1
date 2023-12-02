package net.louis.mushrooomsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.louis.mushrooomsmod.block.ModBlocks;
import net.louis.mushrooomsmod.block.bigmushroom.BigMushroomPlant;
import net.louis.mushrooomsmod.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PURPLE_MUSHROOM);
        addDrop(ModBlocks.GREEN_MUSHROOM);
        addDrop(ModBlocks.BLUE_MUSHROOM);
        addDrop(ModBlocks.LUMINESCENT_MUSHROOM);
        addDrop(ModBlocks.LUMINESCENT_PINK_MUSHROOM);
        addDrop(ModBlocks.MUSHROOM_FLOWERS);
        addDrop(ModBlocks.COMPRESSED_PURPLE_MUSHROOM);


        addDrop(ModBlocks.PURPLE_MUSHROOM_BLOCK);
        addDrop(ModBlocks.GREEN_MUSHROOM_BLOCK);
        addDrop(ModBlocks.BLUE_MUSHROOM_BLOCK);
        addDrop(ModBlocks.LUMINESCENT_MUSHROOM_BLOCK);
        addDrop(ModBlocks.LUMINESCENT_MUSHROOM_STEM);
        addDrop(ModBlocks.LUMINESCENT_PINK_MUSHROOM_BLOCK);


        addPottedPlantDrops(ModBlocks.POTTED_LUMINESCENT_MUSHROOM);
        addPottedPlantDrops(ModBlocks.POTTED_GREEN_MUSHROOM);
        addPottedPlantDrops(ModBlocks.POTTED_PURPLE_MUSHROOM);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_MUSHROOM);
        addPottedPlantDrops(ModBlocks.POTTED_LUMINESCENT_PINK_MUSHROOM);
        addPottedPlantDrops(ModBlocks.POTTED_OCULAE);

        addDrop(ModBlocks.RED_LANTERN);
        addDrop(ModBlocks.GREEN_LANTERN);
        addDrop(ModBlocks.GREEN_TORCH);


        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.BIG_PURPLE_MUSHROOM_PLANT).properties(StatePredicate.Builder.create()
                        .exactMatch(BigMushroomPlant.AGE, 3));
        addDrop(ModBlocks.BIG_PURPLE_MUSHROOM_PLANT, cropDrops(ModBlocks.BIG_PURPLE_MUSHROOM_PLANT, ModItems.PURPLE_MUSHROOM_POWDER, ModItems.BIG_PURPLE_MUSHROOM_SEED, builder ));

    }
}
