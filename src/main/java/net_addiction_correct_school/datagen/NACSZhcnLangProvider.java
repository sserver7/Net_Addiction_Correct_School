package net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net_addiction_correct_school.NACSMod;
import net_addiction_correct_school.block.NACSblocks;
import net_addiction_correct_school.item.NACSitems;

public class NACSZhcnLangProvider extends LanguageProvider {
    public NACSZhcnLangProvider(PackOutput output) {
        super(output, NACSMod.MOD_ID,"zh_cn");
    }

    @Override
    protected void addTranslations() {
        //Item
        add(NACSitems.ACCESS_CARD.get(),"门禁卡");
        add(NACSitems.ENROLLMENT_AGREEMENT.get(),"入学合同");
        add(NACSitems.TRACKING_BRACELET.get(),"追踪手环");
        add(NACSitems.MODEL_STUDENT_BADGE.get(),"模范学生徽章");
        add(NACSitems.RUSTY_WIRE.get(),"生锈的铁丝");
        add(NACSitems.DISCIPLINE_LOG.get(),"纪律日志");
        add(NACSitems.MEDICAL_DOSSIER.get(),"医疗档案");
        add(NACSitems.FINANCIAL_LEDGER.get(),"财务账本");
        add(NACSitems.DISTRESS_NOTE.get(),"求救纸条");
        add(NACSitems.STALE_BREAD.get(),"变味面包");
        add(NACSitems.SEDATIVE.get(),"镇静剂");
        add(NACSitems.CALMING_PILL.get(),"安神药丸");
        add(NACSitems.COMPLIANCE_PROD.get(),"服从电击棒");
        add(NACSitems.INSTRUCTOR_UNIFORM.get(),"教官制服");
        add(NACSitems.VISITOR_COAT.get(),"访客外套");
        add(NACSitems.MAINTENANCE_GARB.get(),"维修工装");
        add(NACSitems.TOOLBOX.get(),"工具箱");
        add(NACSitems.LOCKPICK_SET.get(),"开锁工具");
        add(NACSitems.REINFORCED_REBAR.get(),"钢筋");
        add(NACSitems.REINFORCED_BRICK.get(),"强化砖");
        //Block
        add(NACSblocks.REINFORCED_WALL.get(), "加固墙");
        add(NACSblocks.SCHOOL_WALL.get(), "学校墙壁");
        add(NACSblocks.SCHOOL_FLOOR.get(), "学校地板");
        add(NACSblocks.REINFORCED_WINDOW.get(), "加固窗户");
        add(NACSblocks.SCHOOL_CEILING.get(), "学校天花板");
        add(NACSblocks.SURVEILLANCE_CAMERA.get(), "监控摄像头");
        add(NACSblocks.COMPLAINT_BOX.get(), "投诉箱");
        add(NACSblocks.ELECTRIC_FENCE.get(), "电网围栏");
        add(NACSblocks.DETENTION_DOOR.get(), "禁闭室门");
        add(NACSblocks.VENT_ENTRANCE.get(), "通风口入口");
        add(NACSblocks.REINFORCED_DOOR_FRAME.get(), "加固门框");
        add(NACSblocks.CONFINEMENT_WALL.get(), "隔离墙");
        add(NACSblocks.WATER_CELL_BLOCK.get(), "水牢方块");
        add(NACSblocks.TRAINING_GROUND_FLOOR.get(), "训练场地板");
        add(NACSblocks.BLOOD_STAIN.get(), "血迹");
        add(NACSblocks.MONITOR_CENTER_BLOCK.get(), "监控中心方块");
        add(NACSblocks.FILE_CABINET.get(), "文件柜");
        add(NACSblocks.CONFISCATED_ITEM_CHEST.get(), "没收物品箱");
        add(NACSblocks.SCHOOL_LIGHT.get(), "学校灯");
        add(NACSblocks.BULLETIN_BOARD.get(), "公告板");
        add(NACSblocks.SCHOOL_DESK.get(), "学校课桌");
        add(NACSblocks.SCHOOL_CHAIR.get(), "学校椅子");
        add(NACSblocks.SCHOOL_BED.get(), "学校床铺");
        add(NACSblocks.LOOSE_BRICK.get(), "松动砖块");
        add(NACSblocks.ENTRANCE_SIGN.get(), "入口招牌");
        //Creative Tab
        add("itemGroup.nacs_basics","NACS - 基础物品");
        add("itemGroup.nacs_apparel", "NACS - 服装");
        add("itemGroup.nacs_utilities", "NACS - 工具");
    }
}