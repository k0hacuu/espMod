package com.SunnyCN.BanditEsp.GUI;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;


import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import static java.lang.Math.round;


public class GUIRenderer extends Gui
{
    Minecraft minecraft = Minecraft.getMinecraft();
    Entity targetEntity;
    Entity targetFound;
    int x = 10;
    int y = 10;
    Class targetClass = Entity.class;


    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event) {

        if (Keyboard.isKeyDown(Keyboard.KEY_SEMICOLON)){y++;}
        if (Keyboard.isKeyDown(Keyboard.KEY_APOSTROPHE)){y--;}


        if (Keyboard.isKeyDown(Keyboard.KEY_P)){
            targetEntity = minecraft.thePlayer.getEntityWorld().findNearestEntityWithinAABB(Entity.class, minecraft.thePlayer.boundingBox.expand(10.0D, 10.0D, 10.0D), minecraft.thePlayer);
            targetClass = targetEntity.getClass();
            System.out.println(targetEntity.getClass().toString());
        }

        drawString(FMLClientHandler.instance().getClient().fontRenderer, "Targeted Entity: " + targetClass.getSimpleName(), x, y, 0xffffff);

        try {
            targetFound = minecraft.thePlayer.getEntityWorld().findNearestEntityWithinAABB(targetClass, minecraft.thePlayer.boundingBox.expand(15.0D, 15.0D, 15.0D), minecraft.thePlayer);
            drawString(FMLClientHandler.instance().getClient().fontRenderer, "X: "+String.valueOf(round(targetFound.posX)) + "  Y: " + String.valueOf(round(targetFound.posY)) + "    Z: " + String.valueOf(round(targetFound.posZ)), x, y+15, 0xffabcf);
        } catch(NullPointerException e) {
            drawString(FMLClientHandler.instance().getClient().fontRenderer, "No " + targetClass.getSimpleName() + " in range.", x, y+15, 0xffffff);
        }
        //minecraft.thePlayer.getEntityWorld().findNearestEntityWithinAABB(Entity.class, minecraft.thePlayer.boundingBox.expand(10.0D, 10.0D, 10.0D), minecraft.thePlayer);
       // try {
            //try {drawString(FMLClientHandler.instance().getClient().fontRenderer, minecraft.thePlayer.getEntityWorld().findNearestEntityWithinAABB(entities.get(0).getClass(), minecraft.thePlayer.boundingBox.expand(10.0D, 10.0D, 10.0D), minecraft.thePlayer).toString(), 40, 0, 0xffffff);} catch (IndexOutOfBoundsException e) {
                //System.out.println("OOB");
            //}
            //drawString(FMLClientHandler.instance().getClient().fontRenderer, String.valueOf(minecraft.thePlayer.getEntityWorld().findNearestEntityWithinAABB(EntityItem.class, minecraft.thePlayer.boundingBox.expand(10.0D, 10.0D, 10.0D), minecraft.thePlayer).getClass()), 40, 60, 0xffffff);
            //drawString(FMLClientHandler.instance().getClient().fontRenderer, minecraft.thePlayer.getEntityWorld().findNearestEntityWithinAABB(EntityItem.class, minecraft.thePlayer.boundingBox.expand(10.0D, 10.0D, 10.0D), minecraft.thePlayer).toString(), 40, 20, 0xffffff);

        //} catch (NullPointerException e) {
            //System.out.println("caught");
            //System.out.println(world.getEntityByID(targetID));
            //System.out.println(world.getEntityByID(targetID).getClass().toString());
        //}
    }

}
