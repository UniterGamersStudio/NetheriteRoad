package com.mugaunco.netheriteroad.items.common;

import com.mugaunco.netheriteroad.items.FireProofItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class NetheriteScrap extends FireProofItem {
    public NetheriteScrap() {
        super("netherite_scrap",CreativeTabs.MISC);
        OreDictionary.registerOre("scrapNetherite",this);
    }
}
