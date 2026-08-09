// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import com.sserver7.net_addiction_correct_school.block.NACSBlocks;
import com.sserver7.net_addiction_correct_school.item.NACSItems;
import com.sserver7.net_addiction_correct_school.item.itemtab;
import com.sserver7.net_addiction_correct_school.attachment_data.PlayerStats;

@Mod(NACSMod.MOD_ID)
public class NACSMod {
    public static final String MOD_ID = "net_addiction_correct_school";

    public NACSMod(IEventBus modEventBus) {
        NACSAttachmentTypes.register(modEventBus);
        NACSItems.register(modEventBus);
        NACSBlocks.register(modEventBus);
        itemtab.CREATIVE_MODE_TABS.register(modEventBus);
        System.out.println("NACS Mod initialized successfully!");
    }
}