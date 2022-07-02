package com.mugaunco.netheriteroad.items.common.tools;

import com.mugaunco.netheriteroad.items.tools.fireproof.FireProofPickaxe;
import com.mugaunco.netheriteroad.utils.ModMaterials;
import net.minecraft.creativetab.CreativeTabs;

public class NetheritePickaxe extends FireProofPickaxe {
    public NetheritePickaxe() {
        super(ModMaterials.NETHERITE_ALLOY,"netherite_pickaxe", CreativeTabs.TOOLS);
    }
}
