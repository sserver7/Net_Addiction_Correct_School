// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import com.sserver7.net_addiction_correct_school.NACSMod;
import com.sserver7.net_addiction_correct_school.block.NACSBlocks;
import com.sserver7.net_addiction_correct_school.item.NACSItems;

public class NACSEnUsLangProvider extends LanguageProvider {
    public NACSEnUsLangProvider(PackOutput output) {
        super(output, NACSMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Item
        add(NACSItems.ACCESS_CARD.get(),"Access Card");
        add(NACSItems.ENROLLMENT_AGREEMENT.get(),"Enrollment Contract");
        //add(NACSItems.TRACKING_BRACELET.get(),"Tracking Bracelet");
        add(NACSItems.MODEL_STUDENT_BADGE.get(),"Model Student Badge");
        add(NACSItems.RUSTY_WIRE.get(),"Rusty Wire");
        add(NACSItems.DISCIPLINE_LOG.get(),"Discipline Log");
        add(NACSItems.MEDICAL_DOSSIER.get(),"Medical Dossier");
        add(NACSItems.FINANCIAL_LEDGER.get(),"Financial Ledger");
        add(NACSItems.DISTRESS_NOTE.get(),"Distress Note");
        add(NACSItems.STALE_BREAD.get(),"Stale Bread");
        add(NACSItems.SEDATIVE.get(),"Sedative");
        add(NACSItems.CALMING_PILL.get(),"Calming Pill");
        add(NACSItems.COMPLIANCE_PROD.get(),"Compliance Prod");
        add(NACSItems.INSTRUCTOR_UNIFORM.get(),"Instructor Uniform");
        add(NACSItems.VISITOR_COAT.get(),"Visitor Coat");
        add(NACSItems.MAINTENANCE_GARB.get(),"Maintenance Garb");
        add(NACSItems.TOOLBOX.get(),"Toolbox");
        add(NACSItems.LOCKPICK_SET.get(),"Lockpick Set");
        add(NACSItems.REINFORCED_REBAR.get(),"Reinforced Rebar");
        add(NACSItems.REINFORCED_BRICK.get(),"Reinforced Brick");
        add(NACSItems.PAPER_DUST.get(), "Paper Dust");
        //Block
        add(NACSBlocks.REINFORCED_WALL.get(), "Reinforced Wall");
        add(NACSBlocks.SCHOOL_WALL.get(), "School Wall");
        add(NACSBlocks.SCHOOL_FLOOR.get(), "School Floor");
        //add(NACSBlocks.REINFORCED_WINDOW.get(), "Reinforced Window");
        add(NACSBlocks.SCHOOL_CEILING.get(), "School Ceiling");
        add(NACSBlocks.SURVEILLANCE_CAMERA.get(), "Surveillance Camera");
        add(NACSBlocks.COMPLAINT_BOX.get(), "Complaint Box");
        add(NACSBlocks.ELECTRIC_FENCE.get(), "Electric Fence");
        add(NACSBlocks.DETENTION_DOOR.get(), "Detention Door");
        add(NACSBlocks.VENT_ENTRANCE.get(), "Vent Entrance");
        //add(NACSBlocks.REINFORCED_DOOR_FRAME.get(), "Reinforced Door Frame");
        add(NACSBlocks.CONFINEMENT_WALL.get(), "Confinement Wall");
        //add(NACSBlocks.WATER_CELL_BLOCK.get(), "Water Cell Block");
        add(NACSBlocks.TRAINING_GROUND_FLOOR.get(), "Training Ground Floor");
        add(NACSBlocks.BLOOD_STAIN.get(), "Blood Stain");
        add(NACSBlocks.MONITOR_CENTER_BLOCK.get(), "Monitor Center Block");
        add(NACSBlocks.FILE_CABINET.get(), "File Cabinet");
        add(NACSBlocks.CONFISCATED_ITEM_CHEST.get(), "Confiscated Item Chest");
        add(NACSBlocks.SCHOOL_LIGHT.get(), "School Light");
        add(NACSBlocks.BULLETIN_BOARD.get(), "Bulletin Board");
        add(NACSBlocks.SCHOOL_DESK.get(), "School Desk");
        add(NACSBlocks.SCHOOL_CHAIR.get(), "School Chair");
        add(NACSBlocks.SCHOOL_BED.get(), "School Bed");
        add(NACSBlocks.LOOSE_BRICK.get(), "Loose Brick");
        add(NACSBlocks.ENTRANCE_SIGN.get(), "Entrance Sign");
        add(NACSBlocks.REINFORCED_BLOCK.get(), "Reinforced Block");
        //Creative Tab
        add("itemGroup.nacs_basics","NACS - Essentials");
        add("itemGroup.nacs_apparel", "NACS - Apparel");
        add("itemGroup.nacs_utilities", "NACS - Utilities");
        //Message
        add("message.nacs_door_locked", "Door was locked");
    }
}