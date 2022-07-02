package com.mugaunco.netheriteroad.items.tools.fireproof;

import com.mugaunco.netheriteroad.items.entity.FireProofEntityItem;
import com.mugaunco.netheriteroad.items.tools.PickaxeBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class FireProofPickaxe extends PickaxeBase {
    protected FireProofPickaxe(ToolMaterial material, String name, CreativeTabs tab) {
        super(material, name, tab);
    }
    @Override
    public boolean hasCustomEntity(ItemStack stack) {
        return true;
    }

    @Nonnull
    @Override
    public Entity createEntity(World world, Entity location, ItemStack itemstack) {
        EntityItem entity = new FireProofEntityItem(world, location.posX, location.posY, location.posZ, itemstack);
        if(location instanceof EntityItem) {
            NBTTagCompound tag = new NBTTagCompound();
            location.writeToNBT(tag);
            entity.setPickupDelay(tag.getShort("PickupDelay"));
        }
        entity.motionX = location.motionX;
        entity.motionY = location.motionY;
        entity.motionZ = location.motionZ;
        return entity;
    }
}
