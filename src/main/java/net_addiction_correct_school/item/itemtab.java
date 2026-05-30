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
    //注册一个Tab
    public static final Supplier<CreativeModeTab> NACS_BASIC =
            CREATIVE_MODE_TABS.register("nacs_basic", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSitems.DELEGATION_AGREEMENT.get()))
                    .title(Component.translatable("itemGroup.nacs_basic"))
                    .displayItems((parameters, output) -> {
                        // 在这里添加你想在创造标签中显示的物品
                        output.accept(NACSitems.DELEGATION_AGREEMENT.get());
                        output.accept(NACSitems.RUSTY_WIRE.get());
                        output.accept(NACSitems.STUN_GUN.get());
                        output.accept(NACSitems.CORPORAL_PUNISHMENT_RECORD.get());
                        output.accept(NACSitems.MEDICAL_RECORD.get());
                        output.accept(NACSitems.FINANCIAL_BILL.get());
                        output.accept(NACSitems.DISTRESS_NOTE.get());
                        output.accept(NACSitems.STALE_BREAD.get());
                        output.accept(NACSitems.SEDATIVE.get());
                        output.accept(NACSitems.ANTIDEPRESSANT.get());

                        output.accept(NACSblocks.REINFORCED_WALL.get());
                    })

                    .build()
            );

    public static final Supplier<CreativeModeTab> NACS_GEAR =
            CREATIVE_MODE_TABS.register("nacs_gear", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSitems.INSTRUCTOR_UNIFORM.get()))
                    .title(Component.translatable("itemGroup.nacs_gear"))
                    .displayItems((parameters, output) -> {
                        // 在这里添加你想在创造标签中显示的物品
                        output.accept(NACSitems.INSTRUCTOR_UNIFORM.get());
                        output.accept(NACSitems.PARENT_COAT.get());
                        output.accept(NACSitems.MAINTENANCE_CLOTHES.get());
                    })

                    .build()
            );

    public static final Supplier<CreativeModeTab> NACS_TOOLS =
            CREATIVE_MODE_TABS.register("nacs_tools", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NACSitems.TOOLBOX.get()))
                    .title(Component.translatable("itemGroup.nacs_tools"))
                    .displayItems((parameters, output) -> {
                        // 在这里添加你想在创造标签中显示的物品
                        output.accept(NACSitems.TOOLBOX.get());
                        output.accept(NACSitems.KEY_CARD.get());
                        output.accept(NACSitems.LOCKPICK.get());
                    })

                    .build()
            );
}
