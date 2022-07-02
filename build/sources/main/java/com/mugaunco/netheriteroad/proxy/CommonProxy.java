package com.mugaunco.netheriteroad.proxy;

import com.mugaunco.netheriteroad.NetheriteRoad;
import com.mugaunco.netheriteroad.gui.GuiSmithingTable;
import com.mugaunco.netheriteroad.init.ModBlocks;
import com.mugaunco.netheriteroad.init.ModItems;
import com.mugaunco.netheriteroad.utils.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
    }

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(ModBlocks.ANCIENT_DEBRIS,new ItemStack(ModItems.NETHERITE_SCRAP),2.0F);
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
