// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package SanAndreasP.mods.ParticleDecoMod;
import net.minecraft.src.*;


// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class PD_EntityCritFX extends PD_EntityParticlesFX
{
	
	public PD_EntityCritFX(World world, double d, double d1, double d2, double d3, double d4, double d5, boolean b, boolean b1, int i, int j)
	{
	    super(world, d, d1, d2, d3, d4, d5, 0, 0, 0, b, b1, i, j);
	}
	 
	 @Override
	public void initParticle(World world, double d, double d1, double d2, double d3, double d4, double d5, float f, float f1, float f2, float f3) {
		 particleRed = 1.0F;
	     particleGreen = 1.0F;
	     particleBlue = 1.0F;
	     setParticleTextureIndex(65);
	     setSize(0.02F, 0.02F);
	     particleScale = particleScale * (rand.nextFloat() * 0.6F + 0.2F);
	     motionX = d3 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
	     motionY = d4 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
	     motionZ = d5 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
	     particleMaxAge = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
	}

    public void onUpdate()
    {
         prevPosX = posX;
         prevPosY = posY;
         prevPosZ = posZ;
	     particleGreen *= 0.97999999999999996D;
	     particleBlue *= 0.92000000000000002D;

	     moveParticle();
        
         if(particleMaxAge-- <= 0)
         {
             setDead();
         }
    }
}
