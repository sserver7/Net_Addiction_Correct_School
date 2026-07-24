// SPDX-License-Identifier: MIT
package net_addiction_correct_school.blockentity;

/*import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net_addiction_correct_school.registry.ModBlockEntities;
import org.jetbrains.annotations.NotNull;

public class ComplaintBoxBE extends BlockEntity{
    private int complaintCount = 0;
    private String lastComplainant = "";

    public ComplaintBoxBE(BlockPos pos, BlockState state) {
        super(ModBlockEntities.COMPLAINT_BOX.get(), pos, state);
    }

    public int getComplaintCount() { return complaintCount; }
    public void addComplaint(String name) {
        this.complaintCount++;
        this.lastComplainant = name;
        setChanged();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putInt("Count", complaintCount);
        tag.putString("Last", lastComplainant);
    }

    @Override
    public void loadAdditional(@NotNull CompoundTag tag, net.minecraft.core.HolderLookup.Provider lookup) {
        super.loadAdditional(tag, lookup);
        this.complaintCount = tag.getInt("Count");
        this.lastComplainant = tag.getString("Last");
    }
}
*/