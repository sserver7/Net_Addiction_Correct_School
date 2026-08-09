package com.sserver7.net_addiction_correct_school.attachment_data;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;

public record PlayerStats(int obedience, int mentalHealth, int alertness, boolean isInsideSchool) {
    public static final PlayerStats DEFAULT = new PlayerStats(25,100,0,false);

    public static final MapCodec<PlayerStats> MAP_CODEC = RecordCodecBuilder.mapCodec(
            inst -> inst.group(
                    Codec.INT.fieldOf("obedience").forGetter(PlayerStats::obedience),
                    Codec.INT.fieldOf("mentalHealth").forGetter(PlayerStats::mentalHealth),
                    Codec.INT.fieldOf("alertness").forGetter(PlayerStats::alertness),
                    Codec.BOOL.fieldOf("isInsideSchool").forGetter(PlayerStats::isInsideSchool)
            ).apply(inst,PlayerStats::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf,PlayerStats> STREAM_CODEC =
            StreamCodec.of(
                    PlayerStats::encode,
                    PlayerStats::decode
            );

    private static void encode(RegistryFriendlyByteBuf buf, PlayerStats stats){
        buf.writeByte(stats.obedience());
        buf.writeByte(stats.mentalHealth());
        buf.writeByte(stats.alertness());
        buf.writeBoolean(stats.isInsideSchool);
    }

    private static PlayerStats decode(RegistryFriendlyByteBuf buf) {
        return new PlayerStats(
                buf.readByte() & 0xFF,
                buf.readByte() & 0xFF,
                buf.readByte() & 0xFF,
                buf.readBoolean()
        );
    }

    /** 校验数值合法性 */
    public boolean isValid() {
        return obedience >= 0 && obedience <= 100
                && mentalHealth >= 0 && mentalHealth <= 100
                && alertness >= 0 && alertness <= 100;
    }
}
