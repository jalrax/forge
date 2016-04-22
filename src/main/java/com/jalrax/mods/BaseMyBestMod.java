package com.jalrax.mods;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by repin.s on 15.04.2016.
 */
@Mod(modid = BaseMyBestMod.MODID, version = BaseMyBestMod.VERSION)

public class BaseMyBestMod {

    public static final String MODID = "mybestmod";
    public static final String VERSION = "1.1";
    public static Block bestblockever;
    public static BestBlockGenerator bestblockgenerator = new BestBlockGenerator();

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
        bestblockever = new BlockBestBlockEver();
        GameRegistry.registerBlock(bestblockever, "bestblockever");
        GameRegistry.registerWorldGenerator(bestblockgenerator, 0);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
    }
}
