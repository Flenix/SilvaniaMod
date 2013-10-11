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

public class RPDecorBlocks extends Block {

	public RPDecorBlocks(int id) {
		super(id, Material.rock);
		this.setCreativeTab(Silvania.tabSilvania);
		this.setHardness(3.0F);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		icons = new Icon[16];
		
		for(int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("silvania:" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return icons[par2];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs creativeTabs, List list) {
		for (int var4 = 0; var4 < 8; ++var4) {
			list.add(new ItemStack(par1, 1, var4));
		}
	}
	
    @Override
    public int damageDropped(int meta) {
    	return meta;
    }
}