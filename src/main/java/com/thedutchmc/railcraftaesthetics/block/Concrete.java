package com.thedutchmc.railcraftaesthetics.block;

import com.thedutchmc.railcraftaesthetics.railcraftaesthetics;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Concrete extends Block {

	/*This is the class constructor. This is gonna get called when the block gets registered. It sets the material and name from the BlockInit declaration parameter.*/
	public Concrete(String name, Material materialIn) {
        
		super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(2F);
        setCreativeTab(railcraftaesthetics.railcraftaestheticstab);
        setHarvestLevel("pickaxe", 0);
        
	}
	
	/*This is the method that registers the item from block model. It is getting called in BlockInit.*/
    public void registerItemModel() {
    	
    	railcraftaesthetics.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "concrete");
        
    }

}
