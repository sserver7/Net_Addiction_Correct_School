// SPDX-License-Identifier: MIT
package net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSBlocks;

public class NACSBlockStatesProvider extends BlockStateProvider {

    public NACSBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NACSMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(NACSBlocks.REINFORCED_BLOCK.get(),cubeAll(NACSBlocks.REINFORCED_BLOCK.get()));
        //simpleBlockWithItem(NACSBlocks.REINFORCED_WALL.get(), cubeAll(NACSBlocks.REINFORCED_WALL.get()));
        wallBlock(NACSBlocks.REINFORCED_WALL.get(), blockTexture(NACSBlocks.REINFORCED_BLOCK.get()));
        wallBlock(NACSBlocks.REINFORCED_WINDOW.get(), modLoc("block/reinforced_window"));

    }
}
