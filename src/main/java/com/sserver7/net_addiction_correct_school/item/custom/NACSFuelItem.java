// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class NACSFuelItem extends Item {
    private int burntime = 0;
    public NACSFuelItem(Properties properties, int burntime) {
        super(properties);
        this.burntime = burntime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return burntime;
    }
}
