package com.mugaunco.netheriteroad.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockBase extends ItemBlock {
    public ItemBlockBase(Block block,String name) {
        super(block);
        setRegistryName(name);
    }
}
