package com.mugaunco.netheriteroad.blocks;

import com.mugaunco.netheriteroad.NetheriteRoad;
import com.mugaunco.netheriteroad.init.ModBlocks;
import com.mugaunco.netheriteroad.init.ModItems;
import com.mugaunco.netheriteroad.items.FireProofItemBlock;
import com.mugaunco.netheriteroad.items.ItemBlockBase;
import com.mugaunco.netheriteroad.utils.IHasModel;
import com.mugaunco.netheriteroad.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, CreativeTabs tab, Material material) {
        super(material);
        setTranslationKey(Reference.MOD_ID+"."+name);
        setRegistryName(Reference.MOD_ID,name);
        setCreativeTab(tab);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlockBase(this,name));
    }
    public BlockBase(String name, CreativeTabs tab, Material material,boolean isFireProof) {
        super(material);
        setTranslationKey(Reference.MOD_ID+"."+name);
        setRegistryName(Reference.MOD_ID,name);
        setCreativeTab(tab);
        ModBlocks.BLOCKS.add(this);
        if(isFireProof){
            ModItems.ITEMS.add(new FireProofItemBlock(this,name));
        }
        else {
            ModItems.ITEMS.add(new ItemBlockBase(this, name));
        }
    }

    @Override
    public void registerModels() {
        NetheriteRoad.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
