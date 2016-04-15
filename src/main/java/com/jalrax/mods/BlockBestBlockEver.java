package com.jalrax.mods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by repin.s on 15.04.2016.
 */
public class BlockBestBlockEver extends Block {
    protected BlockBestBlockEver() {
        super(Material.rock);
        this.setBlockName("bestblockever");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(15F);
        this.setResistance(10F);
        this.setHarvestLevel("pickaxe", 3);
        this.setLightLevel(100F);
        this.setBlockTextureName("mybestmod:BlockBestBlockEver");
    }
}
