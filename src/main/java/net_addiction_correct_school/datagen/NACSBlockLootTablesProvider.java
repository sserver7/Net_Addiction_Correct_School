package net_addiction_correct_school.datagen;

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
import net_addiction_correct_school.block.NACSblocks;
import net_addiction_correct_school.item.NACSitems;

import java.util.Set;

public class NACSBlockLootTablesProvider extends BlockLootSubProvider {
    public NACSBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(NACSblocks.SURVEILLANCE_CAMERA.get());
        dropSelf(NACSblocks.SCHOOL_DESK.get());
        dropSelf(NACSblocks.SCHOOL_CHAIR.get());
        add(NACSblocks.REINFORCED_WALL.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(NACSitems.REINFORCED_BRICK.get())))
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(NACSitems.REINFORCED_REBAR.get()))) // ← 钢筋
                        .apply(ApplyExplosionDecay.explosionDecay())
        );

        add(NACSblocks.REINFORCED_DOOR_FRAME.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(NACSitems.REINFORCED_BRICK.get())))
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(NACSitems.REINFORCED_REBAR.get()))) // ← 钢筋
                        .apply(ApplyExplosionDecay.explosionDecay())
        );

        dropOther(NACSblocks.SCHOOL_WALL.get(), NACSitems.REINFORCED_BRICK);
        dropOther(NACSblocks.SCHOOL_FLOOR.get(), NACSitems.REINFORCED_BRICK);
        dropOther(NACSblocks.SCHOOL_CEILING.get(), NACSitems.REINFORCED_BRICK);
        dropOther(NACSblocks.ELECTRIC_FENCE.get(), NACSitems.RUSTY_WIRE);
        dropOther(NACSblocks.VENT_ENTRANCE.get(), NACSitems.REINFORCED_BRICK);
        dropOther(NACSblocks.LOOSE_BRICK.get(), NACSitems.REINFORCED_BRICK);

    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NACSblocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
