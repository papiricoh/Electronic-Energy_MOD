package com.papiricoh.eenergy.objects.blocks.machines.demelter;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.papiricoh.eenergy.init.ItemInit;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DemeltingFurnaceRecipes 
{	
	private static final DemeltingFurnaceRecipes INSTANCE = new DemeltingFurnaceRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static DemeltingFurnaceRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private DemeltingFurnaceRecipes() 
	{
		//addDemeltingRecipe(new ItemStack(Blocks.ACACIA_FENCE), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(BlockInit.COPPER_CHEST), 5.0F);
		addDemeltingRecipe(new ItemStack(Items.DIAMOND), new ItemStack(ItemInit.RAW_ADAMANTIUM), new ItemStack(ItemInit.ADAMANTIUM_INGOT), 5.0F);
	}

	
	public void addDemeltingRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getDemeltingResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getDemeltingResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getDemeltingExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}