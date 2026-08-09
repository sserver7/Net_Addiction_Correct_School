package com.sserver7.net_addiction_correct_school;


import com.sserver7.net_addiction_correct_school.attachment_data.PlayerStats;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class NACSAttachmentTypes {
    private static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, NACSMod.MOD_ID);

    public static final Supplier<AttachmentType<PlayerStats>> PLAYER_STATS =
            ATTACHMENT_TYPES.register(
                    "player_stats",
                    () -> AttachmentType.<PlayerStats>builder(() -> PlayerStats.DEFAULT)
                            .serialize(PlayerStats.MAP_CODEC.codec())
                            .sync(PlayerStats.STREAM_CODEC)// 存盘 + 同步
                            .build()
            );

    public static void register(IEventBus eventBus) {
        ATTACHMENT_TYPES.register(eventBus);
        System.out.println("✅ Attachments registered!");
    }
}
