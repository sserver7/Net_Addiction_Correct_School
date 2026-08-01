// SPDX-License-Identifier: MIT
package net_addiction_correct_school.block; // 你的包名

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
// 注意：因为我们不做 BE，所以不需要 import BlockEntityBlock


public class EntranceSignBlock extends HorizontalDirectionalBlock {

    // 2. 添加 Codec 的静态常量
    // 这行代码告诉游戏：这个方块的状态只需要用它的 FACING 属性就能描述
    public static final MapCodec<EntranceSignBlock> CODEC = simpleCodec(EntranceSignBlock::new);

    // 构造函数保持不变
    public EntranceSignBlock(Properties props) {
        super(props);
        // 设置默认状态为朝北
        registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH));
    }

    // 3. 必须实现的抽象方法：返回上面的 CODEC
    @Override
    protected MapCodec<EntranceSignBlock> codec() {
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
}