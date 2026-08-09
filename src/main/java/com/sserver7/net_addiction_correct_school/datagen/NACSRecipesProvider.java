// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import com.sserver7.net_addiction_correct_school.NACSMod;
import com.sserver7.net_addiction_correct_school.item.NACSItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class NACSRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public NACSRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static final List<ItemLike> PAPER_DUST = List.of(NACSItems.ENROLLMENT_AGREEMENT);

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //TODO Misc以后改
        oreSmelting(recipeOutput, PAPER_DUST, RecipeCategory.MISC, NACSItems.PAPER_DUST, 1f, 100, null);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NACSItems.LOCKPICK_SET)
                .pattern(" #")
                .pattern("# ")
                .define('#', NACSItems.RUSTY_WIRE)
                .unlockedBy(getHasName(NACSItems.ENROLLMENT_AGREEMENT), has(NACSItems.ENROLLMENT_AGREEMENT))
                .save(recipeOutput);

    }

    //抄的
    //熔炉
    protected static void oreSmelting(
            RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        oreCooking(
                recipeOutput,
                RecipeSerializer.SMELTING_RECIPE,
                SmeltingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_smelting"
        );
    }

    //高炉
    protected static void oreBlasting(
            RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        oreCooking(
                recipeOutput,
                RecipeSerializer.BLASTING_RECIPE,
                BlastingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_blasting"
        );
    }

    //烟熏炉
    protected static <T extends AbstractCookingRecipe> void oreCooking(
            RecipeOutput recipeOutput,
            RecipeSerializer<T> serializer,
            AbstractCookingRecipe.Factory<T> recipeFactory,
            List<ItemLike> ingredients,
            RecipeCategory category,
            ItemLike result,
            float experience,
            int cookingTime,
            String group,
            String suffix
    ) {
        for (ItemLike itemlike : ingredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), category, result, experience, cookingTime, serializer, recipeFactory)
                    .group(group)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, NACSMod.MOD_ID + ":" + getItemName(result) + suffix + "_" + getItemName(itemlike));
        }
    }
}
