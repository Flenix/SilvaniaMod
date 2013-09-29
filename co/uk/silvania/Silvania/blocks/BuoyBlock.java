package co.uk.silvania.Silvania.blocks;

import co.uk.silvania.Silvania.Silvania;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BuoyBlock extends Block {

	public BuoyBlock(int id) {
		super(id, Material.iron);
		this.setHardness(3.0F);
		this.setCreativeTab(Silvania.tabSilvania);
		this.setBlockBounds(0.2F, -0.5F, 0.2F, 0.8F, 2.0F, 0.8F);
	}

	public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon("Silvania:" + (this.getUnlocalizedName().substring(5)));
	}
	
    protected boolean canThisPlantGrowOnThisBlockID(int par1) {
        return par1 == Block.waterStill.blockID;
    }

    @Override
    public boolean isOpaqueCube() {
    	return false;
    }
    
    @Override
    public boolean renderAsNormalBlock() {
    	return false;
    }
    
    @Override
    public boolean canBlockStay(World par1World, int par2, int par3, int par4) {
        return par3 >= 0 && par3 < 256 ? par1World.getBlockMaterial(par2, par3 - 1, par4) == Material.water && par1World.getBlockMetadata(par2, par3 - 1, par4) == 0 : false;
    }
}
