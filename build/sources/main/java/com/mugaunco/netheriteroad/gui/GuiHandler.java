package com.mugaunco.netheriteroad.gui;

import com.mugaunco.netheriteroad.inventory.container.ContainerSmithing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public enum GuiHandler implements IGuiHandler {
    INSTANCE;

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == GuiSmithingTable.GUIID){
            return new ContainerSmithing(world,new BlockPos(x,y,z),player);
        }
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == GuiSmithingTable.GUIID){
            return new GuiSmithingTable.GuiWindow(world,x,y,z,player);
        }
        return null;
    }
}
