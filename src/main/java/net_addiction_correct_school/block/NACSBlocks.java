// SPDX-License-Identifier: MIT
package net_addiction_correct_school.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.item.NACSItems;

import java.util.function.Supplier;

public class NACSBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NACSMod.MOD_ID);

    public static final DeferredBlock<Block> REINFORCED_BLOCK =
            registerBlocks("reinforced_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(50.0F, 2000.0F)));

    // 核心结构方块
    public static final DeferredBlock<WallBlock> REINFORCED_WALL =
            registerBlocks("reinforced_wall",
                    () -> new WallBlock(BlockBehaviour.Properties.of()
                            .strength(50.0F, 2000.0F)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()));  // 高硬度墙壁

    public static final DeferredBlock<Block> SCHOOL_WALL =
            registerBlocks("school_wall",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(3.0F, 6.0F)));  // 普通学校墙壁

    public static final DeferredBlock<Block> SCHOOL_FLOOR =
            registerBlocks("school_floor",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)));  // 学校地板

    public static final DeferredBlock<WallBlock> REINFORCED_WINDOW =
            registerBlocks("reinforced_window",
                    () -> new WallBlock(BlockBehaviour.Properties.of()
                            .strength(10.0F, 1200.0F)
                            .noOcclusion()  // 不遮挡光线
                            .isValidSpawn((state, getter, pos, entity) -> false)
                            .noLootTable()));  // 类似铁栏杆的窗户

    public static final DeferredBlock<Block> SCHOOL_CEILING =
            registerBlocks("school_ceiling",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(2.5F, 6.0F)));  // 学校天花板

    // 功能性方块
    public static final DeferredBlock<Block> SURVEILLANCE_CAMERA =
            registerBlocks("surveillance_camera",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)
                            .noOcclusion()));  // 监控摄像头，暂时普通方块

    public static final DeferredBlock<Block> COMPLAINT_BOX =
            registerBlocks("complaint_box",
                    () -> new ComplaintBoxBlock(BlockBehaviour.Properties.of()
                            .strength(2.5F, 6.0F)
                            .noOcclusion()
                            .noLootTable()));

    public static final DeferredBlock<Block> ELECTRIC_FENCE =
            registerBlocks("electric_fence",
                    () -> new ElectricFenceBlock(BlockBehaviour.Properties.of()
                            .strength(3.0F, 6.0F)
                            .noCollission()  // 无碰撞体积
                            .instabreak()));  // 铁丝网/电网，可快速破坏

    public static final DeferredBlock<DoorBlock> DETENTION_DOOR =
            registerBlocks("detention_door",
                    () -> new DoorBlock(BlockSetType.IRON,BlockBehaviour.Properties.of()
                            .strength(10.0F, 1200.0F)
                            .noOcclusion()
                            .noLootTable()));  // 禁闭室铁门

    public static final DeferredBlock<Block> VENT_ENTRANCE =
            registerBlocks("vent_entrance",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(1.0F, 3.0F)
                            .noOcclusion()));  // 通风管道入口，暂时普通方块

    public static final DeferredBlock<Block> REINFORCED_DOOR_FRAME =
            registerBlocks("reinforced_door_frame",
                    () -> new ReinforcedDoorFrameBlock(BlockBehaviour.Properties.of()
                            .strength(8.0F, 1200.0F)
                            .noOcclusion()));

    // 特殊区域方块
    public static final DeferredBlock<Block> CONFINEMENT_WALL =
            registerBlocks("confinement_wall",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(8.0F, 1200.0F)
                            .lightLevel(state -> 0)
                            .noLootTable()));  // 禁闭室墙壁，无光照

    public static final DeferredBlock<Block> WATER_CELL_BLOCK =
            registerBlocks("water_cell_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4.0F, 6.0F)
                            .noLootTable()));  // 水牢方块，暂时普通方块

    public static final DeferredBlock<Block> TRAINING_GROUND_FLOOR =
            registerBlocks("training_ground_floor",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)
                            .friction(0.8F)
                            .noLootTable()));  // 训练场地板，较高摩擦,LootTable WIP

    public static final DeferredBlock<Block> BLOOD_STAIN =
            registerBlocks("blood_stain",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(0.5F, 0.5F)
                            .noCollission()  // 无碰撞
                            .instabreak()  // 瞬间破坏
                            .lightLevel(state -> 3)
                            .noLootTable()));  // 陈旧血迹，有微弱光照

    public static final DeferredBlock<Block> MONITOR_CENTER_BLOCK =
            registerBlocks("monitor_center_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(3.0F, 6.0F)
                            .noLootTable()));  // 监控中心控制台

    public static final DeferredBlock<Block> FILE_CABINET =
            registerBlocks("file_cabinet",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)
                            .noLootTable()));  // 档案室文件柜

    public static final DeferredBlock<Block> CONFISCATED_ITEM_CHEST =
            registerBlocks("confiscated_item_chest",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)
                            .noLootTable()));  // 违禁品储物箱

    // 装饰性方块
    public static final DeferredBlock<Block> SCHOOL_LIGHT =
            registerBlocks("school_light",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(1.0F, 3.0F)
                            .lightLevel(state -> 12)  // 比火把暗
                            .noCollission()
                            .noLootTable()));  // 学校照明灯

    public static final DeferredBlock<Block> BULLETIN_BOARD =
            registerBlocks("bulletin_board",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(1.0F, 3.0F)
                            .noOcclusion()
                            .noLootTable()));  // 公告板

    public static final DeferredBlock<Block> SCHOOL_DESK =
            registerBlocks("school_desk",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(1.5F, 3.0F)
                            .noOcclusion()));  // 课桌

    public static final DeferredBlock<Block> SCHOOL_CHAIR =
            registerBlocks("school_chair",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(1.5F, 3.0F)
                            .noOcclusion()));  // 椅子

    public static final DeferredBlock<Block> SCHOOL_BED =
            registerBlocks("school_bed",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(1.0F, 3.0F)
                            .noLootTable()));  // 学校床铺

    // 特殊方块
    public static final DeferredBlock<Block> LOOSE_BRICK =
            registerBlocks("loose_brick",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(0.8F, 0.8F)  // 比普通方块更脆弱
                            .sound(SoundType.DEEPSLATE_BRICKS) // 砖块声音
                            .randomTicks()));  // 松动砖块，需要随机Tick

    public static final DeferredBlock<Block> ENTRANCE_SIGN =
            registerBlocks("entrance_sign",
                    () -> new EntranceSignBlock(BlockBehaviour.Properties.of()
                            .strength(1.0F, 3.0F)
                            .noOcclusion()
                            .noLootTable()));  // 学校入口标识

    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        NACSItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
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