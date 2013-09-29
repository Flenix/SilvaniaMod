package co.uk.silvania.Silvania.items;

import co.uk.silvania.Silvania.SilvaniaItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class PoisonedBread extends ItemFood {
	
    private final int healAmount;
    private final float saturationModifier;
    private final boolean isWolfsFavoriteMeat;
	
	public PoisonedBread(int id, int par2, float par3, boolean par4) {
		super(id, par2, par4);
        this.healAmount = par2;
        this.isWolfsFavoriteMeat = par4;
        this.saturationModifier = par3;
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setMaxStackSize(64);
	}
	
    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, 300, 3));
    	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 3));
    }
    
    @Override
    public Icon getIconFromDamage(int par1) {
        return Item.bread.getIcon(new ItemStack(Item.bread), 0);
    }

}
