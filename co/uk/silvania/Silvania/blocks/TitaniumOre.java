package co.uk.silvania.Silvania.blocks;

import co.uk.silvania.Silvania.Silvania;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class TitaniumOre extends Block {

	public TitaniumOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(Silvania.tabSilvania);
		this.setHardness(1.4F);
	}
	
	public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon("Silvania:" + (this.getUnlocalizedName().substring(5)));
	}
	

}