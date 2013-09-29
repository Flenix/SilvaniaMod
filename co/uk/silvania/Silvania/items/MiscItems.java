package co.uk.silvania.Silvania.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import co.uk.silvania.Silvania.Silvania;

public class MiscItems extends Item {
	
	public MiscItems(int id) {
		super(id);
		this.setMaxStackSize(64);
		this.setCreativeTab(Silvania.tabSilvania);
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("Silvania:" + (this.getUnlocalizedName().substring(5)));
	}

}
