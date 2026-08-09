// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import com.sserver7.net_addiction_correct_school.item.NACSItems;

import java.util.concurrent.CompletableFuture;

public class NACSDataMapProvider extends DataMapProvider {

    public NACSDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(NACSItems.ENROLLMENT_AGREEMENT.getId(), new FurnaceFuel(50),false);
    }
}
