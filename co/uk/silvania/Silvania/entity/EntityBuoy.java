package co.uk.silvania.Silvania.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBuoy extends EntityAnimal {

	public EntityBuoy(World par1World) {
		super(par1World);
		this.getNavigator().setAvoidsWater(true);
		this.setSize(1.5F, 0.9F);
        this.isImmuneToFire = false;
		float var2 = 0.25F;
        this.tasks.addTask(0, new EntityAISwimming(this));
	}

	public boolean isAIEnabled() {
		return true;
	}

	protected void func_110147_ax() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth); 
	}

	protected String getLivingSound() {
		return "mob.glog.say";
	}

	protected String getHurtSound() {
		return "mob.glog.say";
	}

	protected String getDeathSound() {
		return "mob.glog.death";
	}

	protected void playStepSound(int par1, int par2, int par3, int par4) {
		this.worldObj.playSoundAtEntity(this, "mob.glog.step", 0.15F,  1.0F);
	}

	/*protected int getDropItemId() {
		return Remula.rawGlogMeat.itemID;
	}*/

	public EntityAgeable createChild(EntityAgeable var1) {
		return null;
	}
}