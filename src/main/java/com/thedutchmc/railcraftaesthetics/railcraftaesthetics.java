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


/*The @Mod annotation defines this class as the mod class. Forge now knows that it will have to run this class first. The parameters between 
brackets lets forge know the name, id and version of the mod. (This information will be used by forge to distinguish between mods in a modpack).*/
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class railcraftaesthetics {
	
	public static final CreativeTabs railcraftaestheticstab = new railcraftaestheticstab("railcraftaestheticstab");


	/*This allows you to set the mod to one instance. This prevents the coder from accidently duplicating this class (or mod) while coding.*/
	@Instance
	public static railcraftaesthetics instance;
	
	/*This tells forge where to find the proxies in your project. The proxies allow you to tell the game what piece of code should run
	on the server-side or client-side. There's also a common proxy which runs on both. For example, you only want to open a GUI client-side
	or you want to place a block on both sides. Note that we use the reference to keep the code clean, we could technically hard code it here.*/
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	/*This is what makes the mod class so special. In here, you register everything : blocks, items, entities, world generation, etc. These 3 methods that
	follow are ex``ecuted during the forge splash screen. There's preInit, Init and postInit (Init means initialization). Most of the registering
	is gonna happen in init but some stuff are better to register before or after like world generation for example. To keep this class clean, I
	decided to put all the registering in a new class that I call RegistryHandler and reference it here. The @EventHandler tells forge this method
	is used for registering and is needed for the mod to work.*/
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();}
	@EventHandler
	public static void init(FMLInitializationEvent event) {RegistryHandler.initRegistries();}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries();}
	
}
