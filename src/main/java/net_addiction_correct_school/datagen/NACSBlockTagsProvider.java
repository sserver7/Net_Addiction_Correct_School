package net_addiction_correct_school.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NACSBlockTagsProvider extends BlockTagsProvider {
    public NACSBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NACSMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
//        tag()TODO补上Gen
        tag(BlockTags.WALLS)
                .add(NACSBlocks.REINFORCED_WALL.get());
        //TODO该第三个了
    }
}
