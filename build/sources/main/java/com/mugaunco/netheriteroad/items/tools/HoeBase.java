package com.mugaunco.netheriteroad.items.tools;

import com.mugaunco.netheriteroad.NetheriteRoad;
import com.mugaunco.netheriteroad.init.ModItems;
import com.mugaunco.netheriteroad.utils.IHasModel;
import com.mugaunco.netheriteroad.utils.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class HoeBase extends ItemHoe implements IHasModel {
    public HoeBase(ToolMaterial material, String name , CreativeTabs tab) {
        super(material);
        setTranslationKey(Reference.MOD_ID+"."+name);
        setRegistryName(Reference.MOD_ID,name);
        setCreativeTab(tab);
        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        NetheriteRoad.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
