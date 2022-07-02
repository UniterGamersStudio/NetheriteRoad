package com.mugaunco.netheriteroad.items.common.tools;

import com.mugaunco.netheriteroad.items.tools.fireproof.FireProofSword;
import com.mugaunco.netheriteroad.utils.ModMaterials;
import net.minecraft.creativetab.CreativeTabs;

public class NetheriteSword extends FireProofSword {
    public NetheriteSword() {
        super(ModMaterials.NETHERITE_ALLOY,"netherite_sword", CreativeTabs.COMBAT);
    }
}
