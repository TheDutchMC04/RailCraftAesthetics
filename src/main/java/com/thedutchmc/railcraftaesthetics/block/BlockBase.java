package com.thedutchmc.railcraftaesthetics.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import com.thedutchmc.railcraftaesthetics.railcraftaesthetics;
import com.thedutchmc.railcraftaesthetics.proxy.CommonProxy;

public class BlockBase extends Block {

    String name;

    public BlockBase( String name, Material material) {
        super(material);

        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(Item item) {
        railcraftaesthetics.proxy.registerItemRenderer(item, 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}