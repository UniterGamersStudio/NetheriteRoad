package com.mugaunco.netheriteroad.blocks.common;

import com.mugaunco.netheriteroad.NetheriteRoad;
import com.mugaunco.netheriteroad.blocks.BlockBase;
import com.mugaunco.netheriteroad.init.ModBlocks;
import com.mugaunco.netheriteroad.inventory.container.ContainerSmithing;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class SmithingTable extends BlockBase {
    public SmithingTable() {
        super("smithing_table",CreativeTabs.DECORATIONS, Material.WOOD);
        setResistance(2.5F);
        setHardness(2.5F);
        setSoundType(SoundType.WOOD);
        setHarvestLevel("axe",1);
    }
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(worldIn.isRemote) {
            playerIn.openGui(NetheriteRoad.INSTANCE, 2, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }
        return true;
    }
}
