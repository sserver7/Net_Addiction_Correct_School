package net_addiction_correct_school.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net_addiction_correct_school.NACSMod;

public class NACSitems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(NACSMod.MOD_ID);
    //注册物品
    //Basic
    public static final DeferredItem<Item> DELEGATION_AGREEMENT =
            ITEMS.register("delegation_agreement", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RUSTY_WIRE =
            ITEMS.register("rusty_wire", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CORPORAL_PUNISHMENT_RECORD =
            ITEMS.register("corporal_punishment_record", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MEDICAL_RECORD =
            ITEMS.register("medical_record", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FINANCIAL_BILL =
            ITEMS.register("financial_bill", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANTIDEPRESSANT =
            ITEMS.register("antidepressant", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STUN_GUN =
            ITEMS.register("stun_gun", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SEDATIVE =
            ITEMS.register("sedative", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STALE_BREAD =
            ITEMS.register("stale_bread", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DISTRESS_NOTE =
            ITEMS.register("distress_note", () -> new Item(new Item.Properties()));

    //Gear
    public static final DeferredItem<Item> INSTRUCTOR_UNIFORM =
            ITEMS.register("instructor_uniform", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PARENT_COAT =
            ITEMS.register("parent_coat", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAINTENANCE_CLOTHES =
            ITEMS.register("maintenance_clothes", () -> new Item(new Item.Properties()));

    //Tools
    public static final DeferredItem<Item> TOOLBOX =
            ITEMS.register("toolbox", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KEY_CARD =
            ITEMS.register("key_card", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOCKPICK =
            ITEMS.register("lockpick", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
