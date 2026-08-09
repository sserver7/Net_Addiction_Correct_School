// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import com.sserver7.net_addiction_correct_school.block.NACSBlocks;
import com.sserver7.net_addiction_correct_school.item.NACSItems;

import java.util.Set;

public class NACSBlockLootTablesProvider extends BlockLootSubProvider {
    public NACSBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(NACSBlocks.SURVEILLANCE_CAMERA.get());
        dropSelf(NACSBlocks.SCHOOL_DESK.get());
        dropSelf(NACSBlocks.SCHOOL_CHAIR.get());
        add(NACSBlocks.REINFORCED_WALL.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(NACSItems.REINFORCED_BRICK.get())))
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(NACSItems.REINFORCED_REBAR.get()))) // ← 钢筋
                        .apply(ApplyExplosionDecay.explosionDecay())
        );

//        add(NACSBlocks.REINFORCED_DOOR_FRAME.get(),
//                LootTable.lootTable()
//                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
//                                .add(LootItem.lootTableItem(NACSItems.REINFORCED_BRICK.get())))
//                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
//                                .add(LootItem.lootTableItem(NACSItems.REINFORCED_REBAR.get()))) // ← 钢筋
//                        .apply(ApplyExplosionDecay.explosionDecay())
//        );

        add(NACSBlocks.REINFORCED_BLOCK.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(NACSItems.REINFORCED_BRICK.get())))
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(NACSItems.REINFORCED_REBAR.get()))) // ← 钢筋
                        .apply(ApplyExplosionDecay.explosionDecay())
        );

        dropOther(NACSBlocks.SCHOOL_WALL.get(), NACSItems.REINFORCED_BRICK);
        dropOther(NACSBlocks.SCHOOL_FLOOR.get(), NACSItems.REINFORCED_BRICK);
        dropOther(NACSBlocks.SCHOOL_CEILING.get(), NACSItems.REINFORCED_BRICK);
        dropOther(NACSBlocks.ELECTRIC_FENCE.get(), NACSItems.RUSTY_WIRE);
        dropOther(NACSBlocks.VENT_ENTRANCE.get(), NACSItems.REINFORCED_BRICK);
        dropOther(NACSBlocks.LOOSE_BRICK.get(), NACSItems.REINFORCED_BRICK);

    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NACSBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
