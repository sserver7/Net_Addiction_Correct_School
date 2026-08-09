// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class NACSFoods {
    public static final FoodProperties STALE_BREAD = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION,200),1f)
            .alwaysEdible().build();
}
