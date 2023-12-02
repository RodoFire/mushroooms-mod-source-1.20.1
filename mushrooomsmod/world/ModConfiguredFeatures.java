package net.louis.mushrooomsmod.world;
import net.louis.mushrooomsmod.MushrooomsMod;
import net.louis.mushrooomsmod.block.ModBlocks;
import net.louis.mushrooomsmod.feature.mushroomfeature.ModMushroomFeatureConfig;
import net.louis.mushrooomsmod.world.tree.HugeBigGreenMushroom.HugeBigGreenMushroomFeature;
import net.louis.mushrooomsmod.world.tree.HugeBigRedMushroom.HugeBigRedMushroomFeature;
import net.louis.mushrooomsmod.world.tree.HugeBlueMushroom.HugeBlueMushroomFeature;
import net.louis.mushrooomsmod.world.tree.HugeGreenMushroom.HugeGreenMushroomFeature;
import net.louis.mushrooomsmod.world.tree.HugeLuminescentMushroom.HugeLuminescentMushroomFeature;
import net.louis.mushrooomsmod.world.tree.HugeLuminescentPinkMushroom.HugeLuminescentPinkMushroomFeature;
import net.louis.mushrooomsmod.world.tree.BugeBigPurpleMushroom.HugeBigMuchroomFeature;
import net.louis.mushrooomsmod.world.tree.HugePurpleMushroom.HugePurpleMushroomFeature;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.HugeMushroomFeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures <FC extends FeatureConfig>  {


    public static final RegistryKey<ConfiguredFeature<?,?>> BLUE_MUSHROOM_KEY = registerKey("blue_mushroom_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> GREEN_MUSHROOM_KEY = registerKey("green_mushroom_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> PURPLE_MUSHROOM_KEY = registerKey("purple_mushroom_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> LUMINESCENT_MUSHROOM_KEY = registerKey("luminescent_mushroom_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> LUMINESCENT_PINK_MUSHROOM_KEY = registerKey("luminescent_pink_mushroom_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> BIG_PURPLE_MUSHROOM_KEY = registerKey("big_purple_mushroom_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> BIG_GREEN_MUSHROOM_KEY = registerKey("big_green_mushroom_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> BIG_RED_MUSHROOM_KEY = registerKey("big_red_mushroom_tree");





    public static final Feature<HugeMushroomFeatureConfig> HUGE_BLUE_MUSHROOM = ModConfiguredFeatures.registercustommushroomfeature("huge_blue_mushroom", new HugeBlueMushroomFeature(HugeMushroomFeatureConfig.CODEC));
    public static final Feature<HugeMushroomFeatureConfig> HUGE_PURPLE_MUSHROOM = ModConfiguredFeatures.registercustommushroomfeature("huge_purple_mushroom", new HugePurpleMushroomFeature(HugeMushroomFeatureConfig.CODEC));
    public static final Feature<HugeMushroomFeatureConfig> HUGE_GREEN_MUSHROOM = ModConfiguredFeatures.registercustommushroomfeature("huge_green_mushroom", new HugeGreenMushroomFeature(HugeMushroomFeatureConfig.CODEC));
    public static final Feature<HugeMushroomFeatureConfig> HUGE_LUMINESCENT_MUSHROOM = ModConfiguredFeatures.registercustommushroomfeature("huge_luminescent_mushroom", new HugeLuminescentMushroomFeature(HugeMushroomFeatureConfig.CODEC));

    public static final Feature<HugeMushroomFeatureConfig> HUGE_LUMINESCENT_PINK_MUSHROOM = ModConfiguredFeatures.registercustommushroomfeature("huge_luminescent_pink_mushroom", new HugeLuminescentPinkMushroomFeature(HugeMushroomFeatureConfig.CODEC));
    public static final Feature<ModMushroomFeatureConfig> HUGE_BIG_PURPLE_MUSHROOM = ModConfiguredFeatures.registercustommushroomfeature("huge_big_purple_mushroom_feature", new HugeBigMuchroomFeature(ModMushroomFeatureConfig.CODEC));
    public static final Feature<ModMushroomFeatureConfig> HUGE_BIG_GREEN_MUSHROOM = ModConfiguredFeatures.registercustommushroomfeature("huge_big_green_mushroom_feature", new HugeBigGreenMushroomFeature(ModMushroomFeatureConfig.CODEC));
    public static final Feature<ModMushroomFeatureConfig> HUGE_BIG_RED_MUSHROOM = ModConfiguredFeatures.registercustommushroomfeature("huge_red_green_mushroom_feature", new HugeBigRedMushroomFeature(ModMushroomFeatureConfig.CODEC));











    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context){
        register(context, BLUE_MUSHROOM_KEY, ModConfiguredFeatures.HUGE_BLUE_MUSHROOM, new  HugeMushroomFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_MUSHROOM_BLOCK), BlockStateProvider.of(Blocks.MUSHROOM_STEM), 4));
        register(context, PURPLE_MUSHROOM_KEY, ModConfiguredFeatures.HUGE_PURPLE_MUSHROOM, new  HugeMushroomFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_MUSHROOM_BLOCK), BlockStateProvider.of(Blocks.MUSHROOM_STEM), 5));
        register(context, GREEN_MUSHROOM_KEY, ModConfiguredFeatures.HUGE_GREEN_MUSHROOM, new  HugeMushroomFeatureConfig(BlockStateProvider.of(ModBlocks.GREEN_MUSHROOM_BLOCK), BlockStateProvider.of(Blocks.MUSHROOM_STEM), 20));
        register(context, LUMINESCENT_MUSHROOM_KEY, ModConfiguredFeatures.HUGE_LUMINESCENT_MUSHROOM, new  HugeMushroomFeatureConfig(BlockStateProvider.of(ModBlocks.LUMINESCENT_MUSHROOM_BLOCK), BlockStateProvider.of(ModBlocks.LUMINESCENT_MUSHROOM_STEM), 6));
        register(context, LUMINESCENT_PINK_MUSHROOM_KEY, ModConfiguredFeatures.HUGE_LUMINESCENT_PINK_MUSHROOM, new  HugeMushroomFeatureConfig(BlockStateProvider.of(ModBlocks.LUMINESCENT_PINK_MUSHROOM_BLOCK), BlockStateProvider.of(ModBlocks.TRANSPARENT_MUSHROOM_STEM), 4));
        register(context, BIG_PURPLE_MUSHROOM_KEY, ModConfiguredFeatures.HUGE_BIG_PURPLE_MUSHROOM, new  ModMushroomFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_MUSHROOM_BLOCK), BlockStateProvider.of(Blocks.MUSHROOM_STEM) ,BlockStateProvider.of(Blocks.MUSHROOM_STEM), 4));
        register(context, BIG_GREEN_MUSHROOM_KEY, ModConfiguredFeatures.HUGE_BIG_GREEN_MUSHROOM, new  ModMushroomFeatureConfig(BlockStateProvider.of(ModBlocks.GREEN_MUSHROOM_BLOCK), BlockStateProvider.of(Blocks.MUSHROOM_STEM) ,BlockStateProvider.of(Blocks.MUSHROOM_STEM), 4));
        register(context, BIG_RED_MUSHROOM_KEY, ModConfiguredFeatures.HUGE_BIG_RED_MUSHROOM, new  ModMushroomFeatureConfig(BlockStateProvider.of(Blocks.RED_MUSHROOM_BLOCK), BlockStateProvider.of(Blocks.MUSHROOM_STEM) ,BlockStateProvider.of(Blocks.MUSHROOM_STEM), 4));





    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MushrooomsMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
    private static <C extends FeatureConfig, F extends Feature<C>> F registercustommushroomfeature(String name, F feature) {
        return (F)Registry.register(Registries.FEATURE, name, feature);
    }

}
