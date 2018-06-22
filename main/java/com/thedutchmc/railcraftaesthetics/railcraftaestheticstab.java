package com.thedutchmc.railcraftaesthetics;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.thedutchmc.railcraftaesthetics.init.BlockInit;
import com.thedutchmc.railcraftaesthetics.init.ItemInit;
import com.thedutchmc.railcraftaesthetics.railcraftaesthetics;

class railcraftaestheticstab extends CreativeTabs {

	public railcraftaestheticstab(String label) {
		super("railcraftaestheticstab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.BRONZE_BLOCK));
	}

}