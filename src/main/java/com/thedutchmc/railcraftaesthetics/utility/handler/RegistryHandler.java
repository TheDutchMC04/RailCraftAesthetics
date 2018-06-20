package com.thedutchmc.railcraftaesthetics.utility.handler;

import com.thedutchmc.railcraftaesthetics.init.BlockInit;
import com.thedutchmc.railcraftaesthetics.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	public static void preInitRegistries() {

    }

    public static void initRegistries() {

    }

    public static void postInitRegistries() {
    	
    }
    
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
    	
        ItemInit.register(event.getRegistry());
        BlockInit.registerItemBlocks(event.getRegistry());
        
    }
    
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
    	
        BlockInit.register(event.getRegistry());
        
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
    	
        ItemInit.registerModels();
        BlockInit.registerModels();
        
    }

	    
}