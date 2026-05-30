package net_addiction_correct_school.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.item.NACSitems;

import java.util.function.Supplier;

public class NACSblocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NACSMod.MOD_ID);

    public static final DeferredBlock<Block> REINFORCED_WALL =
            registerBlocks("reinforced_wall", () -> new Block(BlockBehaviour.Properties.of().strength(50.0F, 2000.0F)));

    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        NACSitems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}