// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.block.custom; // 你的包名

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
// 注意：因为我们不做 BE，所以不需要 import BlockEntityBlock


public class ReinforcedDoorFrameBlock extends HorizontalDirectionalBlock {

    // 2. 添加 Codec 的静态常量
    // 这行代码告诉游戏：这个方块的状态只需要用它的 FACING 属性就能描述
    public static final MapCodec<ReinforcedDoorFrameBlock> CODEC = simpleCodec(ReinforcedDoorFrameBlock::new);

    //Model
    /*
    North
    minX, minY, minZ
    maxX, maxY, maxZ
    East
    newMinX = 16 - maxZ
    newMaxX = 16 - minZ
    newMinY = minY
    newMaxY = maxY
    newMinZ = minX
    newMaxZ = maxX
    South
    newMinX = 16 - maxX
    newMaxX = 16 - minX
    newMinY = minY
    newMaxY = maxY
    newMinZ = 16 - maxZ
    newMaxZ = 16 - minZ
    West
    newMinX = minZ
    newMaxX = maxZ
    newMinY = minY
    newMaxY = maxY
    newMinZ = 16 - maxX
    newMaxZ = 16 - minX

    */
    private static final VoxelShape SHAPE_NORTH =
            Block.box(5.0,0.0,5.0,11.0,16.0,16.0);
    private static final  VoxelShape SHAPE_SOUTH =
            Block.box(5.0,0.0,0.0,11.0,16.0,11.0);
    private static final VoxelShape SHAPE_WEST =
            Block.box(5.0,0.0,5.0,16.0,16.0,11.0);
    private static final VoxelShape SHAPE_EAST =
            Block.box(0.0,0.0,5.0,11.0,16.0,11.0);
    // 构造函数保持不变
    public ReinforcedDoorFrameBlock(Properties props) {
        super(props);
        // 设置默认状态为朝北
        registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH));
    }

    // 3. 必须实现的抽象方法：返回上面的 CODEC
    @Override
    protected MapCodec<ReinforcedDoorFrameBlock> codec() {
        return CODEC;
    }

    // 这个方法用于创建方块状态容器
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    // 这个方法决定玩家右键放置时方块朝向哪里
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        // getHorizontalDirection() 是玩家面对的水平方向
        // getOpposite() 是相反方向
        return defaultBlockState()
                .setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction facing = state.getValue(FACING);
        return switch (facing) {
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return super.getCollisionShape(state, level, pos, context);
    }
}