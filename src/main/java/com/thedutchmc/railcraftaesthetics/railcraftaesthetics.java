package com.thedutchmc.railcraftaesthetics;

import com.thedutchmc.railcraftaesthetics.proxy.CommonProxy;
import com.thedutchmc.railcraftaesthetics.utility.Reference;
import com.thedutchmc.railcraftaesthetics.utility.handler.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class railcraftaesthetics {
	
	public static final CreativeTabs railcraftaestheticstab = new railcraftaestheticstab("railcraftaestheticstab");

	@Instance
	public static railcraftaesthetics instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();}
	@EventHandler
	public static void init(FMLInitializationEvent event) {RegistryHandler.initRegistries();}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries();}
	
}
