package net_addiction_correct_school;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net_addiction_correct_school.block.NACSblocks;
import net_addiction_correct_school.item.NACSitems;
import net_addiction_correct_school.item.itemtab;

@Mod(NACSMod.MOD_ID)
public class NACSMod {
    public static final String MOD_ID = "net_addiction_correct_school";

    public NACSMod(IEventBus modEventBus) {
        NACSitems.register(modEventBus);
        NACSblocks.register(modEventBus);
        itemtab.CREATIVE_MODE_TABS.register(modEventBus);
        System.out.println("NACS Mod initialized successfully!");
    }
}