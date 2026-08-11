package com.sserver7.net_addiction_correct_school;

import com.sserver7.net_addiction_correct_school.block.NACSBlocks;
import com.sserver7.net_addiction_correct_school.blockentity.DetentionDoorBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NACSBlockEntities {
    //创建DeferredRegister
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, NACSMod.MOD_ID);

    //注册BE类型
    public static final Supplier<BlockEntityType<DetentionDoorBlockEntity>> DETENTION_DOOR_BE =
            BLOCK_ENTITIES.register("detention_door_be",
                    () -> BlockEntityType.Builder.of(
                            DetentionDoorBlockEntity::new,
                            NACSBlocks.DETENTION_DOOR.get()
                    ).build(null));
}
