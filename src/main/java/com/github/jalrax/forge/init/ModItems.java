package com.github.jalrax.forge.init;

import com.github.jalrax.forge.helpers.RegisterHelper;
import com.github.jalrax.forge.items.ModItem;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

/**
 * Created by Лена on 14.04.2016.
 */
public class ModItems {

    public static Item itemName = new ModItem("itemName");

    public static void registerItems()
    {
        RegisterHelper.registerItem(itemName);
    }

    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.registerItems();
    }
}
