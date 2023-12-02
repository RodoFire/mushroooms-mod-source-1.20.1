package net.louis.mushrooomsmod.block.bigmushroom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BigPurpleMushroomPlant extends BigMushroomPlant{
    public BigPurpleMushroomPlant(Settings settings, Block stage0, Block stage1, Block stage2, Block stage3) {
        super(settings, stage0, stage1, stage2, stage3);
    }
    protected final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[] {Block.createCuboidShape(5,0,5,10,5,10) , Block.createCuboidShape(3,0,3,13,12,13),  Block.createCuboidShape(4,0,4,12,16,12),  Block.createCuboidShape(3,0,3,13,22,13)};



    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[this.getAge(state)];
    }
}
