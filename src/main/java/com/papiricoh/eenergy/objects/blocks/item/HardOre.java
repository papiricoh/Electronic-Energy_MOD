package com.papiricoh.eenergy.objects.blocks.item;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class HardOre extends BlockBase{
	public HardOre(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.STONE);
        setHardness(6.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 3);
        //setLightLevel(0F);
        //setBlockUnbreakeable(0F);
	}
}
