// SPDX-License-Identifier: MIT
package com.sserver7.net_addiction_correct_school.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import com.sserver7.net_addiction_correct_school.NACSMod;
import com.sserver7.net_addiction_correct_school.block.NACSBlocks;
import com.sserver7.net_addiction_correct_school.item.NACSItems;

public class NACSZhCnLangProvider extends LanguageProvider {
    public NACSZhCnLangProvider(PackOutput output) {
        super(output, NACSMod.MOD_ID,"zh_cn");
    }

    @Override
    protected void addTranslations() {
        //Item
        add(NACSItems.ACCESS_CARD.get(),"门禁卡");
        add(NACSItems.ENROLLMENT_AGREEMENT.get(),"入学合同");
        //add(NACSItems.TRACKING_BRACELET.get(),"追踪手环");
        add(NACSItems.MODEL_STUDENT_BADGE.get(),"模范学生徽章");
        add(NACSItems.RUSTY_WIRE.get(),"生锈的铁丝");
        add(NACSItems.DISCIPLINE_LOG.get(),"纪律日志");
        add(NACSItems.MEDICAL_DOSSIER.get(),"医疗档案");
        add(NACSItems.FINANCIAL_LEDGER.get(),"财务账本");
        add(NACSItems.DISTRESS_NOTE.get(),"求救纸条");
        add(NACSItems.STALE_BREAD.get(),"变味面包");
        add(NACSItems.SEDATIVE.get(),"镇静剂");
        add(NACSItems.CALMING_PILL.get(),"安神药丸");
        add(NACSItems.COMPLIANCE_PROD.get(),"服从电击棒");
        add(NACSItems.INSTRUCTOR_UNIFORM.get(),"教官制服");
        add(NACSItems.VISITOR_COAT.get(),"访客外套");
        add(NACSItems.MAINTENANCE_GARB.get(),"维修工装");
        add(NACSItems.TOOLBOX.get(),"工具箱");
        add(NACSItems.LOCKPICK_SET.get(),"开锁工具");
        add(NACSItems.REINFORCED_REBAR.get(),"钢筋");
        add(NACSItems.REINFORCED_BRICK.get(),"强化砖");
        add(NACSItems.PAPER_DUST.get(), "纸灰");
        //Block
        add(NACSBlocks.REINFORCED_WALL.get(), "强化墙");
        add(NACSBlocks.SCHOOL_WALL.get(), "学校墙壁");
        add(NACSBlocks.SCHOOL_FLOOR.get(), "学校地板");
        //add(NACSBlocks.REINFORCED_WINDOW.get(), "加固窗户");
        add(NACSBlocks.SCHOOL_CEILING.get(), "学校天花板");
        add(NACSBlocks.SURVEILLANCE_CAMERA.get(), "监控摄像头");
        add(NACSBlocks.COMPLAINT_BOX.get(), "投诉箱");
        add(NACSBlocks.ELECTRIC_FENCE.get(), "电网围栏");
        add(NACSBlocks.DETENTION_DOOR.get(), "禁闭室门");
        add(NACSBlocks.VENT_ENTRANCE.get(), "通风口入口");
        //add(NACSBlocks.REINFORCED_DOOR_FRAME.get(), "强化门框");
        add(NACSBlocks.CONFINEMENT_WALL.get(), "隔离墙");
        //add(NACSBlocks.WATER_CELL_BLOCK.get(), "水牢方块");
        add(NACSBlocks.TRAINING_GROUND_FLOOR.get(), "训练场地板");
        add(NACSBlocks.BLOOD_STAIN.get(), "血迹");
        add(NACSBlocks.MONITOR_CENTER_BLOCK.get(), "监控中心方块");
        add(NACSBlocks.FILE_CABINET.get(), "文件柜");
        add(NACSBlocks.CONFISCATED_ITEM_CHEST.get(), "没收物品箱");
        add(NACSBlocks.SCHOOL_LIGHT.get(), "学校灯");
        add(NACSBlocks.BULLETIN_BOARD.get(), "公告板");
        add(NACSBlocks.SCHOOL_DESK.get(), "学校课桌");
        add(NACSBlocks.SCHOOL_CHAIR.get(), "学校椅子");
        add(NACSBlocks.SCHOOL_BED.get(), "学校床铺");
        add(NACSBlocks.LOOSE_BRICK.get(), "松动砖块");
        add(NACSBlocks.ENTRANCE_SIGN.get(), "入口招牌");
        add(NACSBlocks.REINFORCED_BLOCK.get(), "强化砖块");
        //Creative Tab
        add("itemGroup.nacs_basics","NACS - 基础物品");
        add("itemGroup.nacs_apparel", "NACS - 服装");
        add("itemGroup.nacs_utilities", "NACS - 工具");
        //Message
        add("message.nacs_door_locked", "门已上锁");
    }
}