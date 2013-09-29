package co.uk.silvania.Silvania.client;

import co.uk.silvania.Silvania.entity.EntityBuoy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderBuoy extends RenderLiving {
    private static final ResourceLocation field_110833_a = new ResourceLocation("silvania", "textures/entities/redbuoy.png");

    public RenderBuoy(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation func_110832_a(EntityBuoy entity)
    {
        return field_110833_a;
    }

    protected ResourceLocation func_110775_a(Entity entity)
    {
        return this.func_110832_a((EntityBuoy)entity);
    }
}