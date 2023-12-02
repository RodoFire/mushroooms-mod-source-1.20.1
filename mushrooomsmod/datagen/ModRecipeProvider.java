package net.louis.mushrooomsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.louis.mushrooomsmod.block.ModBlocks;
import net.louis.mushrooomsmod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerPressurePlateRecipe(exporter,ModItems.BAGUETTE , Items.BREAD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BAGUETTE, 1)
                .input(Character.valueOf('#'), Items.WHEAT)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, new Identifier("baguettess_craft"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_LANTERN, 1)
                .pattern("RRR")
                .pattern("RSR")
                .pattern("RRR")
                .input(Character.valueOf('R'), Items.IRON_NUGGET)
                .input(Character.valueOf('S'), ModBlocks.GREEN_TORCH)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .criterion(hasItem(ModBlocks.GREEN_TORCH), conditionsFromItem(ModBlocks.GREEN_TORCH))
                .offerTo(exporter, new Identifier("green_lantern_craft"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_LANTERN, 1)
                .pattern("RRR")
                .pattern("RSR")
                .pattern("RRR")
                .input(Character.valueOf('R'), Items.IRON_NUGGET)
                .input(Character.valueOf('S'), Blocks.REDSTONE_TORCH)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .criterion(hasItem(Blocks.REDSTONE_TORCH), conditionsFromItem(Blocks.REDSTONE_TORCH))
                .offerTo(exporter, new Identifier("red_lantern_craft"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TORCH, 1)
                .pattern("RS")
                .input(Character.valueOf('R'), Blocks.TORCH)
                .input(Character.valueOf('S'), Items.GREEN_DYE)
                .criterion(hasItem(Blocks.TORCH), conditionsFromItem(Blocks.TORCH))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("green_torch_craft"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COMPRESSED_PURPLE_MUSHROOM, 1)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input(Character.valueOf('R'), ModItems.PURPLE_MUSHROOM_POWDER)
                .criterion(hasItem(ModItems.PURPLE_MUSHROOM_POWDER), conditionsFromItem(ModItems.PURPLE_MUSHROOM_POWDER))
                .offerTo(exporter, new Identifier(("compressed_purple_mushroom_craft")));

    }
}
