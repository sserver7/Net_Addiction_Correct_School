package com.sserver7.net_addiction_correct_school.block.custom;

import com.sserver7.net_addiction_correct_school.blockentity.DetentionDoorBlockEntity;
import net.minecraft.core.BlockPos;

import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;
import net.minecraft.network.chat.Component;

import java.awt.*;

public class DetentionDoorBlock extends DoorBlock implements EntityBlock {

    // 注意：构造参数需要 BlockSetType，决定门的声音和开关行为
    public DetentionDoorBlock(BlockSetType type, Properties properties) {
        super(type, properties);
    }

    // ========== 方块实体挂载 ==========
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DetentionDoorBlockEntity(pos, state);
    }

    // ========== 右键交互（徒手开门） ==========
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                               Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            // 客户端不处理，等待服务端结果
            return InteractionResult.SUCCESS;
        }

        // 获取方块实体，读取 Unlocked 状态
        if (level.getBlockEntity(pos) instanceof DetentionDoorBlockEntity doorBe) {
            if (doorBe.isUnlocked()) {
                // 已解锁：切换门的 OPEN 状态（开 <-> 关）
                boolean willOpen = !state.getValue(OPEN);
                this.setOpen(player, level, state, pos, willOpen);
                // 播放开门/关门音效
                this.playSound(player, level, pos, willOpen);
                return InteractionResult.SUCCESS;
            } else {
                // 未解锁：提示玩家
                player.displayClientMessage(
                    net.minecraft.network.chat.Component.translatable("message.nacs_door_locked"),
                    true
                );
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    // 播放门音效的辅助方法（参考原版 DoorBlock）
    private void playSound(@Nullable net.minecraft.world.entity.Entity entity, Level level, BlockPos pos, boolean open) {
        level.playSound(entity, pos, 
            open ? net.minecraft.sounds.SoundEvents.IRON_DOOR_OPEN 
                 : net.minecraft.sounds.SoundEvents.IRON_DOOR_CLOSE,
            SoundSource.BLOCKS, 1.0F, 1.0F);
    }
}