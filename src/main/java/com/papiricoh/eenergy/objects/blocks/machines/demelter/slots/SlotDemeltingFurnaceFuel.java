package com.papiricoh.eenergy.objects.blocks.machines.demelter.slots;

import com.papiricoh.eenergy.objects.blocks.machines.demelter.TileEntityDemeltingFurnace;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotDemeltingFurnaceFuel extends Slot
{
	public SlotDemeltingFurnaceFuel(IInventory inventory, int index, int x, int y)
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityDemeltingFurnace.isItemFuel(stack);
	}
	
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}
