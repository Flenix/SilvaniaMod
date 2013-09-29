package co.uk.silvania.Silvania.client;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBuoy extends ModelBase {

    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
  

    
    public ModelBuoy()
    {
      textureWidth = 128;
      textureHeight = 128;
      
        Shape1 = new ModelRenderer(this, 76, 46);
        Shape1.addBox(-3.5F, 8.01F, -9.5F, 7, 4, 19);
        Shape1.setRotationPoint(0F, 0F, 0F);
        Shape1.setTextureSize(128, 128);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 76, 69);
        Shape2.addBox(-3.5F, 8.02F, -9.5F, 7, 4, 19);
        Shape2.setRotationPoint(0F, 0F, 0F);
        Shape2.setTextureSize(128, 128);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 1.570796F, 0F);
        Shape3 = new ModelRenderer(this, 76, 24);
        Shape3.addBox(-4F, 8.03F, -9F, 8, 4, 18);
        Shape3.setRotationPoint(0F, 0F, 0F);
        Shape3.setTextureSize(128, 128);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0.7853982F, 0F);
        Shape4 = new ModelRenderer(this, 76, 2);
        Shape4.addBox(-4F, 8.003F, -9F, 8, 4, 18);
        Shape4.setRotationPoint(0F, 0F, 0F);
        Shape4.setTextureSize(128, 128);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, -0.7853982F, 0F);
        Shape5 = new ModelRenderer(this, 47, 58);
        Shape5.addBox(-3F, 12F, -8F, 6, 4, 16);
        Shape5.setRotationPoint(0F, 0F, 0F);
        Shape5.setTextureSize(128, 128);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 47, 38);
        Shape6.addBox(-3F, 12.001F, -8F, 6, 4, 16);
        Shape6.setRotationPoint(0F, 0F, 0F);
        Shape6.setTextureSize(128, 128);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 1.570796F, 0F);
        Shape7 = new ModelRenderer(this, 40, 92);
        Shape7.addBox(-2F, 16.03F, -5F, 4, 4, 10);
        Shape7.setRotationPoint(0F, 0F, 0F);
        Shape7.setTextureSize(128, 128);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 48, 78);
        Shape8.addBox(-2F, 16.02F, -5F, 4, 4, 10);
        Shape8.setRotationPoint(0F, 0F, 0F);
        Shape8.setTextureSize(128, 128);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 1.570796F, 0F);
        Shape9 = new ModelRenderer(this, 47, 0);
        Shape9.addBox(-3.5F, 12.002F, -7.5F, 7, 4, 15);
        Shape9.setRotationPoint(0F, 0F, 0F);
        Shape9.setTextureSize(128, 128);
        Shape9.mirror = true;
        setRotation(Shape9, 0F, 0.7853982F, 0F);
        Shape10 = new ModelRenderer(this, 47, 19);
        Shape10.addBox(-3.5F, 12.003F, -7.5F, 7, 4, 15);
        Shape10.setRotationPoint(0F, 0F, 0F);
        Shape10.setTextureSize(128, 128);
        Shape10.mirror = true;
        setRotation(Shape10, 0F, -0.7853982F, 0F);
        Shape11 = new ModelRenderer(this, 68, 92);
        Shape11.addBox(-2.5F, 16F, -5F, 5, 4, 10);
        Shape11.setRotationPoint(0F, 0F, 0F);
        Shape11.setTextureSize(128, 128);
        Shape11.mirror = true;
        setRotation(Shape11, 0F, 0.7853982F, 0F);
        Shape12 = new ModelRenderer(this, 98, 92);
        Shape12.addBox(-2.5F, 16.003F, -5F, 5, 4, 10);
        Shape12.setRotationPoint(0F, 0F, 0F);
        Shape12.setTextureSize(128, 128);
        Shape12.mirror = true;
        setRotation(Shape12, 0F, -0.7853982F, 0F);
        Shape13 = new ModelRenderer(this, 0, 0);
        Shape13.addBox(-6.5F, -18F, -0.5F, 1, 28, 1);
        Shape13.setRotationPoint(0F, 0F, 0F);
        Shape13.setTextureSize(128, 128);
        Shape13.mirror = true;
        setRotation(Shape13, 0F, 0.7853982F, 0.0F);
        Shape14 = new ModelRenderer(this, 4, 0);
        Shape14.addBox(-6.5F, -18F, -0.5F, 1, 28, 1);
        Shape14.setRotationPoint(0F, 0F, 0F);
        Shape14.setTextureSize(128, 128);
        Shape14.mirror = true;
        setRotation(Shape14, 0F, 2.356194F, -0.1745329F);
        Shape15 = new ModelRenderer(this, 4, 29);
        Shape15.addBox(-6.5F, -18F, -0.5F, 1, 28, 1);
        Shape15.setRotationPoint(0F, 0F, 0F);
        Shape15.setTextureSize(128, 128);
        Shape15.mirror = true;
        setRotation(Shape15, 0F, -2.356194F, 0.0F);
        Shape16 = new ModelRenderer(this, 0, 29);
        Shape16.addBox(-6.5F, -18F, -0.5F, 1, 28, 1);
        Shape16.setRotationPoint(0F, 0F, 0F);
        Shape16.setTextureSize(128, 128);
        Shape16.mirror = true;
        setRotation(Shape16, 0F, -0.7853982F, 0.1745329F);
        Shape17 = new ModelRenderer(this, 8, 0);
        Shape17.addBox(-3F, -19F, -3F, 6, 1, 6);
        Shape17.setRotationPoint(0F, 0F, 0F);
        Shape17.setTextureSize(128, 128);
        Shape17.mirror = true;
        setRotation(Shape17, 0F, 0F, 0F);
        Shape18 = new ModelRenderer(this, 8, 7);
        Shape18.addBox(-3F, -24F, -3F, 6, 1, 6);
        Shape18.setRotationPoint(0F, 0F, 0F);
        Shape18.setTextureSize(128, 128);
        Shape18.mirror = true;
        setRotation(Shape18, 0F, 0F, 0F);
        Shape19 = new ModelRenderer(this, 8, 19);
        Shape19.addBox(-3.5F, -23F, -0.5F, 7, 4, 1);
        Shape19.setRotationPoint(0F, 0F, 0F);
        Shape19.setTextureSize(128, 128);
        Shape19.mirror = true;
        setRotation(Shape19, 0F, 0.7853982F, 0F);
        Shape20 = new ModelRenderer(this, 8, 14);
        Shape20.addBox(-3.5F, -23F, -0.5F, 7, 4, 1);
        Shape20.setRotationPoint(0F, 0F, 0F);
        Shape20.setTextureSize(128, 128);
        Shape20.mirror = true;
        setRotation(Shape20, 0F, -0.7853982F, 0F);
        Shape21 = new ModelRenderer(this, 43, 0);
        Shape21.addBox(-0.5F, -28F, -0.5F, 1, 4, 1);
        Shape21.setRotationPoint(0F, 0F, 0F);
        Shape21.setTextureSize(128, 128);
        Shape21.mirror = true;
        setRotation(Shape21, 0F, 0F, 0F);
        Shape22 = new ModelRenderer(this, 35, 0);
        Shape22.addBox(-1F, -30F, -1F, 2, 2, 2);
        Shape22.setRotationPoint(0F, 0F, 0F);
        Shape22.setTextureSize(128, 128);
        Shape22.mirror = true;
        setRotation(Shape22, 0F, 0F, 0F);
    }
    
    
  
  	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
  		super.render(entity, f, f1, f2, f3, f4, f5);
  		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  		Shape1.render(f5);
  		Shape2.render(f5);
  		Shape3.render(f5);
  		Shape4.render(f5);
  		Shape5.render(f5);
  		Shape6.render(f5);
  		Shape7.render(f5);
  		Shape8.render(f5);
  		Shape9.render(f5);
  		Shape10.render(f5);
  		Shape11.render(f5);
  		Shape12.render(f5);
  		Shape13.render(f5);
  		Shape14.render(f5);
  		Shape15.render(f5);
  		Shape16.render(f5);
  		Shape17.render(f5);
  		Shape18.render(f5);
  		Shape19.render(f5);
  		Shape20.render(f5);
  		Shape21.render(f5);
  		Shape22.render(f5);
  	}
  
  	private void setRotation(ModelRenderer model, float x, float y, float z) {
  		model.rotateAngleX = x;
  		model.rotateAngleY = y;
  		model.rotateAngleZ = z;
  	}
  
  	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
  		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  	}
}
