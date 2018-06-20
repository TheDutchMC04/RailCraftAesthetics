package com.thedutchmc.railcraftaesthetics.init;

import com.thedutchmc.railcraftaesthetics.item.BronzeIngot;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemInit {
	
	/*This is a reference for the item class.*/
	public static final BronzeIngot BRONZE_INGOT = new BronzeIngot("bronze_ingot");

	/*This method registers all the item objects. It is being called in the RegistryHandler.*/
	public static void register(IForgeRegistry<Item> registry) {
	    	
		registry.registerAll(BRONZE_INGOT);
	        
	}

	/*This method registers all the item models. It is being called in the RegistryHandler.*/
	public static void registerModels() {
	    	
		BRONZE_INGOT.registerItemModel();
	        
	}
	    
}
