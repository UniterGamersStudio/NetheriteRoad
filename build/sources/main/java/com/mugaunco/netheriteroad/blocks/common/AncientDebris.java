package com.mugaunco.netheriteroad.blocks.common;

import com.mugaunco.netheriteroad.blocks.BlockBase;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class AncientDebris extends BlockBase {
    public AncientDebris() {
        super("ancient_debris",CreativeTabs.BUILDING_BLOCKS,Material.ROCK,true);
        setResistance(1200.0F);
        setHardness(30.0F);
        setHarvestLevel("pickaxe",3);
        OreDictionary.registerOre("debrisAncient",this);
        setSoundType(SoundType.STONE);
    }
}
