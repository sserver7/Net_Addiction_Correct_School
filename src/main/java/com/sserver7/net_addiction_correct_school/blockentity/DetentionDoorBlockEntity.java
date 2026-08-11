package com.sserver7.net_addiction_correct_school.blockentity;

import com.sserver7.net_addiction_correct_school.NACSBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class DetentionDoorBlockEntity extends BlockEntity {
    private boolean unlocked = false;


    public DetentionDoorBlockEntity(BlockPos pos, BlockState blockState) {
        super(NACSBlockEntities.DETENTION_DOOR_BE.get(), pos, blockState);
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
        //标记已更改
        setChanged();
        //需发包同步
        if (level != null && !level.isClientSide){
            level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
        }

    }

    //持久化
    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putBoolean("Unlocked", this.unlocked);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        this.unlocked = tag.getBoolean("Unlocked");
    }

    //同步
    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        tag.putBoolean("Unlocked",this.unlocked);
        return tag;
    }
}
