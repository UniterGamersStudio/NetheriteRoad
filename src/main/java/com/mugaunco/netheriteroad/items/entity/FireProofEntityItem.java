package com.mugaunco.netheriteroad.items.entity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nonnull;

public class FireProofEntityItem extends EntityItem {

  public FireProofEntityItem(World worldIn, double x, double y, double z) {
    super(worldIn, x, y, z);
    isImmuneToFire = true;
  }

  public FireProofEntityItem(World worldIn, double x, double y, double z, ItemStack stack) {
    super(worldIn, x, y, z, stack);
    isImmuneToFire = true;
  }

  public FireProofEntityItem(World worldIn) {
    super(worldIn);
    isImmuneToFire = true;
  }

  @Override
  public boolean attackEntityFrom(@Nonnull DamageSource source, float amount) {
    return source.getDamageType().equals(DamageSource.OUT_OF_WORLD.damageType);
    // prevent any damage besides out of world
  }
  @Mod.EventBusSubscriber
  public static class EventHandler {
    @SubscribeEvent
    public static void onExpire(ItemExpireEvent event) {
      if(event.getEntityItem() instanceof FireProofEntityItem) {
        event.setCanceled(true);
      }
    }
  }
}
