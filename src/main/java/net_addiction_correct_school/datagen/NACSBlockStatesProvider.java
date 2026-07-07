package net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSblocks;

public class NACSBlockStatesProvider extends BlockStateProvider {

    public NACSBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NACSMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(NACSblocks.REINFORCED_WALL.get(), cubeAll(NACSblocks.REINFORCED_WALL.get()));
    }
}
