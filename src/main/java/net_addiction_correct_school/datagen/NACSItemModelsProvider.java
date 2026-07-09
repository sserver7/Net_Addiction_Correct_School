package net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSblocks;
import net_addiction_correct_school.item.NACSitems;

public class NACSItemModelsProvider extends ItemModelProvider {
    public NACSItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NACSMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // 所有纯物品都使用 basicItem（手持物品模型，引用 textures/item/<name>.png）
        basicItem(NACSitems.ENROLLMENT_AGREEMENT.get());
        basicItem(NACSitems.TRACKING_BRACELET.get());
        basicItem(NACSitems.MODEL_STUDENT_BADGE.get());
        basicItem(NACSitems.RUSTY_WIRE.get());
        basicItem(NACSitems.DISCIPLINE_LOG.get());
        basicItem(NACSitems.MEDICAL_DOSSIER.get());
        basicItem(NACSitems.FINANCIAL_LEDGER.get());
        basicItem(NACSitems.DISTRESS_NOTE.get());
        basicItem(NACSitems.STALE_BREAD.get());
        basicItem(NACSitems.SEDATIVE.get());
        basicItem(NACSitems.CALMING_PILL.get());
        basicItem(NACSitems.COMPLIANCE_PROD.get());
        basicItem(NACSitems.REINFORCED_BRICK.get());
        basicItem(NACSitems.REINFORCED_REBAR.get());
        basicItem(NACSitems.PAPER_DUST.get());
        basicItem(NACSitems.INSTRUCTOR_UNIFORM.get());
        basicItem(NACSitems.VISITOR_COAT.get());
        basicItem(NACSitems.MAINTENANCE_GARB.get());
        basicItem(NACSitems.TOOLBOX.get());
        basicItem(NACSitems.ACCESS_CARD.get());
        basicItem(NACSitems.LOCKPICK_SET.get());

        wallItem(NACSblocks.REINFORCED_WALL, NACSblocks.REINFORCED_BLOCK);


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