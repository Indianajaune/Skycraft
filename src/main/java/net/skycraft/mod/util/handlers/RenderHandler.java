package net.skycraft.mod.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.skycraft.mod.client.renders.RenderSquidman;
import net.skycraft.mod.entities.EntitySquidman;

public class RenderHandler {

    public static void registerEntitiesRenders(){

        RenderingRegistry.registerEntityRenderingHandler(EntitySquidman.class, new IRenderFactory<EntitySquidman>() {
            @Override
            public Render<? super EntitySquidman> createRenderFor(RenderManager manager) {
                return new RenderSquidman(manager);
            }
        });
    }
}
