package co.uk.silvania.Silvania.blocks;

import java.util.Random;

import co.uk.silvania.Silvania.Silvania;
import co.uk.silvania.Silvania.SilvaniaItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class GraphiteBlock extends Block {

	public GraphiteBlock(int id) {
		super(id, Material.rock);
		this.setCreativeTab(Silvania.tabSilvania);
		this.setHardness(3.0F);
	}
	
	public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon("silvania:" + (this.getUnlocalizedName().substring(5)));
	}
}
