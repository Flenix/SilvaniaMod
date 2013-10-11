package co.uk.silvania.Silvania.blocks;

import java.util.Random;

import co.uk.silvania.Silvania.Silvania;
import co.uk.silvania.Silvania.SilvaniaBlocks;
import co.uk.silvania.Silvania.SilvaniaItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;

public class CalciteBlock extends Block {

	public CalciteBlock(int id) {
		super(id, Material.rock);
		this.setCreativeTab(Silvania.tabSilvania);
		this.setHardness(1.2F);
	}
	
	public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon("silvania:" + (this.getUnlocalizedName().substring(5)));
	}
}
