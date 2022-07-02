package com.mugaunco.netheriteroad.items.common;

import com.mugaunco.netheriteroad.items.FireProofItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class NetheriteIngot extends FireProofItem {
    public NetheriteIngot() {
        super("netherite_ingot",CreativeTabs.MISC);
        OreDictionary.registerOre("ingotNetherite",this);
        OreDictionary.registerOre("NetheriteIngot",this);
    }
}
