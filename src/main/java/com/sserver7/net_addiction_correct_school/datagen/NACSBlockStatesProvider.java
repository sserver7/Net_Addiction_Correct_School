// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import com.sserver7.net_addiction_correct_school.NACSMod;
import com.sserver7.net_addiction_correct_school.block.NACSBlocks;

public class NACSBlockStatesProvider extends BlockStateProvider {

    public NACSBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NACSMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //TODO 补全模型
        simpleBlockWithItem(NACSBlocks.REINFORCED_BLOCK.get(),cubeAll(NACSBlocks.REINFORCED_BLOCK.get()));
        simpleBlockWithItem(NACSBlocks.CONFINEMENT_WALL.get(), cubeAll(NACSBlocks.CONFINEMENT_WALL.get()));
        //simpleBlockWithItem(NACSBlocks.REINFORCED_WALL.get(), cubeAll(NACSBlocks.REINFORCED_WALL.get()));
        wallBlock(NACSBlocks.REINFORCED_WALL.get(), blockTexture(NACSBlocks.REINFORCED_BLOCK.get()));
        //wallBlockWithRenderType(NACSBlocks.REINFORCED_WINDOW.get(), modLoc("block/reinforced_window"), "cutout");
        //doorBlockWithRenderType(NACSBlocks.DETENTION_DOOR.get(), modLoc("block/detention_door_bottom"),modLoc("block/detention_door_top"),"cutout");

    }
}
