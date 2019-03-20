//package com.papiricoh.eenergy.objects.armour;

//import com.papiricoh.eenergy.init.ItemInit;

//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.inventory.EntityEquipmentSlot;
//import net.minecraft.item.ItemArmor.ArmorMaterial;
//import net.minecraft.item.ItemStack;
//import net.minecraft.world.World;

//public class FlyArmour extends ArmourBase {
//	public FlyArmour(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
//		super(name, materialIn, renderIndexIn, equipmentSlotIn);
//		setUnlocalizedName(name);
//		setRegistryName(name);
//		setCreativeTab(CreativeTabs.COMBAT);
//		
//		ItemInit.ITEMS.add(this);
//		
//        }
//		private String [] armourTypes = new String[] {"mk22_helmet", "mk22_chestplate", "mk22_leggings", "mk22_boots"};
//		public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack){
//			if (this.isWearingFullSet(player, ItemInit.M, "mk22_chestplate", "mk22_leggings", "mk22_boots")) {
//	            player.capabilities.allowFlying = true;
//		}
//
//	}
//}
