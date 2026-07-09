package net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSblocks;
import net_addiction_correct_school.item.NACSitems;

public class NACSEnusLangProvider extends LanguageProvider {
    public NACSEnusLangProvider(PackOutput output) {
        super(output, NACSMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Item
        add(NACSitems.ACCESS_CARD.get(),"Access Card");
        add(NACSitems.ENROLLMENT_AGREEMENT.get(),"Enrollment Contract");
        add(NACSitems.TRACKING_BRACELET.get(),"Tracking Bracelet");
        add(NACSitems.MODEL_STUDENT_BADGE.get(),"Model Student Badge");
        add(NACSitems.RUSTY_WIRE.get(),"Rusty Wire");
        add(NACSitems.DISCIPLINE_LOG.get(),"Discipline Log");
        add(NACSitems.MEDICAL_DOSSIER.get(),"Medical Dossier");
        add(NACSitems.FINANCIAL_LEDGER.get(),"Financial Ledger");
        add(NACSitems.DISTRESS_NOTE.get(),"Distress Note");
        add(NACSitems.STALE_BREAD.get(),"Stale Bread");
        add(NACSitems.SEDATIVE.get(),"Sedative");
        add(NACSitems.CALMING_PILL.get(),"Calming Pill");
        add(NACSitems.COMPLIANCE_PROD.get(),"Compliance Prod");
        add(NACSitems.INSTRUCTOR_UNIFORM.get(),"Instructor Uniform");
        add(NACSitems.VISITOR_COAT.get(),"Visitor Coat");
        add(NACSitems.MAINTENANCE_GARB.get(),"Maintenance Garb");
        add(NACSitems.TOOLBOX.get(),"Toolbox");
        add(NACSitems.LOCKPICK_SET.get(),"Lockpick Set");
        add(NACSitems.REINFORCED_REBAR.get(),"Reinforced Rebar");
        add(NACSitems.REINFORCED_BRICK.get(),"Reinforced Brick");
        add(NACSitems.PAPER_DUST.get(), "Paper Dust");
        //Block
        add(NACSblocks.REINFORCED_WALL.get(), "Reinforced Wall");
        add(NACSblocks.SCHOOL_WALL.get(), "School Wall");
        add(NACSblocks.SCHOOL_FLOOR.get(), "School Floor");
        add(NACSblocks.REINFORCED_WINDOW.get(), "Reinforced Window");
        add(NACSblocks.SCHOOL_CEILING.get(), "School Ceiling");
        add(NACSblocks.SURVEILLANCE_CAMERA.get(), "Surveillance Camera");
        add(NACSblocks.COMPLAINT_BOX.get(), "Complaint Box");
        add(NACSblocks.ELECTRIC_FENCE.get(), "Electric Fence");
        add(NACSblocks.DETENTION_DOOR.get(), "Detention Door");
        add(NACSblocks.VENT_ENTRANCE.get(), "Vent Entrance");
        add(NACSblocks.REINFORCED_DOOR_FRAME.get(), "Reinforced Door Frame");
        add(NACSblocks.CONFINEMENT_WALL.get(), "Confinement Wall");
        add(NACSblocks.WATER_CELL_BLOCK.get(), "Water Cell Block");
        add(NACSblocks.TRAINING_GROUND_FLOOR.get(), "Training Ground Floor");
        add(NACSblocks.BLOOD_STAIN.get(), "Blood Stain");
        add(NACSblocks.MONITOR_CENTER_BLOCK.get(), "Monitor Center Block");
        add(NACSblocks.FILE_CABINET.get(), "File Cabinet");
        add(NACSblocks.CONFISCATED_ITEM_CHEST.get(), "Confiscated Item Chest");
        add(NACSblocks.SCHOOL_LIGHT.get(), "School Light");
        add(NACSblocks.BULLETIN_BOARD.get(), "Bulletin Board");
        add(NACSblocks.SCHOOL_DESK.get(), "School Desk");
        add(NACSblocks.SCHOOL_CHAIR.get(), "School Chair");
        add(NACSblocks.SCHOOL_BED.get(), "School Bed");
        add(NACSblocks.LOOSE_BRICK.get(), "Loose Brick");
        add(NACSblocks.ENTRANCE_SIGN.get(), "Entrance Sign");
        add(NACSblocks.REINFORCED_BLOCK.get(), "Reinforced Block");
        //Creative Tab
        add("itemGroup.nacs_basics","NACS - Essentials");
        add("itemGroup.nacs_apparel", "NACS - Apparel");
        add("itemGroup.nacs_utilities", "NACS - Utilities");
    }
}