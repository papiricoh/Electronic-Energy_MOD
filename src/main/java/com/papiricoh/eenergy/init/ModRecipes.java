package com.papiricoh.eenergy.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(BlockInit.VOX_ORE, new ItemStack(ItemInit.VOX_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.ORE_PALLADIUM, new ItemStack(ItemInit.PALLADIUM_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.ORE_VIBRANIUM, new ItemStack(ItemInit.VIBRANIUM_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(BlockInit.ORE_ADAMANTIUM, new ItemStack(ItemInit.RAW_ADAMANTIUM, 1), 1.5F);
	}
}
