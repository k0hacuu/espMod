package com.SunnyCN.BanditEsp;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = BanditEsp.MODID, version = BanditEsp.VERSION)
public class BanditEsp
{
    public static final String MODID = "BanditEsp";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        
    }
}