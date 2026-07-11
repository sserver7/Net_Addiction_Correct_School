package net_addiction_correct_school.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net_addiction_correct_school.NACSMod;

public class NACSItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(NACSMod.MOD_ID);

    // Basic Items
    public static final DeferredItem<Item> ENROLLMENT_AGREEMENT =
            ITEMS.register("enrollment_agreement", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRACKING_BRACELET =
            ITEMS.register("tracking_bracelet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MODEL_STUDENT_BADGE =
            ITEMS.register("model_student_badge", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RUSTY_WIRE =
            ITEMS.register("rusty_wire", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DISCIPLINE_LOG =
            ITEMS.register("discipline_log", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MEDICAL_DOSSIER =
            ITEMS.register("medical_dossier", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FINANCIAL_LEDGER =
            ITEMS.register("financial_ledger", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DISTRESS_NOTE =
            ITEMS.register("distress_note", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STALE_BREAD =
            ITEMS.register("stale_bread", () -> new Item(new Item.Properties().food(NACSFoods.STALE_BREAD)));

    public static final DeferredItem<Item> SEDATIVE =
            ITEMS.register("sedative", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CALMING_PILL =
            ITEMS.register("calming_pill", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COMPLIANCE_PROD =
            ITEMS.register("compliance_prod", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> REINFORCED_BRICK =
            ITEMS.register("reinforced_brick", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> REINFORCED_REBAR =
            ITEMS.register("reinforced_rebar", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PAPER_DUST =
            ITEMS.register("paper_dust", () -> new Item(new Item.Properties()));

    // Gear Items
    public static final DeferredItem<Item> INSTRUCTOR_UNIFORM =
            ITEMS.register("instructor_uniform", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VISITOR_COAT =
            ITEMS.register("visitor_coat", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAINTENANCE_GARB =
            ITEMS.register("maintenance_garb", () -> new Item(new Item.Properties()));

    // Tool Items
    public static final DeferredItem<Item> TOOLBOX =
            ITEMS.register("toolbox", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ACCESS_CARD =
            ITEMS.register("access_card", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LOCKPICK_SET =
            ITEMS.register("lockpick_set", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}