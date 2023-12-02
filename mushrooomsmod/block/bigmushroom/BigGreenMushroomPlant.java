package net.louis.mushrooomsmod.block.bigmushroom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BigGreenMushroomPlant extends BigMushroomPlant{
    public static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(1,0,1,15,7,15), Block.createCuboidShape(0,0,0,16,10,16), Block.createCuboidShape(0,0,0,16,14,16), Block.createCuboidShape(0,0,0,16,20,16)};

    public BigGreenMushroomPlant(Settings settings, Block stage0, Block stage1, Block stage2, Block stage3) {
        super(settings, stage0, stage1, stage2, stage3);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[this.getAge(state)];
    }
}
