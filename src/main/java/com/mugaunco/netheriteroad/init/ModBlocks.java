package com.mugaunco.netheriteroad.init;

import com.mugaunco.netheriteroad.blocks.common.AncientDebris;
import com.mugaunco.netheriteroad.blocks.common.SmithingTable;
import net.minecraft.block.Block;


import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final Block ANCIENT_DEBRIS;
    public static final Block SMITHING_TABLE;
    static {
        ANCIENT_DEBRIS = new AncientDebris();
        SMITHING_TABLE = new SmithingTable();
    }
}
