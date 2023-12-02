package net.louis.mushrooomsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;;
import net.louis.mushrooomsmod.MushrooomsMod;
import net.louis.mushrooomsmod.block.PinkLuminescentVines.PinkLuminescentBodyVinesBlock;
import net.louis.mushrooomsmod.block.PinkLuminescentVines.PinkLuminescentHeadVinesBlock;
import net.louis.mushrooomsmod.block.PinkMushroomBlock.PinkMushroomVinesBodyBlock;
import net.louis.mushrooomsmod.block.PinkMushroomBlock.PinkMushroomVinesHeadBlock;
import net.louis.mushrooomsmod.block.bigmushroom.*;
import net.louis.mushrooomsmod.item.ModItems;
import net.louis.mushrooomsmod.particle.ModParticles;
import net.louis.mushrooomsmod.world.ModConfiguredFeatures;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static net.louis.mushrooomsmod.item.ModItems.BAGUETTE;

public class ModBlocks {

    private static World structureWorldAccess;
    private static net.minecraft.util.math.BlockPos BlockPos;


    private static void  addItemstoNaturalGroup(FabricItemGroupEntries entries){

        entries.add(BLUE_MUSHROOM_BLOCK);
        entries.add(LUMINESCENT_MUSHROOM_BLOCK);
        entries.add(LUMINESCENT_MUSHROOM_STEM);
        entries.add(PURPLE_MUSHROOM_BLOCK);
        entries.add(GREEN_MUSHROOM_BLOCK);
        entries.add(GREEN_MUSHROOM);
        entries.add(BLUE_MUSHROOM);
        entries.add(PURPLE_MUSHROOM);
        entries.add(LUMINESCENT_MUSHROOM);
        entries.add(LUMINESCENT_PINK_MUSHROOM_BLOCK);
        entries.add(LUMINESCENT_PINK_MUSHROOM);
        entries.add(TRANSPARENT_MUSHROOM_STEM);
        //entries.add(PINK_MUSHROOM_VINES);
        entries.add(MUSHROOM_FLOWERS);
        entries.add(RED_LUMERIA);
        entries.add(ModItems.PINK_MUSHROOM_VINES_ITEM);
        entries.add(COMPRESSED_PURPLE_MUSHROOM);
        entries.add(ModItems.BIG_PURPLE_MUSHROOM_SEED);
        entries.add(ModItems.BIG_GREEN_MUSHROOM_SEED);
        entries.add(ModItems.PURPLE_MUSHROOM_POWDER);
        entries.add(ModBlocks.TINY_PURPLE_MUSHROOM);
        entries.add(ModBlocks.LITTLE_PURPLE_MUSHROOM);
        entries.add(ModBlocks.MEDIUM_PURPLE_MUSHROOM);
        entries.add(ModBlocks.BIG_PURPLE_MUSHROOM);
        entries.add(ModBlocks.TINY_GREEN_MUSHROOM);
        entries.add(ModBlocks.LITTLE_GREEN_MUSHROOM);
        entries.add(ModBlocks.MEDIUM_GREEN_MUSHROOM);
        entries.add(ModBlocks.BIG_GREEN_MUSHROOM);
    }
    private static void  addItemstoFoodGroup(FabricItemGroupEntries entries){
        entries.add(BAGUETTE);
    }
    private static void addItemstoFunctionalGroup(FabricItemGroupEntries entries){
        entries.add(GREEN_LANTERN);
        entries.add(RED_LANTERN);
        entries.add(ModItems.GREEN_TORCH);
        entries.add(GREEN_CAMPFIRE);
    }
    private static void addItemstoToolsGroup(FabricItemGroupEntries entries){
        entries.add(ModItems.HYMNE_FRANCAIS_MUSIC_DISC);
        entries.add(ModItems.HYMNE_URSS_MUSIC_DISC);
    }




    public static final Block LUMINESCENT_MUSHROOM_BLOCK = registerBlock("luminescent_mushroom_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(8)));
    public static final Block LUMINESCENT_MUSHROOM_STEM = registerBlock("luminescent_mushroom_stem",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(5)));
    public static final Block BLUE_MUSHROOM_BLOCK = registerBlock("blue_mushroom_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block PURPLE_MUSHROOM_BLOCK = registerBlock("purple_mushroom_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block GREEN_MUSHROOM_BLOCK = registerBlock("green_mushroom_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK)));
    public static final Block LUMINESCENT_PINK_MUSHROOM_BLOCK = registerBlock("luminescent_pink_mushroom_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(4)));
    public static final Block TRANSPARENT_MUSHROOM_STEM = registerBlock("transparent_mushroom_stem",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).nonOpaque().luminance(4)));


    public static final Block COMPRESSED_PURPLE_MUSHROOM = registerBlock("compressed_purple_mushroom", new MossBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));



    public static final Block GREEN_MUSHROOM = registerBlock("green_mushroom",
            new MushroomPlantBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM), ModConfiguredFeatures.GREEN_MUSHROOM_KEY));
    public static final Block PURPLE_MUSHROOM = registerBlock("purple_mushroom",
            new MushroomPlantBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM), ModConfiguredFeatures.PURPLE_MUSHROOM_KEY));
    public static final Block BLUE_MUSHROOM = registerBlock("blue_mushroom",
            new MushroomPlantBlock( FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM),ModConfiguredFeatures.BLUE_MUSHROOM_KEY));
    public static final Block LUMINESCENT_MUSHROOM = registerBlock("luminescent_mushroom",
            new MushroomPlantBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).luminance(5), ModConfiguredFeatures.LUMINESCENT_MUSHROOM_KEY));
    public static final Block LUMINESCENT_PINK_MUSHROOM = registerBlock("luminescent_pink_mushroom",
            new MushroomPlantBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).luminance(5), ModConfiguredFeatures.LUMINESCENT_PINK_MUSHROOM_KEY));



    public static final Block OCULAE = registerBlock("oculae",
            new FlowerBlock(StatusEffects.DARKNESS, 1000, FabricBlockSettings.copyOf(Blocks.GRASS).nonOpaque().noCollision()));
    public static final Block MUSHROOM_FLOWERS = registerBlock("mushroom_flowers",
            new FlowersMushroomBlock(FabricBlockSettings.copyOf(Blocks.TALL_GRASS).nonOpaque().noCollision(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_KEY));
    public static final Block RED_LUMERIA = registerBlock("red_lumeria",
            new BigRedMushroom(FabricBlockSettings.copyOf(Blocks.TALL_GRASS).nonOpaque().noCollision(), ModConfiguredFeatures.BIG_RED_MUSHROOM_KEY));


    public static Block PINK_MUSHROOM_VINES = registerBlock("pink_mushroom_vines", new PinkMushroomVinesBodyBlock(FabricBlockSettings.create().breakInstantly().sounds(BlockSoundGroup.CAVE_VINES).pistonBehavior(PistonBehavior.DESTROY)));
    public static Block PINK_MUSHROOM_VINES_PLANT = registerBlock("pink_mushroom_vines_plant",
            new PinkMushroomVinesHeadBlock(FabricBlockSettings.create().breakInstantly().sounds(BlockSoundGroup.CAVE_VINES).pistonBehavior(PistonBehavior.DESTROY)));

    public static Block PINK_LUMINESCENT_BODY_VINES = registerBlock("pink_luminescent_body_vines", new PinkLuminescentBodyVinesBlock(FabricBlockSettings.create().nonOpaque().sounds(BlockSoundGroup.HONEY).pistonBehavior(PistonBehavior.DESTROY).breakInstantly().luminance(state -> state.get(PinkLuminescentBodyVinesBlock.MANY_VINES) ? 0 : 15)));
    public static Block PINK_LUMINESCENT_HEAD_VINES = registerBlock("pink_luminescent_head_vines", new PinkLuminescentHeadVinesBlock(FabricBlockSettings.create().nonOpaque().sounds(BlockSoundGroup.HONEY).pistonBehavior(PistonBehavior.DESTROY).breakInstantly().luminance(3)));


    public static final Block POTTED_GREEN_MUSHROOM  = Registry.register(Registries.BLOCK, new Identifier(MushrooomsMod.MOD_ID, "potted_green_mushroom"),
            new FlowerPotBlock(GREEN_MUSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_BLUE_MUSHROOM  = Registry.register(Registries.BLOCK, new Identifier(MushrooomsMod.MOD_ID, "potted_blue_mushroom"),
            new FlowerPotBlock(BLUE_MUSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_PURPLE_MUSHROOM  = Registry.register(Registries.BLOCK, new Identifier(MushrooomsMod.MOD_ID, "potted_purple_mushroom"),
            new FlowerPotBlock(PURPLE_MUSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));
    public static final Block POTTED_LUMINESCENT_MUSHROOM  = Registry.register(Registries.BLOCK, new Identifier(MushrooomsMod.MOD_ID, "potted_luminescent_mushroom"),
            new FlowerPotBlock(LUMINESCENT_MUSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM).nonOpaque().luminance(5)));
    public static final Block POTTED_OCULAE = Registry.register(Registries.BLOCK, new Identifier(MushrooomsMod.MOD_ID, "potted_oculae"),
            new FlowerPotBlock(OCULAE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block POTTED_LUMINESCENT_PINK_MUSHROOM = Registry.register(Registries.BLOCK, new Identifier(MushrooomsMod.MOD_ID, "potted_luminescent_pink_mushroom"),
            new FlowerPotBlock(LUMINESCENT_PINK_MUSHROOM, FabricBlockSettings.copyOf(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));



    public static final Block BIG_PURPLE_MUSHROOM_PLANT = registerBlock("big_purple_mushroom_plant" , new BigPurpleMushroomPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true), ModBlocks.TINY_PURPLE_MUSHROOM,ModBlocks.LITTLE_PURPLE_MUSHROOM,ModBlocks.MEDIUM_PURPLE_MUSHROOM,ModBlocks.BIG_PURPLE_MUSHROOM));
    public static final Block TINY_PURPLE_MUSHROOM = registerBlock("tiny_purple_mushroom" , new TinyPurpleMushroom(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true).nonOpaque(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_KEY));
    public static final Block LITTLE_PURPLE_MUSHROOM = registerBlock("little_purple_mushroom" , new LittlePurpleMushroom(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true).nonOpaque(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_KEY));
    public static final Block MEDIUM_PURPLE_MUSHROOM = registerBlock("medium_purple_mushroom" , new MediumPurpleMushroom(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true).nonOpaque(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_KEY));
    public static final Block BIG_PURPLE_MUSHROOM = registerBlock("big_purple_mushroom" , new BigPurpleMushroom(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true).nonOpaque(), ModConfiguredFeatures.BIG_PURPLE_MUSHROOM_KEY));
    public static final Block TINY_GREEN_MUSHROOM = registerBlock("tiny_green_mushroom" , new TinyGreenMushroom(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true).nonOpaque(), ModConfiguredFeatures.BIG_GREEN_MUSHROOM_KEY));
    public static final Block LITTLE_GREEN_MUSHROOM = registerBlock("little_green_mushroom" , new LittleGreenMushroom(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true).nonOpaque(), ModConfiguredFeatures.BIG_GREEN_MUSHROOM_KEY));
    public static final Block MEDIUM_GREEN_MUSHROOM = registerBlock("medium_green_mushroom" , new MediumGreenMushroom(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true).nonOpaque(), ModConfiguredFeatures.BIG_GREEN_MUSHROOM_KEY));
    public static final Block BIG_GREEN_MUSHROOM = registerBlock("big_green_mushroom" , new BigGreenMushroom(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true).nonOpaque(), ModConfiguredFeatures.BIG_GREEN_MUSHROOM_KEY));
    public static final Block BIG_GREEN_MUSHROOM_PLANT = registerBlock("big_green_mushroom_plant" , new BigGreenMushroomPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM).collidable(true), ModBlocks.TINY_GREEN_MUSHROOM,ModBlocks.LITTLE_GREEN_MUSHROOM,ModBlocks.MEDIUM_GREEN_MUSHROOM,ModBlocks.BIG_GREEN_MUSHROOM));

    public static final Block RED_LANTERN = registerBlock("red_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(15).nonOpaque()));
    public static final Block GREEN_LANTERN = registerBlock("green_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).luminance(13).nonOpaque()));
    public static final Block GREEN_TORCH = registerBlock("green_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH).luminance(12).nonOpaque(),  ModParticles.GREENFIRE_PARTICLE));
    public static final Block WALL_GREEN_TORCH = registerBlock("wall_green_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH).luminance(12).nonOpaque(), ModParticles.GREENFIRE_PARTICLE));
    public static final Block GREEN_CAMPFIRE = registerBlock("green_campfire",
            new CampfireBlock(true, 1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE).luminance(13).nonOpaque()));




    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MushrooomsMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(MushrooomsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void  registerModBlocks(){
        MushrooomsMod.LOGGER.info("Registering ModBlocks for " + MushrooomsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemstoNaturalGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModBlocks::addItemstoFoodGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addItemstoFunctionalGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModBlocks::addItemstoToolsGroup);
    }
}
