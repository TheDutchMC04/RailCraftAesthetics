package com.thedutchmc.railcraftaesthetics.block;

import com.thedutchmc.railcraftaesthetics.railcraftaesthetics;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class AbyssalStone extends Block {

	public AbyssalStone(String name, Material materialIn) {
        
		super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(1.5F);
        setCreativeTab(railcraftaesthetics.railcraftaestheticstab);
        setHarvestLevel("pickaxe", 0);
        
	}
	
    public void registerItemModel() {
    	
    	railcraftaesthetics.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "abyssal_stone");
    }

}
