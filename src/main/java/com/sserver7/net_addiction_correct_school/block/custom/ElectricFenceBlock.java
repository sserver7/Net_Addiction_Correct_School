package com.sserver7.net_addiction_correct_school.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.damagesource.DamageSource;

public class ElectricFenceBlock extends Block {

    // 每 tick 电击伤害量（半颗心为单位）
    private static final float SHOCK_DAMAGE = 2.0f;
    //电击间隔（GT）
    private static final int SHOCK_INTERVAL = 10;

    public ElectricFenceBlock(Properties properties) {
        super(properties);
    }

    /**
     * 实体与电网接触时触发，每 tick 调用一次。
     * 只对活体生物造成伤害，只在服务端执行。
     */
    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide() && entity instanceof LivingEntity living && living.tickCount % SHOCK_INTERVAL == 0) {
            // 使用原版闪电伤害类型，看起来更自然
            DamageSource damageSource = level.damageSources().lightningBolt();
            living.hurt(damageSource, SHOCK_DAMAGE);
            living.addEffect(new MobEffectInstance(
                    MobEffects.MOVEMENT_SLOWDOWN,
                    40,//2s
                    2//level3
            ));
        }
    }
}