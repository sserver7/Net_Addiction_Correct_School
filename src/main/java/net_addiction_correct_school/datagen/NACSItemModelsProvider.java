package net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSBlocks;
import net_addiction_correct_school.item.NACSItems;

public class NACSItemModelsProvider extends ItemModelProvider {
    public NACSItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NACSMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // 所有纯物品都使用 basicItem（手持物品模型，引用 textures/item/<name>.png）
        basicItem(NACSItems.ENROLLMENT_AGREEMENT.get());
        basicItem(NACSItems.TRACKING_BRACELET.get());
        basicItem(NACSItems.MODEL_STUDENT_BADGE.get());
        basicItem(NACSItems.RUSTY_WIRE.get());
        basicItem(NACSItems.DISCIPLINE_LOG.get());
        basicItem(NACSItems.MEDICAL_DOSSIER.get());
        basicItem(NACSItems.FINANCIAL_LEDGER.get());
        basicItem(NACSItems.DISTRESS_NOTE.get());
        basicItem(NACSItems.STALE_BREAD.get());
        basicItem(NACSItems.SEDATIVE.get());
        basicItem(NACSItems.CALMING_PILL.get());
        basicItem(NACSItems.COMPLIANCE_PROD.get());
        basicItem(NACSItems.REINFORCED_BRICK.get());
        basicItem(NACSItems.REINFORCED_REBAR.get());
        basicItem(NACSItems.PAPER_DUST.get());
        basicItem(NACSItems.INSTRUCTOR_UNIFORM.get());
        basicItem(NACSItems.VISITOR_COAT.get());
        basicItem(NACSItems.MAINTENANCE_GARB.get());
        basicItem(NACSItems.TOOLBOX.get());
        basicItem(NACSItems.ACCESS_CARD.get());
        basicItem(NACSItems.LOCKPICK_SET.get());

        wallItem(NACSBlocks.REINFORCED_WALL, NACSBlocks.REINFORCED_BLOCK);


    }

    //抄的
    private void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> base) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(NACSMod.MOD_ID,
                        "block/" + base.getId().getPath()));
    }
    private void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> base) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(NACSMod.MOD_ID,
                        "block/" + base.getId().getPath()));
    }
    private void wallItem(DeferredBlock<?> block, DeferredBlock<Block> base) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(NACSMod.MOD_ID,
                        "block/" + base.getId().getPath()));
    }
}