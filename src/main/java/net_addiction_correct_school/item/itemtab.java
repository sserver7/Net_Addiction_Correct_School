// SPDX-License-Identifier: MIT
package net_addiction_correct_school.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSBlocks;

import java.util.function.Supplier;

public class itemtab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NACSMod.MOD_ID);

    // 基础物资标签页
    public static final Supplier<CreativeModeTab> NACS_BASICS =
            CREATIVE_MODE_TABS.register("nacs_basics", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSItems.ENROLLMENT_AGREEMENT.get()))
                    .title(Component.translatable("itemGroup.nacs_basics"))
                    .displayItems((parameters, output) -> {
                        output.accept(NACSItems.ENROLLMENT_AGREEMENT.get());
                        //output.accept(NACSItems.TRACKING_BRACELET.get());
                        output.accept(NACSItems.MODEL_STUDENT_BADGE.get());
                        output.accept(NACSItems.RUSTY_WIRE.get());
                        output.accept(NACSItems.COMPLIANCE_PROD.get());
                        output.accept(NACSItems.DISCIPLINE_LOG.get());
                        output.accept(NACSItems.MEDICAL_DOSSIER.get());
                        output.accept(NACSItems.FINANCIAL_LEDGER.get());
                        output.accept(NACSItems.DISTRESS_NOTE.get());
                        output.accept(NACSItems.STALE_BREAD.get());
                        output.accept(NACSItems.SEDATIVE.get());
                        output.accept(NACSItems.CALMING_PILL.get());
                        output.accept(NACSItems.REINFORCED_BRICK.get());
                        output.accept(NACSItems.REINFORCED_REBAR.get());
                        output.accept(NACSItems.PAPER_DUST.get());
                        // 添加所有方块
                        output.accept(NACSBlocks.REINFORCED_WALL.get());
                        output.accept(NACSBlocks.REINFORCED_BLOCK.get());
                        output.accept(NACSBlocks.SCHOOL_WALL.get());
                        output.accept(NACSBlocks.SCHOOL_FLOOR.get());
                        output.accept(NACSBlocks.REINFORCED_WINDOW.get());
                        output.accept(NACSBlocks.SURVEILLANCE_CAMERA.get());
                        output.accept(NACSBlocks.COMPLAINT_BOX.get());
                        output.accept(NACSBlocks.ELECTRIC_FENCE.get());
                        output.accept(NACSBlocks.DETENTION_DOOR.get());
                        output.accept(NACSBlocks.VENT_ENTRANCE.get());
                        output.accept(NACSBlocks.REINFORCED_DOOR_FRAME.get());
                        output.accept(NACSBlocks.CONFINEMENT_WALL.get());
                        output.accept(NACSBlocks.WATER_CELL_BLOCK.get());
                        output.accept(NACSBlocks.TRAINING_GROUND_FLOOR.get());
                        output.accept(NACSBlocks.BLOOD_STAIN.get());
                        output.accept(NACSBlocks.MONITOR_CENTER_BLOCK.get());
                        output.accept(NACSBlocks.FILE_CABINET.get());
                        output.accept(NACSBlocks.CONFISCATED_ITEM_CHEST.get());
                        output.accept(NACSBlocks.SCHOOL_LIGHT.get());
                        output.accept(NACSBlocks.BULLETIN_BOARD.get());
                        output.accept(NACSBlocks.SCHOOL_DESK.get());
                        output.accept(NACSBlocks.SCHOOL_CHAIR.get());
                        output.accept(NACSBlocks.SCHOOL_BED.get());
                        output.accept(NACSBlocks.LOOSE_BRICK.get());
                        output.accept(NACSBlocks.ENTRANCE_SIGN.get());
                    })
                    .build()
            );

    // 身份装备标签页
    public static final Supplier<CreativeModeTab> NACS_APPAREL =
            CREATIVE_MODE_TABS.register("nacs_apparel", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSItems.INSTRUCTOR_UNIFORM.get()))
                    .title(Component.translatable("itemGroup.nacs_apparel"))
                    .displayItems((parameters, output) -> {
                        output.accept(NACSItems.INSTRUCTOR_UNIFORM.get());
                        output.accept(NACSItems.VISITOR_COAT.get());
                        output.accept(NACSItems.MAINTENANCE_GARB.get());
                    })
                    .build()
            );

    // 特殊工具标签页
    public static final Supplier<CreativeModeTab> NACS_UTILITIES =
            CREATIVE_MODE_TABS.register("nacs_utilities", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSItems.TOOLBOX.get()))
                    .title(Component.translatable("itemGroup.nacs_utilities"))
                    .displayItems((parameters, output) -> {
                        output.accept(NACSItems.TOOLBOX.get());
                        output.accept(NACSItems.ACCESS_CARD.get());
                        output.accept(NACSItems.LOCKPICK_SET.get());
                    })
                    .build()
            );
}