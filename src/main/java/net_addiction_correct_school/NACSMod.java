package net_addiction_correct_school; // 记得改成你的包名

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net_addiction_correct_school.block.NACSblocks;
import net_addiction_correct_school.item.NACSitems;
import net_addiction_correct_school.item.itemtab;

@Mod(NACSMod.MOD_ID) // @Mod 注解是必须的，括号里是你的模组ID
public class NACSMod {
    // 定义一个唯一的模组ID，只能用小写字母、数字和下划线，且不能与其它模组重复
    public static final String MOD_ID = "net_addiction_correct_school";

    // 构造方法，NeoForge 会自动调用
    public NACSMod(IEventBus modEventBus) {
        /*
         这里是模组初始化的地方
         我们将在这里注册物品、方块等
         暂时先留空，或者写一行日志
        */
        NACSitems.register(modEventBus);
        NACSblocks.register(modEventBus);
        itemtab.CREATIVE_MODE_TABS.register(modEventBus);
        System.out.println("Hello from " + MOD_ID + "!");
    }
}
