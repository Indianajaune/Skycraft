package net.skycraft.mod.client.renders;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.util.ResourceLocation;
import net.skycraft.mod.Skycraft;
import net.skycraft.mod.entities.EntitySquidman;
import net.skycraft.mod.entities.models.ModelSquidman;

public class RenderSquidman extends RenderLiving<EntitySquidman> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Skycraft.MODID + ":textures/entities/squidman.png");

    public RenderSquidman(RenderManager manager){

        super(manager, new ModelSquidman(),0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntitySquidman entity){

        return TEXTURES;
    }


    @Override
    protected void applyRotations(EntitySquidman entityLiving,float p_77043_2_, float rotationYaw, float partialTicks){

        super.applyRotations(entityLiving,p_77043_2_,rotationYaw,partialTicks);
    }
}