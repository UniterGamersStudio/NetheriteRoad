package com.mugaunco.netheriteroad.event;

import com.mugaunco.netheriteroad.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModOreGen {
    @SubscribeEvent
    public static void ancientDebrisGen1(OreGenEvent.Post event){
        if(event.getWorld().provider.getDimensionType() == DimensionType.NETHER) {
            for (int i = 0; i < 2; i++) {
                int x = event.getPos().getX() + event.getRand().nextInt(16);
                int y = event.getRand().nextInt(14) + 8;
                int z = event.getPos().getZ() + event.getRand().nextInt(16);
                (new WorldGenMinable(ModBlocks.ANCIENT_DEBRIS.getDefaultState(),
                        3, blockAt -> blockAt.getBlock() == Blocks.NETHERRACK.getDefaultState()
                        .getBlock())).generate(event.getWorld(), event.getRand(), new BlockPos(x, y, z));
            }
        }
    }
    @SubscribeEvent
    public static void ancientDebrisGen2(OreGenEvent.Post event){
        if(event.getWorld().provider.getDimensionType() == DimensionType.NETHER) {
            for (int i = 0; i < 2; i++) {
                int x = event.getPos().getX() + event.getRand().nextInt(16);
                int y = event.getRand().nextInt(111) + 8;
                int z = event.getPos().getZ() + event.getRand().nextInt(16);
                (new WorldGenMinable(ModBlocks.ANCIENT_DEBRIS.getDefaultState(),
                        2, blockAt -> blockAt.getBlock() == Blocks.NETHERRACK.getDefaultState()
                        .getBlock())).generate(event.getWorld(), event.getRand(), new BlockPos(x, y, z));
            }
        }
    }
}
