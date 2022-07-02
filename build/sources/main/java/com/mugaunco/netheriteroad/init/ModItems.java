package com.mugaunco.netheriteroad.init;

import com.mugaunco.netheriteroad.items.common.NetheriteScrap;
import com.mugaunco.netheriteroad.items.common.NetheriteIngot;
import com.mugaunco.netheriteroad.items.common.tools.*;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item NETHERITE_INGOT;
    public static final Item NETHERITE_SCRAP;
    public static final Item NETHERITE_SWORD;
    public static final Item NETHERITE_PICKAXE;
    public static final Item NETHERITE_AXE;
    public static final Item NETHERITE_SHOVEL;
    public static final Item NETHERITE_HOE;
    static {
        NETHERITE_INGOT = new NetheriteIngot();
        NETHERITE_SCRAP = new NetheriteScrap();
        NETHERITE_SWORD = new NetheriteSword();
        NETHERITE_PICKAXE = new NetheritePickaxe();
        NETHERITE_AXE = new NetheriteAxe();
        NETHERITE_SHOVEL = new NetheriteShovel();
        NETHERITE_HOE = new NetheriteHoe();
    }
}
