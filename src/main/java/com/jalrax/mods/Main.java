package com.jalrax.mods;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by repin.s on 15.04.2016.
 */
@Mod(modid = "mybestmod", name = "My Best Mod", version = "1.0")

public class Main {

    public static Block bestblockever;

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
        bestblockever = new BlockBestBlockEver();
        GameRegistry.registerBlock(bestblockever, "bestblockever");
    }

}
