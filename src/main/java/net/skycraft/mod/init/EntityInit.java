package net.skycraft.mod.init;

import net.minecraft.client.main.Main;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.skycraft.mod.Skycraft;
import net.skycraft.mod.entities.EntitySquidman;
import net.skycraft.mod.util.Reference;

public class EntityInit {

    public static void registerEntities(){

        registerEntity("Squidman", EntitySquidman.class, Reference.ENTITY_SQUIDMAN,50);
    }


    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range){
        //need to change Skycraft.class to Skycraft.instance
        EntityRegistry.registerModEntity(new ResourceLocation(Skycraft.MODID + " : " + name), entity ,name, id , Skycraft.class, range,1, true );
    }

}
