package net_addiction_correct_school.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSblocks;

import java.util.function.Supplier;

public class itemtab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NACSMod.MOD_ID);

    // 基础物资标签页
    public static final Supplier<CreativeModeTab> NACS_BASICS =
            CREATIVE_MODE_TABS.register("nacs_basics", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSitems.ENROLLMENT_AGREEMENT.get()))
                    .title(Component.translatable("itemGroup.nacs_basics"))
                    .displayItems((parameters, output) -> {
                        output.accept(NACSitems.ENROLLMENT_AGREEMENT.get());
                        output.accept(NACSitems.TRACKING_BRACELET.get());
                        output.accept(NACSitems.MODEL_STUDENT_BADGE.get());
                        output.accept(NACSitems.RUSTY_WIRE.get());
                        output.accept(NACSitems.COMPLIANCE_PROD.get());
                        output.accept(NACSitems.DISCIPLINE_LOG.get());
                        output.accept(NACSitems.MEDICAL_DOSSIER.get());
                        output.accept(NACSitems.FINANCIAL_LEDGER.get());
                        output.accept(NACSitems.DISTRESS_NOTE.get());
                        output.accept(NACSitems.STALE_BREAD.get());
                        output.accept(NACSitems.SEDATIVE.get());
                        output.accept(NACSitems.CALMING_PILL.get());
                        // 添加所有方块
                        output.accept(NACSblocks.REINFORCED_WALL.get());
                        output.accept(NACSblocks.SCHOOL_WALL.get());
                        output.accept(NACSblocks.SCHOOL_FLOOR.get());
                        output.accept(NACSblocks.REINFORCED_WINDOW.get());
                        output.accept(NACSblocks.SURVEILLANCE_CAMERA.get());
                        output.accept(NACSblocks.COMPLAINT_BOX.get());
                        output.accept(NACSblocks.ELECTRIC_FENCE.get());
                        output.accept(NACSblocks.DETENTION_DOOR.get());
                        output.accept(NACSblocks.VENT_ENTRANCE.get());
                        output.accept(NACSblocks.REINFORCED_DOOR_FRAME.get());
                        output.accept(NACSblocks.CONFINEMENT_WALL.get());
                        output.accept(NACSblocks.WATER_CELL_BLOCK.get());
                        output.accept(NACSblocks.TRAINING_GROUND_FLOOR.get());
                        output.accept(NACSblocks.BLOOD_STAIN.get());
                        output.accept(NACSblocks.MONITOR_CENTER_BLOCK.get());
                        output.accept(NACSblocks.FILE_CABINET.get());
                        output.accept(NACSblocks.CONFISCATED_ITEM_CHEST.get());
                        output.accept(NACSblocks.SCHOOL_LIGHT.get());
                        output.accept(NACSblocks.BULLETIN_BOARD.get());
                        output.accept(NACSblocks.SCHOOL_DESK.get());
                        output.accept(NACSblocks.SCHOOL_CHAIR.get());
                        output.accept(NACSblocks.SCHOOL_BED.get());
                        output.accept(NACSblocks.LOOSE_BRICK.get());
                        output.accept(NACSblocks.ENTRANCE_SIGN.get());
                    })
                    .build()
            );

    // 身份装备标签页
    public static final Supplier<CreativeModeTab> NACS_APPAREL =
            CREATIVE_MODE_TABS.register("nacs_apparel", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSitems.INSTRUCTOR_UNIFORM.get()))
                    .title(Component.translatable("itemGroup.nacs_apparel"))
                    .displayItems((parameters, output) -> {
                        output.accept(NACSitems.INSTRUCTOR_UNIFORM.get());
                        output.accept(NACSitems.VISITOR_COAT.get());
                        output.accept(NACSitems.MAINTENANCE_GARB.get());
                    })
                    .build()
            );

    // 特殊工具标签页
    public static final Supplier<CreativeModeTab> NACS_UTILITIES =
            CREATIVE_MODE_TABS.register("nacs_utilities", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSitems.TOOLBOX.get()))
                    .title(Component.translatable("itemGroup.nacs_utilities"))
                    .displayItems((parameters, output) -> {
                        output.accept(NACSitems.TOOLBOX.get());
                        output.accept(NACSitems.ACCESS_CARD.get());
                        output.accept(NACSitems.LOCKPICK_SET.get());
                    })
                    .build()
            );
}