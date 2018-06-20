package com.thedutchmc.railcraftaesthetics.init;

import com.thedutchmc.railcraftaesthetics.block.AbyssalStone;
import com.thedutchmc.railcraftaesthetics.block.Concrete;
import com.thedutchmc.railcraftaesthetics.block.QuarriedStone;
import com.thedutchmc.railcraftaesthetics.block.metal.BrassBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.BronzeBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.CopperBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.InvarBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.LeadBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.NickelBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.SilverBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.SteelBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.TinBlock;
import com.thedutchmc.railcraftaesthetics.block.metal.ZincBlock;
import com.thedutchmc.railcraftaesthetics.block.stones.AbyssalBrick;
import com.thedutchmc.railcraftaesthetics.block.stones.AbyssalChiseled;
import com.thedutchmc.railcraftaesthetics.block.stones.AbyssalCobblestone;
import com.thedutchmc.railcraftaesthetics.block.stones.AbyssalCreeper;
import com.thedutchmc.railcraftaesthetics.block.stones.AbyssalSmallBrick;
import com.thedutchmc.railcraftaesthetics.block.stones.AbyssalSmooth;

import com.thedutchmc.railcraftaesthetics.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockInit {
	
	public static BlockBase BRASS_BLOCK = new BlockBase("brass_block", Material.IRON);
	public static BlockBase BRONZE_BLOCK = new BronzeBlock("bronze_block", Material.IRON);
	public static CopperBlock COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	public static InvarBlock INVAR_BLOCK = new InvarBlock("invar_block", Material.IRON);
	public static LeadBlock LEAD_BLOCK = new LeadBlock("lead_block", Material.IRON);
	public static NickelBlock NICKEL_BLOCK = new NickelBlock("nickel_block", Material.IRON);
	public static SilverBlock SILVER_BLOCK = new SilverBlock("silver_block", Material.IRON);
	public static SteelBlock STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
	public static TinBlock TIN_BLOCK = new TinBlock("tin_block", Material.IRON);
	public static ZincBlock ZINC_BLOCK = new ZincBlock("zinc_block", Material.IRON);
	
	public static AbyssalStone ABYSSAL_STONE = new AbyssalStone("abyssal_stone", Material.ROCK);
	public static QuarriedStone QUARRIED_STONE = new QuarriedStone("quarried_stone", Material.ROCK);
	public static Concrete CONCRETE = new Concrete("concrete", Material.ROCK);
	
	public static AbyssalBrick ABYSSAL_BRICK = new AbyssalBrick("abyssal_brick", Material.ROCK);
	public static AbyssalSmallBrick ABYSSAL_SMALL_BRICK = new AbyssalSmallBrick("abyssal_small_brick", Material.ROCK);
	public static AbyssalSmooth ABYSSAL_SMOOTH = new AbyssalSmooth("abbysal_smooth", Material.ROCK);
	public static AbyssalChiseled ABYSSAL_CHISELED = new AbyssalChiseled("abyssal_chiseled", Material.ROCK);
	public static AbyssalCreeper ABYSSAL_CREEPER = new AbyssalCreeper("abyssal_creeper", Material.ROCK);
	public static AbyssalCobblestone ABYSSAL_COBBLESTONE = new AbyssalCobblestone("abyssal_cobblestone", Material.ROCK);
	
	public static AndesiteBrick ANDESITE_BRICK = new AndesiteBrick("andesite_brick", Material.ROCK);
	public static AndesiteSmallBrick ANDESITE_SMALL_BRICK = new AndesiteSmallBrick("andesite_small_brick", Material.ROCK);
	public static AndesiteSmooth ANDESITE_SMOOTH = new AndesiteSmooth("andesite_smooth", Material.ROCK);
	public static AndesiteChiseled ANDESITE_CHISELED = new AndesiteChiseled("andesite_chiseled", Material.ROCK);
	public static AndesiteCreeper ANDESITE_CREEPER = new AndesiteCreeper("andesite_creeper", Material.ROCK);
	public static AndesiteCobblestone ANDESITE_COBBLESTONE = new AndesiteCobblestone("andesite_cobblestone", Material.ROCK);
	
	public static BleachboneBrick BLEACHBONE_BRICK = new BleachboneBrick("bleachbone_brick", Material.ROCK);
	public static BleachboneSmallBrick BLEACHBONE_SMALL_BRICK = new BleachboneSmallBrick("bleachbone_small_brick", Material.ROCK);
	public static BleachboneSmooth BLEACHBONE_SMOOTH = new BleachboneSmooth("bleachbone_smooth", Material.ROCK);
	public static BleachboneChiseled BLEACHBONE_CHISELED = new BleachboneChiseled("bleachbone_chiseled", Material.ROCK);
	public static BleachboneCreeper BLEACHBONE_CREEPER = new BleachboneCreeper("bleachbone_creeper", Material.ROCK);
	public static BleachboneCobblestone BLEACHBONE_COBBLESTONE = new BleachboneCobblestone("bleachbone_cobblestone", Material.ROCK);
	
	public static BloodstainedBrick BLOODSTAINED_BRICK = new BloodstainedBrick("bloodstained_brick", Material.ROCK);
	public static BloodstainedSmallBrick BLOODSTAINED_SMALL_BRICK = new BloodstainedSmallBrick("bloodstained_small_brick", Material.ROCK);
	public static BloodstainedSmooth BLOODSTAINED_SMOOTH = new BloodstainedSmooth("bloodstained_smooth", Material.ROCK);
	public static BloodstainedChiseled BLOODSTAINED_CHISELED = new BloodstainedChiseled("bloodstained_chiseled", Material.ROCK);
	public static BloodstainedCreeper BLOODSTAINED_CREEPER = new BloodstainedCreeper("bloodstained_creeper", Material.ROCK);
	public static BloodstainedCobblestone BLOODSTAINED_COBBLESTONE = new BloodstainedCobblestone("bloodstained_cobblestone", Material.ROCK);
	
    public static void register(IForgeRegistry<Block> registry) {
    	
        registry.registerAll(BRASS_BLOCK, BRONZE_BLOCK, COPPER_BLOCK, INVAR_BLOCK, LEAD_BLOCK, NICKEL_BLOCK, SILVER_BLOCK,
        		STEEL_BLOCK, TIN_BLOCK, ZINC_BLOCK, ABYSSAL_STONE, QUARRIED_STONE, CONCRETE, ABYSSAL_BRICK, ABYSSAL_SMALL_BRICK,
        		ABYSSAL_SMOOTH, ABYSSAL_CHISELED, ABYSSAL_CREEPER, ABYSSAL_COBBLESTONE, ANDESITE_BRICK, ANDESITE_SMALL_BRICK,
        		ANDESITE_SMOOTH, ANDESITE_CHISELED, ANDESITE_CREEPER, ANDESITE_COBBLESTONE, BLEACHBONE_BRICK, BLEACHBONE_SMALL_BRICK,
        		BLEACHBONE_SMOOTH, BLEACHBONE_CHISELED, BLEACHBONE_CREEPER, BLEACHBONE_COBBLESTONE, BLOODSTAINED_BRICK,
        		BLOODSTAINED_SMALL_BRICK, BLOODSTAINED_SMOOTH, BLOODSTAINED_CHISELED, BLOODSTAINED_CREEPER, BLOODSTAINED_COBBLESTONE);
    }

    public static void registerModels() {
    	BRASS_BLOCK.registerItemModel();
    	BRONZE_BLOCK.registerItemModel();
    	COPPER_BLOCK.registerItemModel();
    	INVAR_BLOCK.registerItemModel();
    	LEAD_BLOCK.registerItemModel();
    	NICKEL_BLOCK.registerItemModel();
    	SILVER_BLOCK.registerItemModel();
    	STEEL_BLOCK.registerItemModel();
    	TIN_BLOCK.registerItemModel();
    	ZINC_BLOCK.registerItemModel();
    	
    	ABYSSAL_STONE.registerItemModel();
    	QUARRIED_STONE.registerItemModel();
    	CONCRETE.registerItemModel();
    	
    	ABYSSAL_BRICK.registerItemModel();
    	ABYSSAL_SMALL_BRICK.registerItemModel();
    	ABYSSAL_SMOOTH.registerItemModel();
    	ABYSSAL_CHISELED.registerItemModel();
    	ABYSSAL_CREEPER.registerItemModel();
    	ABYSSAL_COBBLESTONE.registerItemModel();
    	
    	ANDESITE_BRICK.registerItemModel();
    	ANDESITE_SMALL_BRICK.registerItemModel();
    	ANDESITE_SMOOTH.registerItemModel();
    	ANDESITE_CHISELED.registerItemModel();
    	ANDESITE_CREEPER.registerItemModel();
    	ANDESITE_COBBLESTONE.registerItemModel();
    	
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
        
        registry.registerAll(new ItemBlock(BLEACHBONE_BRICK).setRegistryName(BLEACHBONE_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHBONE_SMALL_BRICK).setRegistryName(BLEACHBONE_SMALL_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHBONE_SMOOTH).setRegistryName(BLEACHBONE_SMOOTH.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHBONE_CHISELED).setRegistryName(BLEACHBONE_CHISELED.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHBONE_CREEPER).setRegistryName(BLEACHBONE_CREEPER.getRegistryName()));
        registry.registerAll(new ItemBlock(BLEACHBONE_COBBLESTONE).setRegistryName(BLEACHBONE_COBBLESTONE.getRegistryName()));
        
        registry.registerAll(new ItemBlock(BLOODSTAINED_BRICK).setRegistryName(BLOODSTAINED_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_SMALL_BRICK).setRegistryName(BLOODSTAINED_SMALL_BRICK.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_SMOOTH).setRegistryName(BLOODSTAINED_SMOOTH.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_CHISELED).setRegistryName(BLOODSTAINED_CHISELED.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_CREEPER).setRegistryName(BLOODSTAINED_CREEPER.getRegistryName()));
        registry.registerAll(new ItemBlock(BLOODSTAINED_COBBLESTONE).setRegistryName(BLOODSTAINED_COBBLESTONE.getRegistryName()));
        
    }
    
}
