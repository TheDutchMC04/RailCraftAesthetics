package com.thedutchmc.railcraftaesthetics.block.stones;

import com.thedutchmc.railcraftaesthetics.railcraftaesthetics;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class AndesiteBrick extends Block {

	public AndesiteBrick(String name, Material materialIn) {
        
		super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(1.5F);
        setCreativeTab(railcraftaesthetics.railcraftaestheticstab);
        setHarvestLevel("pickaxe", 0);
        
	}
	
    public void registerItemModel() {
    	
    	railcraftaesthetics.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "andesite_brick");
    }

}
