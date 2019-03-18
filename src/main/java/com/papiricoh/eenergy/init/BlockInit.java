package com.papiricoh.eenergy.init;

import java.util.ArrayList;
import java.util.List;

import com.papiricoh.eenergy.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block VOX_BLOCK = new BlockBase("vox_block", Material.IRON);
	
	//Ores
	public static final Block VOX_ORE = new BlockBase("vox_ore", Material.IRON);
	public static final Block PALLADIUM_ORE = new BlockBase("palladium_ore", Material.IRON);
	public static final Block VIBRANIUM_ORE = new BlockBase("vibranium_ore", Material.IRON);
	public static final Block ADAMANTIUM_ORE = new BlockBase("adamantium_ore", Material.IRON);
}
