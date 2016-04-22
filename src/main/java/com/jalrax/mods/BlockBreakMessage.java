package com.jalrax.mods;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent;

/**
 * Created by Лена on 15.04.2016.
 */
public class BlockBreakMessage {

    @SubscribeEvent
    public void sendMessage(BlockEvent.BreakEvent event) {
        event.getPlayer().addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + event.block.getLocalizedName()));
    }

}
