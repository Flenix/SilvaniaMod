package co.uk.silvania.Silvania.blocks;

import java.util.List;

import co.uk.silvania.Silvania.Silvania;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class QuartzDecorBlocks extends Block {

	public QuartzDecorBlocks(int id) {
		super(id, Material.rock);
		this.setCreativeTab(Silvania.tabSilvania);
		this.setHardness(3.0F);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	private Icon pillerTop;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		icons = new Icon[16];
		
		for(int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("silvania:" + (this.getUnlocalizedName().substring(5)) + i);
			pillerTop = iconRegister.registerIcon("silvania:" + (this.getUnlocalizedName().substring(5)) + "12_top");
		}
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		if (meta == 2 && side == 0) {
			return icons[1];
		}
		if (meta == 2 && side == 1) {
			return icons[15];
		}
		if (meta == 5 && side == 0) {
			return icons[1];
		}
		if (meta == 5 && side == 1) {
			return icons[15];
		}
		if (meta == 10 && side == 0) {
			return icons[9];
		}
		if (meta == 10 && side == 1) {
			return icons[15];
		}
		if (meta == 12 && side == 0) {
			return pillerTop;
		}
		if (meta == 12 && side == 1) {
			return pillerTop;
		}
		return icons[meta];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs creativeTabs, List list) {
		for (int var4 = 0; var4 < 16; ++var4) {
			list.add(new ItemStack(par1, 1, var4));
		}
	}
	
    @Override
    public int damageDropped(int meta) {
    	return meta;
    }
}