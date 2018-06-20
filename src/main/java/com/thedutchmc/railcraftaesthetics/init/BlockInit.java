package com.thedutchmc.railcraftaesthetics.init;

import com.thedutchmc.railcraftaesthetics.block.BlockBase;
import com.thedutchmc.railcraftaesthetics.block.BlockBaseStone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockInit {
	
	public static BlockBase BRASS_BLOCK = new BlockBase("brass_block", Material.IRON);
	public static BlockBase BRONZE_BLOCK = new BlockBase("bronze_block", Material.IRON);
	public static BlockBase COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static BlockBase INVAR_BLOCK = new BlockBase("invar_block", Material.IRON);
	public static BlockBase LEAD_BLOCK = new BlockBase("lead_block", Material.IRON);
	public static BlockBase NICKEL_BLOCK = new BlockBase("nickel_block", Material.IRON);
	public static BlockBase SILVER_BLOCK = new BlockBase("silver_block", Material.IRON);
	public static BlockBase STEEL_BLOCK = new BlockBase("steel_block", Material.IRON);
	public static BlockBase TIN_BLOCK = new BlockBase("tin_block", Material.IRON);
	public static BlockBase ZINC_BLOCK = new BlockBase("zinc_block", Material.IRON);
	
	public static BlockBaseStone ABYSSAL_STONE = new BlockBaseStone("abyssal_stone", Material.ROCK);
	public static BlockBaseStone QUARRIED_STONE = new BlockBaseStone("quarried_stone", Material.ROCK);
	public static BlockBaseStone CONCRETE = new BlockBaseStone("concrete", Material.ROCK);
	
	public static BlockBaseStone ABYSSAL_BRICK = new BlockBaseStone("abyssal_brick", Material.ROCK);
	public static BlockBaseStone ABYSSAL_SMALL_BRICK = new BlockBaseStone("abyssal_small_brick", Material.ROCK);
	public static BlockBaseStone ABYSSAL_SMOOTH = new BlockBaseStone("abbysal_smooth", Material.ROCK);
	public static BlockBaseStone ABYSSAL_CHISELED = new BlockBaseStone("abyssal_chiseled", Material.ROCK);
	public static BlockBaseStone ABYSSAL_CREEPER = new BlockBaseStone("abyssal_creeper", Material.ROCK);
	public static BlockBaseStone ABYSSAL_COBBLESTONE = new BlockBaseStone("abyssal_cobblestone", Material.ROCK);
	
	public static BlockBaseStone ANDESITE_BRICK = new BlockBaseStone("andesite_brick", Material.ROCK);
	public static BlockBaseStone ANDESITE_SMALL_BRICK = new BlockBaseStone("andesite_small_brick", Material.ROCK);
	public static BlockBaseStone ANDESITE_SMOOTH = new BlockBaseStone("andesite_smooth", Material.ROCK);
	public static BlockBaseStone ANDESITE_CHISELED = new BlockBaseStone("andesite_chiseled", Material.ROCK);
	public static BlockBaseStone ANDESITE_CREEPER = new BlockBaseStone("andesite_creeper", Material.ROCK);
	public static BlockBaseStone ANDESITE_COBBLESTONE = new BlockBaseStone("andesite_cobblestone", Material.ROCK);
	
	public static BlockBaseStone BLEACHEDBONE_BRICK = new BlockBaseStone("BLEACHEDBONE_brick", Material.ROCK);
	public static BlockBaseStone BLEACHEDBONE_SMALL_BRICK = new BlockBaseStone("BLEACHEDBONE_small_brick", Material.ROCK);
	public static BlockBaseStone BLEACHEDBONE_SMOOTH = new BlockBaseStone("BLEACHEDBONE_smooth", Material.ROCK);
	public static BlockBaseStone BLEACHEDBONE_CHISELED = new BlockBaseStone("BLEACHEDBONE_chiseled", Material.ROCK);
	public static BlockBaseStone BLEACHEDBONE_CREEPER = new BlockBaseStone("BLEACHEDBONE_creeper", Material.ROCK);
	public static BlockBaseStone BLEACHEDBONE_COBBLESTONE = new BlockBaseStone("BLEACHEDBONE_cobblestone", Material.ROCK);
	
	public static BlockBaseStone BLOODSTAINED_BRICK = new BlockBaseStone("bloodstained_brick", Material.ROCK);
	public static BlockBaseStone BLOODSTAINED_SMALL_BRICK = new BlockBaseStone("bloodstained_small_brick", Material.ROCK);
	public static BlockBaseStone BLOODSTAINED_SMOOTH = new BlockBaseStone("bloodstained_smooth", Material.ROCK);
	public static BlockBaseStone BLOODSTAINED_CHISELED = new BlockBaseStone("bloodstained_chiseled", Material.ROCK);
	public static BlockBaseStone BLOODSTAINED_CREEPER = new BlockBaseStone("bloodstained_creeper", Material.ROCK);
	public static BlockBaseStone BLOODSTAINED_COBBLESTONE = new BlockBaseStone("bloodstained_cobblestone", Material.ROCK);
	
    public static void register(IForgeRegistry<Block> registry) {
    	
        registry.registerAll(BRASS_BLOCK, BRONZE_BLOCK, COPPER_BLOCK, INVAR_BLOCK, LEAD_BLOCK, NICKEL_BLOCK, SILVER_BLOCK,
        		STEEL_BLOCK, TIN_BLOCK, ZINC_BLOCK, ABYSSAL_STONE, QUARRIED_STONE, CONCRETE, ABYSSAL_BRICK, ABYSSAL_SMALL_BRICK,
        		ABYSSAL_SMOOTH, ABYSSAL_CHISELED, ABYSSAL_CREEPER, ABYSSAL_COBBLESTONE, ANDESITE_BRICK, ANDESITE_SMALL_BRICK,
        		ANDESITE_SMOOTH, ANDESITE_CHISELED, ANDESITE_CREEPER, ANDESITE_COBBLESTONE, BLEACHEDBONE_BRICK, BLEACHEDBONE_SMALL_BRICK,
        		BLEACHEDBONE_SMOOTH, BLEACHEDBONE_CHISELED, BLEACHEDBONE_CREEPER, BLEACHEDBONE_COBBLESTONE, BLOODSTAINED_BRICK,
        		BLOODSTAINED_SMALL_BRICK, BLOODSTAINED_SMOOTH, BLOODSTAINED_CHISELED, BLOODSTAINED_CREEPER, BLOODSTAINED_COBBLESTONE);
    }

    public static void registerModels() {
    	BRASS_BLOCK.registerItemModel(Item.getItemFromBlock(BRASS_BLOCK));
    	BRONZE_BLOCK.registerItemModel(Item.getItemFromBlock(BRONZE_BLOCK));
    	COPPER_BLOCK.registerItemModel(Item.getItemFromBlock(COPPER_BLOCK));
    	INVAR_BLOCK.registerItemModel(Item.getItemFromBlock(INVAR_BLOCK));
    	LEAD_BLOCK.registerItemModel(Item.getItemFromBlock(LEAD_BLOCK));
    	NICKEL_BLOCK.registerItemModel(Item.getItemFromBlock(NICKEL_BLOCK));
    	SILVER_BLOCK.registerItemModel(Item.getItemFromBlock(SILVER_BLOCK));
    	STEEL_BLOCK.registerItemModel(Item.getItemFromBlock(STEEL_BLOCK));
    	TIN_BLOCK.registerItemModel(Item.getItemFromBlock(TIN_BLOCK));
    	ZINC_BLOCK.registerItemModel(Item.getItemFromBlock(ZINC_BLOCK));
    	
    	ABYSSAL_STONE.registerItemModel(Item.getItemFromBlock(ABYSSAL_STONE));
    	QUARRIED_STONE.registerItemModel(Item.getItemFromBlock(QUARRIED_STONE));
    	CONCRETE.registerItemModel(Item.getItemFromBlock(CONCRETE));
    	
    	ABYSSAL_BRICK.registerItemModel(Item.getItemFromBlock(ABYSSAL_BRICK));
    	ABYSSAL_SMALL_BRICK.registerItemModel(Item.getItemFromBlock(ABYSSAL_SMALL_BRICK));
    	ABYSSAL_SMOOTH.registerItemModel(Item.getItemFromBlock(ABYSSAL_SMOOTH));
    	ABYSSAL_CHISELED.registerItemModel(Item.getItemFromBlock(ABYSSAL_CHISELED));
    	ABYSSAL_CREEPER.registerItemModel(Item.getItemFromBlock(ABYSSAL_CREEPER));
    	ABYSSAL_COBBLESTONE.registerItemModel(Item.getItemFromBlock(ABYSSAL_COBBLESTONE));
    	
    	ANDESITE_BRICK.registerItemModel(Item.getItemFromBlock(ANDESITE_BRICK));
    	ANDESITE_SMALL_BRICK.registerItemModel(Item.getItemFromBlock(ANDESITE_SMALL_BRICK));
    	ANDESITE_SMOOTH.registerItemModel(Item.getItemFromBlock(ANDESITE_SMOOTH));
    	ANDESITE_CHISELED.registerItemModel(Item.getItemFromBlock(ANDESITE_CHISELED));
    	ANDESITE_CREEPER.registerItemModel(Item.getItemFromBlock(ANDESITE_CREEPER));
    	ANDESITE_COBBLESTONE.registerItemModel(Item.getItemFromBlock(ANDESITE_COBBLESTONE));
    	
    	BLEACHEDBONE_BRICK.registerItemModel(Item.getItemFromBlock(BLEACHEDBONE_BRICK));
    	BLEACHEDBONE_SMALL_BRICK.registerItemModel(Item.getItemFromBlock(BLEACHEDBONE_SMALL_BRICK));
    	BLEACHEDBONE_SMOOTH.registerItemModel(Item.getItemFromBlock(BLEACHEDBONE_SMOOTH));
    	BLEACHEDBONE_CHISELED.registerItemModel(Item.getItemFromBlock(BLEACHEDBONE_CHISELED));
    	BLEACHEDBONE_CREEPER.registerItemModel(Item.getItemFromBlock(BLEACHEDBONE_CREEPER));
    	BLEACHEDBONE_COBBLESTONE.registerItemModel(Item.getItemFromBlock(BLEACHEDBONE_COBBLESTONE));
    	
    	BLOODSTAINED_BRICK.registerItemModel(Item.getItemFromBlock(BLOODSTAINED_BRICK));
    	BLOODSTAINED_SMALL_BRICK.registerItemModel(Item.getItemFromBlock(BLOODSTAINED_SMALL_BRICK));
    	BLOODSTAINED_SMOOTH.registerItemModel(Item.getItemFromBlock(BLOODSTAINED_SMOOTH));
    	BLOODSTAINED_CHISELED.registerItemModel(Item.getItemFromBlock(BLOODSTAINED_CHISELED));
    	BLOODSTAINED_CREEPER.registerItemModel(Item.getItemFromBlock(BLOODSTAINED_CREEPER));
    	BLOODSTAINED_COBBLESTONE.registerItemModel(Item.getItemFromBlock(BLOODSTAINED_COBBLESTONE));
    	
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
    	
        registry.registerAll(new ItemBlock(BRASS_BLOCK).setRegistryName(BRASS_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(BRONZE_BLOCK).setRegistryName(BRONZE_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(COPPER_BLOCK).setRegistryName(COPPER_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(INVAR_BLOCK).setRegistryName(INVAR_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(LEAD_BLOCK).setRegistryName(LEAD_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(NICKEL_BLOCK).setRegistryName(NICKEL_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(SILVER_BLOCK).setRegistryName(SILVER_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(STEEL_BLOCK).setRegistryName(STEEL_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(TIN_BLOCK).setRegistryName(TIN_BLOCK.getRegistryName()));
        registry.registerAll(new ItemBlock(ZINC_BLOCK).setRegistryName(ZINC_BLOCK.getRegistryName()));
        
        registry.registerAll(new ItemBlock(ABYSSAL_STONE).setRegistryName(ABYSSAL_STONE.getRegistryName()));
        registry.registerAll(new ItemBlock(QUARRIED_STONE).setRegistryName(QUARRIED_STONE.getRegistryName()));
        registry.registerAll(new ItemBlock(CONCRETE).setRegistryName(CONCRETE.getRegistryName()));
        
        registry.registerAll(new ItemBlock(ABYSSAL_BRICK).setRegistryName(ABYSSAL_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(ABYSSAL_SMALL_BRICK).setRegistryName(ABYSSAL_SMALL_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(ABYSSAL_SMOOTH).setRegistryName(ABYSSAL_SMOOTH.getRegistryName()));
        registry.registerAll(new ItemBlock(ABYSSAL_CHISELED).setRegistryName(ABYSSAL_CHISELED.getRegistryName()));
        registry.registerAll(new ItemBlock(ABYSSAL_CREEPER).setRegistryName(ABYSSAL_CREEPER.getRegistryName()));
        registry.registerAll(new ItemBlock(ABYSSAL_COBBLESTONE).setRegistryName(ABYSSAL_COBBLESTONE.getRegistryName()));
        
        registry.registerAll(new ItemBlock(ANDESITE_BRICK).setRegistryName(ANDESITE_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(ANDESITE_SMALL_BRICK).setRegistryName(ANDESITE_SMALL_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(ANDESITE_SMOOTH).setRegistryName(ANDESITE_SMOOTH.getRegistryName()));
        registry.registerAll(new ItemBlock(ANDESITE_CHISELED).setRegistryName(ANDESITE_CHISELED.getRegistryName()));
        registry.registerAll(new ItemBlock(ANDESITE_CREEPER).setRegistryName(ANDESITE_CREEPER.getRegistryName()));
        registry.registerAll(new ItemBlock(ANDESITE_COBBLESTONE).setRegistryName(ANDESITE_COBBLESTONE.getRegistryName()));
        
        registry.registerAll(new ItemBlock(BLEACHEDBONE_BRICK).setRegistryName(BLEACHEDBONE_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHEDBONE_SMALL_BRICK).setRegistryName(BLEACHEDBONE_SMALL_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHEDBONE_SMOOTH).setRegistryName(BLEACHEDBONE_SMOOTH.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHEDBONE_CHISELED).setRegistryName(BLEACHEDBONE_CHISELED.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHEDBONE_CREEPER).setRegistryName(BLEACHEDBONE_CREEPER.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHEDBONE_COBBLESTONE).setRegistryName(BLEACHEDBONE_COBBLESTONE.getRegistryName()));
        
        registry.registerAll(new ItemBlock(BLOODSTAINED_BRICK).setRegistryName(BLOODSTAINED_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_SMALL_BRICK).setRegistryName(BLOODSTAINED_SMALL_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_SMOOTH).setRegistryName(BLOODSTAINED_SMOOTH.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_CHISELED).setRegistryName(BLOODSTAINED_CHISELED.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_CREEPER).setRegistryName(BLOODSTAINED_CREEPER.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_COBBLESTONE).setRegistryName(BLOODSTAINED_COBBLESTONE.getRegistryName()));
        
    }
}
