package com.papiricoh.eenergy.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(BlockInit.VOX_ORE, new ItemStack(ItemInit.VOX_INGOT, 1), 1.5F);
	}
}
