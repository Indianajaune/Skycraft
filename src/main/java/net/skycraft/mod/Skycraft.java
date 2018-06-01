package net.skycraft.mod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Skycraft.MODID, name = Skycraft.NAME, version = Skycraft.VERSION, useMetadata = true)
public class Skycraft
{
    //Has to be the same values as in the mcmod.info file otherwise the mcmod.info is not used in the mod menu
    public static final String MODID = "skycraft";
    public static final String NAME = "Skycraft";
    public static final String VERSION = "0.0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
