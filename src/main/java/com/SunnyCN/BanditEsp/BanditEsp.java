package com.SunnyCN.BanditEsp;

import com.SunnyCN.BanditEsp.GUI.GUIRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.common.Mod;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;

@Mod(modid = BanditEsp.MODID, version = BanditEsp.VERSION)
@SideOnly(Side.CLIENT)
public class BanditEsp
{
    public static final String MODID = "BanditEsp";
    public static final String VERSION = "1.4";

    @Mod.Instance(MODID)
    public static BanditEsp instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        GUIRenderer GUIhandler = new GUIRenderer();
        MinecraftForge.EVENT_BUS.register(GUIhandler);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    }

   // @Mod.EventHandler
    //public void init(FMLInitializationEvent event){
        //Minecraft.getMinecraft().thePlayer.sendChatMessage("uwu");
        //Minecraft.getMinecraft().fontRenderer.drawString("TEST", 1, 1, 50);
        //System.out.println("succ");
    //}

    //@SubscribeEvent(priority= EventPriority.NORMAL)
    //public void renderOverlay(RenderGameOverlayEvent.Post event) {
        //Minecraft.getMinecraft().thePlayer.sendChatMessage("uwu");
        //Minecraft.getMinecraft().fontRenderer.drawString("TEST", 1, 1, 50);
        //System.out.println("succ");
    //}
}

