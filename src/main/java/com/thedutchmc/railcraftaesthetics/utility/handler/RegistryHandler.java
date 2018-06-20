package com.thedutchmc.railcraftaesthetics.utility.handler;

import com.thedutchmc.railcraftaesthetics.init.BlockInit;
/*import com.thedutchmc.railcraftaesthetics.init.ItemInit;*/
import com.thedutchmc.railcraftaesthetics.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/*This class is marked with @EventBusSubcriber which tells forge there is possibly methods that have the @SubscribeEvent annotation. It's used for optimization.
Forge will not have to go through ALL the methods to find the @SubscribeEvent but it will look for the classes that have @EventBusSubscriber and then at the methods.*/
@EventBusSubscriber
public class RegistryHandler {

   	/*The 3 methods below are just a reference to the main class, to keep the code cleeeeean.*/
	public static void preInitRegistries() {

    }

    public static void initRegistries() {

    }

    public static void postInitRegistries() {
    	
    }
    
    /*This class is marked with @SubscribeEvent which means you don't need to reference it anywhere. Forge will look for it and run it.
    This method uses the RegisterItem event which means you do all your item registry in here. So, here you register the shell of your items and block items.*/  
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
    	
    	/*This calls the method called "register" in ItemInit. So it registers the item object or as I like to call it, "shell". It also sets its name.*/
        ItemInit.register(event.getRegistry());
        /*This calls the method called "registerItemBlock" in BlockInit. So it registers the item object from the block. It also sets its name to the block name.*/
        BlockInit.registerItemBlocks(event.getRegistry());
        
    }
    
    /*This class is marked with @SubscribeEvent which means you don't need to reference it anywhere. Forge will look for it and run it.
    This method uses the RegisterBlock event which means you do all your block registry in here. So, here you register the shell of your blocks.*/  
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
    	
    	/*This calls the method called "register" in BlockInit. So it registers the block object or as I like to call it, "shell". It also sets its name.*/
        BlockInit.register(event.getRegistry());
        
    }

    /*This class is marked with @SubscribeEvent which means you don't need to reference it anywhere. Forge will look for it and run it.
    This method uses the RegisterModel event which means you do all your model registry in here. So, here you register the models of your blocks and items.*/  
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
    	
    	/*This calls the method called "registerModels" in ItemInit. So it registers the items' models from the resource packs. (textures, states, meta, NBT, etc)*/
        ItemInit.registerModels();
        /*This calls the method called "registerModels" in BlockInit. So it registers the items' from blocks models from the resource packs. (textures, states, meta, NBT, etc)*/
        BlockInit.registerModels();
        
    }

	    
}
