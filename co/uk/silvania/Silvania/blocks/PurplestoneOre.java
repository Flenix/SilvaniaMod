package co.uk.silvania.Silvania.blocks;

import java.util.Random;

import co.uk.silvania.Silvania.Silvania;
import co.uk.silvania.Silvania.SilvaniaBlocks;
import co.uk.silvania.Silvania.SilvaniaItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class PurplestoneOre extends Block {

	public PurplestoneOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(Silvania.tabSilvania);
		this.setHardness(1.9F);
	}
	
	public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon("silvania:" + (this.getUnlocalizedName().substring(5)));
	}
	
    public int idDropped(int par1, Random random, int par2) {
    	return (SilvaniaItems.purplestoneDust.itemID);
    }
    
    public int quantityDropped(Random par1Random) {
        return this.blockID == SilvaniaBlocks.purplestoneOre.blockID ? 3 : 1;
    }
}
