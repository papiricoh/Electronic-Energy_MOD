package com.papiricoh.eenergy.init;

import java.util.ArrayList;
import java.util.List;

import com.papiricoh.eenergy.Main;
import com.papiricoh.eenergy.objects.armour.ArmourBase;
import com.papiricoh.eenergy.objects.items.ItemBase;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Material
	public static final ArmorMaterial VOX_ARMOUR = EnumHelper.addArmorMaterial("vox_armour", Main.MODID + ":vox", 45, new int[]{5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	//Components
	public static final Item NANO_CHIP = new ItemBase("nano_chip");
	
	//Items
	public static final Item VOX_INGOT = new ItemBase("vox_ingot");
	public static final Item PALLADIUM_INGOT = new ItemBase("palladium_ingot");
	public static final Item VIBRANIUM_INGOT = new ItemBase("vibranium_ingot");
	public static final Item ADAMANTIUM_INGOT = new ItemBase("adamantium_ingot");
	
	//Armor
	public static final Item VOX_HELMET = new ArmourBase("vox_helmet", VOX_ARMOUR, 1, EntityEquipmentSlot.HEAD);
	public static final Item VOX_CHESTPLATE = new ArmourBase("vox_chestplate", VOX_ARMOUR, 1, EntityEquipmentSlot.CHEST);
	public static final Item VOX_LEGGINGS = new ArmourBase("vox_leggings", VOX_ARMOUR, 1, EntityEquipmentSlot.LEGS);
	public static final Item VOX_BOOTS = new ArmourBase("vox_boots", VOX_ARMOUR, 1, EntityEquipmentSlot.FEET);
}
