package com.mugaunco.netheriteroad.items;

import com.mugaunco.netheriteroad.NetheriteRoad;
import com.mugaunco.netheriteroad.init.ModItems;
import com.mugaunco.netheriteroad.utils.IHasModel;
import com.mugaunco.netheriteroad.utils.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name, CreativeTabs tab) {
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
