package com.thedutchmc.railcraftaesthetics.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/*This class represents all the code that is getting executed in the client side. It extends CommonProxy which means everything that is getting done is CommonProxy
has to be absolutely done in this class. This saves you tons of time because you don't need to rewrite a bunch of code.*/
public class ClientProxy extends CommonProxy {
	
		/*This method is getting called by all block and item to register the models. It basically tells forge to take into account the resources. It doesn't do it
		by default for optimization reasons.*/
	   @Override
	   public void registerItemRenderer(Item item, int meta, String id) {
		   
		   ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	        
	   }
	   
}
