package com.thedutchmc.railcraftaesthetics.item;

import com.thedutchmc.railcraftaesthetics.railcraftaesthetics;

import net.minecraft.item.Item;

public class BronzeIngot extends Item {
	
	/*This is the class constructor. This is gonna get called when the item gets registered. It sets the name from the ItemInit declaration parameter.*/
	public BronzeIngot(String name) {
		
        setRegistryName(name);
        setUnlocalizedName(name);
        
	}
	
	/*This is the method that registers the item model. It is getting called in ItemInit.*/
    public void registerItemModel() {
    	
        railcraftaesthetics.proxy.registerItemRenderer(this, 0, "bronze_ingot");
        
    }
    
}
