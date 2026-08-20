package com.sserver7.net_addiction_correct_school.item.custom;

import com.sserver7.net_addiction_correct_school.block.NACSBlocks;
import com.sserver7.net_addiction_correct_school.blockentity.DetentionDoorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;


public class LockpickSetItem extends Item {
    public LockpickSetItem(Properties properties) {
        super(properties);
    }

//    @Override
//    public InteractionResult useOn(UseOnContext context) {
//        BlockPos pos = context.getClickedPos();
//        Player player = context.getPlayer();
//        Level level = context.getLevel();
//
//        System.out.println("[DEBUG] useOn called at pos: " + pos + ", side: " + level.isClientSide);
//
//        if (!level.isClientSide() && player != null){
//            BlockState blockState = level.getBlockState(pos);
//            if (blockState.is(NACSBlocks.DETENTION_DOOR.get())){
//                if (level.getBlockEntity(pos) instanceof DetentionDoorBlockEntity DETENTION_DOOR_BE){
//                    DETENTION_DOOR_BE.setUnlocked(true);
//                    return InteractionResult.CONSUME;
//                }
//            }
//        }
//        return InteractionResult.PASS;
//    }
}
