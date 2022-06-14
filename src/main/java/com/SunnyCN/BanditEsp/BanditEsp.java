package com.SunnyCN.BanditEsp;

import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = BanditEsp.MODID, version = BanditEsp.VERSION)
public class BanditEsp
{
    public static final String MODID = "BanditEsp";
    public static final String VERSION = "1.0";

    @SubscribeEvent
    public void renderOverlay(TickEvent event) {
        Minecraft.getMinecraft().thePlayer.sendChatMessage("uwu");
    }
}
