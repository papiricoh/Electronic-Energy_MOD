package com.papiricoh.eenergy.init;

import java.util.ArrayList;
import java.util.List;

import com.papiricoh.eenergy.objects.blocks.item.BlockBase;
import com.papiricoh.eenergy.objects.blocks.item.HardOre;
import com.papiricoh.eenergy.objects.blocks.machines.demelter.BlockDemeltingFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//MaterialBlocks
	public static final Block VOX_BLOCK = new BlockBase("vox_block", Material.IRON);
	public static final Block PALLADIUM_BLOCK = new BlockBase("palladium_block", Material.IRON);
	public static final Block VIBRANIUM_BLOCK = new BlockBase("vibranium_block", Material.IRON);
	
	//Ores
	public static final Block VOX_ORE = new BlockBase("vox_ore", Material.IRON);
	public static final Block ORE_PALLADIUM = new HardOre("ore_palladium", Material.IRON);
	public static final Block ORE_VIBRANIUM = new HardOre("ore_vibranium", Material.IRON);
	public static final Block ORE_ADAMANTIUM = new HardOre("ore_adamantium", Material.IRON);
	
	public static final Block DEMELTING_FURNACE = new BlockDemeltingFurnace("demelting_furnace");
}
