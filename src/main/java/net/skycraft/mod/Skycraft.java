package net.skycraft.mod;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.server.permission.PermissionAPI;
import org.apache.logging.log4j.Logger;
import thaumcraft.api.*;
import baubles.api.*;
import ic2.api.tile.*;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import static net.minecraftforge.server.permission.DefaultPermissionLevel.OP;

@Mod(modid = Skycraft.MODID, name = Skycraft.NAME, version = Skycraft.VERSION, useMetadata = true)
public class Skycraft
{
    public static final String MODID = "skycraft";
    public static final String NAME = "Skycraft";
    public static final String VERSION = "indev";

    private static Logger logger;



    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code

        PermissionAPI.registerNode("skycraft",OP, "Only those having divine power may interact with this.");
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }
}
