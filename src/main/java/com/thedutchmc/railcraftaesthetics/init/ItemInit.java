package com.thedutchmc.railcraftaesthetics.init;

import com.thedutchmc.railcraftaesthetics.item.BronzeIngot;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemInit {
	
	public static final BronzeIngot BRONZE_INGOT = new BronzeIngot("bronze_ingot");

	public static void register(IForgeRegistry<Item> registry) {
	    	
		registry.registerAll(BRONZE_INGOT);
	        
	}

	public static void registerModels() {
	    	
		BRONZE_INGOT.registerItemModel();
	        
	}
	    
}
