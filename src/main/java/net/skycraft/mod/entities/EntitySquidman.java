package net.skycraft.mod.entities;


import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntitySquidman extends EntityCreature implements IMob
{



    public EntitySquidman(World world)
    {
        super(world);


    }


    @Override
    protected void initEntityAI() {
        this.tasks.addTask(2, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(4, new EntityAIAttackMelee(this, 0.65D, true));
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    protected boolean canDropLoot() {
        return true;
    }
}
