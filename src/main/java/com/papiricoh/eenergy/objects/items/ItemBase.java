package com.papiricoh.eenergy.objects.items;

import com.papiricoh.eenergy.Main;
import com.papiricoh.eenergy.init.ItemInit;
import com.papiricoh.eenergy.proxy.ClientProxy;
import com.papiricoh.eenergy.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
