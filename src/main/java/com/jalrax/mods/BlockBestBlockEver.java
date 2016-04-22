package com.jalrax.mods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by repin.s on 15.04.2016.
 */
public class BlockBestBlockEver extends Block {

    String name = this.getUnlocalizedName();

    protected BlockBestBlockEver() {
        super(Material.rock);
        this.setBlockName("bestblockever");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(15F);
        this.setResistance(10F);
        this.setHarvestLevel("pickaxe", 1);
        this.setLightLevel(100F);
        this.setBlockTextureName("mybestmod:BlockBestBlockEver");
    }

    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        return Items.diamond;
    }

    @Override
    public int quantityDropped(Random par1Random) {
        return 20;
    }

}
