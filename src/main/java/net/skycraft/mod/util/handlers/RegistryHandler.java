package net.skycraft.mod.util.handlers;

import net.skycraft.mod.init.EntityInit;

public class RegistryHandler {

    public static void preInitRegistries(){

        EntityInit.registerEntities();
        RenderHandler.registerEntitiesRenders();

    }

}
