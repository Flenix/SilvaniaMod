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
    private static final ResourceLocation getTexture = new ResourceLocation("silvania", "textures/entities/redbuoy.png");

    public RenderBuoy(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation setTexture(EntityBuoy entity) {
        return getTexture;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.setTexture((EntityBuoy)entity);
    }
}