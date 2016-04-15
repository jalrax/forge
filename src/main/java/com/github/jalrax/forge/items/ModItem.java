package com.github.jalrax.forge.items;

import com.github.jalrax.forge.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Лена on 14.04.2016.
 */
public class ModItem extends Item {

    public ModItem(String name)
    {
        super();
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MODID + ":" + name);
    }
}
