package co.uk.silvania.Silvania;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import co.uk.silvania.Silvania.blocks.ItemRPDecorBlocks;
import co.uk.silvania.Silvania.blocks.ItemRPInvertedLightBlocks;
import co.uk.silvania.Silvania.blocks.ItemRPLightBlocks;
import co.uk.silvania.Silvania.blocks.ItemStainedWood;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
        
	public void registerRenderThings() {}
	
	public void registerRenderInformation() {}
	
	
	public void registerBlocks() {
		GameRegistry.registerBlock(SilvaniaBlocks.dragiteOre, "dragiteOre");
        GameRegistry.registerBlock(SilvaniaBlocks.flariteOre, "flariteOre");
        GameRegistry.registerBlock(SilvaniaBlocks.blackstoneOre, "blackstoneOre");
        GameRegistry.registerBlock(SilvaniaBlocks.purplestoneOre, "purplestoneOre");
        GameRegistry.registerBlock(SilvaniaBlocks.bluestoneOre, "bluestoneOre");
        GameRegistry.registerBlock(SilvaniaBlocks.mythianOre, "mythianOre");
        GameRegistry.registerBlock(SilvaniaBlocks.titaniumOre, "titaniumOre");
        GameRegistry.registerBlock(SilvaniaBlocks.graphiteBlock, "graphiteBlock");
        GameRegistry.registerBlock(SilvaniaBlocks.calciteBlock, "calciteBlock");
        GameRegistry.registerBlock(SilvaniaBlocks.rpDecorBlocks, ItemRPDecorBlocks.class, "silvania" + (SilvaniaBlocks.rpDecorBlocks.getUnlocalizedName().substring(5)));        
        GameRegistry.registerBlock(SilvaniaBlocks.rpLightBlocks, ItemRPLightBlocks.class, "silvania" + (SilvaniaBlocks.rpLightBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(SilvaniaBlocks.rpInvertedLightBlocks, ItemRPInvertedLightBlocks.class, "silvania" + (SilvaniaBlocks.rpInvertedLightBlocks.getUnlocalizedName().substring(5)));        
        GameRegistry.registerBlock(SilvaniaBlocks.stainedWood, ItemStainedWood.class, "silvania" + (SilvaniaBlocks.stainedWood.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(SilvaniaBlocks.quartzDecorBlocks, ItemStainedWood.class, "silvania" + (SilvaniaBlocks.quartzDecorBlocks.getUnlocalizedName().substring(5)));
        //GameRegistry.registerBlock(SilvaniaBlocks.buoyBlock, "buoyBlock");
	}
	
	public void harvestLevel() {
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.dragiteOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.flariteOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.blackstoneOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.purplestoneOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.bluestoneOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.titaniumOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.mythianOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.graphiteBlock, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.calciteBlock, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.rpDecorBlocks, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(SilvaniaBlocks.quartzDecorBlocks, "pickaxe", 0);
		
	}
	
	public void registerItems() {
        GameRegistry.registerItem(SilvaniaItems.silvaniaLogoItem, "silvaniaLogoItem");
        GameRegistry.registerItem(SilvaniaItems.poisonedBread, "poisonedBread");
        GameRegistry.registerItem(SilvaniaItems.poisonedSteak, "poisonedSteak");
        GameRegistry.registerItem(SilvaniaItems.poisonedChicken, "poisonedChicken");
        GameRegistry.registerItem(SilvaniaItems.poisonedPorkchop, "poisonedPorkchop");
        
    	GameRegistry.registerItem(SilvaniaItems.blackstoneDust, "blackstoneDust");
    	GameRegistry.registerItem(SilvaniaItems.bluestoneDust, "bluestoneDust");
    	GameRegistry.registerItem(SilvaniaItems.purplestoneDust, "purplestoneDust");
    	GameRegistry.registerItem(SilvaniaItems.mythianNugget, "mythianNugget");
    	GameRegistry.registerItem(SilvaniaItems.mythianNuggetsSet, "mythianNuggetSet");
    	GameRegistry.registerItem(SilvaniaItems.blackstoneIngot, "blackstoneIngot");
    	GameRegistry.registerItem(SilvaniaItems.bluestoneIngot, "bluestoneIngot");
    	GameRegistry.registerItem(SilvaniaItems.dragiteIngot, "dragiteIngot");
    	GameRegistry.registerItem(SilvaniaItems.flariteIngot, "flariteIngot");
    	GameRegistry.registerItem(SilvaniaItems.mythianIngot, "mythianIngot");
    	GameRegistry.registerItem(SilvaniaItems.obsidianIngot, "obsidianIngot");
    	GameRegistry.registerItem(SilvaniaItems.titaniumIngot, "titaniumIngot");
    	GameRegistry.registerItem(SilvaniaItems.titaniumDustTiny, "titaniumDustTiny");
    	GameRegistry.registerItem(SilvaniaItems.titaniumDust, "titaniumDust");
    	GameRegistry.registerItem(SilvaniaItems.purplestoneIngot, "purplestoneIngot");
    	GameRegistry.registerItem(SilvaniaItems.redstoneIngot, "redstoneIngot");
    	GameRegistry.registerItem(SilvaniaItems.steelIngot, "steelIngot");
    	GameRegistry.registerItem(SilvaniaItems.rawSteel, "rawSteel");
	}
	
	public void nameBlocks() {
        LanguageRegistry.addName(SilvaniaBlocks.dragiteOre, "Dragite Ore");
        LanguageRegistry.addName(SilvaniaBlocks.flariteOre, "Flarite Ore");
        LanguageRegistry.addName(SilvaniaBlocks.blackstoneOre, "Blackstone Ore");
        LanguageRegistry.addName(SilvaniaBlocks.purplestoneOre, "Purplestone Ore");
        LanguageRegistry.addName(SilvaniaBlocks.bluestoneOre, "Bluestone Ore");
        LanguageRegistry.addName(SilvaniaBlocks.mythianOre, "Mythian Ore");
        LanguageRegistry.addName(SilvaniaBlocks.titaniumOre, "Titanium Ore");
        LanguageRegistry.addName(SilvaniaBlocks.graphiteBlock, "Graphite");
        LanguageRegistry.addName(SilvaniaBlocks.calciteBlock, "Calcite");
        //LanguageRegistry.addName(SilvaniaBlocks.buoyBlock, "Buoy");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 0), "Calcite Cobblestone");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 1), "Calcite Bricks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 2), "Chiseled Calcite Brick");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 3), "Calcite Paver");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 4), "Graphite Cobblestone");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 5), "Graphite Bricks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 6), "Chiseled Graphite Brick");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 7), "Graphite Paver");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 0), "White Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 1), "Orange Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 2), "Magenta Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 3), "Light Blue Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 4), "Yellow Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 5), "Lime Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 6), "Pink Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 7), "Grey Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 8), "Light Grey Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 9), "Cyan Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 10), "Purple Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 11), "Blue Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 12), "Brown Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 13), "Green Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 14), "Red Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 15), "Black Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 0), "Inverted White Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 1), "Inverted Orange Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 2), "Inverted Magenta Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 3), "Inverted Light Blue Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 4), "Inverted Yellow Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 5), "Inverted Lime Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 6), "Inverted Pink Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 7), "Inverted Grey Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 8), "Inverted Light Grey Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 9), "Inverted Cyan Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 10), "Inverted Purple Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 11), "Inverted Blue Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 12), "Inverted Brown Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 13), "Inverted Green Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 14), "Inverted Red Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 15), "Inverted Black Lamp");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 0), "White Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 1), "Orange Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 2), "Magenta Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 3), "Light Blue Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 4), "Yellow Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 5), "Lime Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 6), "Pink Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 7), "Grey Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 8), "Light Grey Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 9), "Cyan Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 10), "Purple Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 11), "Blue Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 12), "Brown Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 13), "Green Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 14), "Red Wooden Planks");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.stainedWood, 1, 15), "Black Wooden Planks");
        
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 0), "Quartz Brick");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 1), "Quartz Brick (Small)");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 2), "Quartz Brick (Small, Wooden-Topped)");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 3), "Quartz Brick (Cracked)");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 4), "Quartz Brick (Small, Cracked)");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 5), "Quartz Brick (Small, Cracked, Wooden-Topped)");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 6), "Quartz Tiles");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 7), "Dirty Quartz");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 8), "Quartz Brick Inked");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 9), "Quartz Brick Inked (Small)");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 10), "Quartz Brick Inked (Small, Wooden-Topped");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 11), "Quartz Brick Inked (Cracked)");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 12), "Inked Quartz Pillar");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 13), "Chiseled Inked Quartz");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 14), "Quartz Tiles Inked");
        LanguageRegistry.addName(new ItemStack(SilvaniaBlocks.quartzDecorBlocks, 1, 15), "Smooth Wood");
	}
	
	public void nameItems() {
        LanguageRegistry.addName(SilvaniaItems.silvaniaLogoItem, "Silvania");
        LanguageRegistry.addName(SilvaniaItems.poisonedBread, "Bread");
        LanguageRegistry.addName(SilvaniaItems.poisonedSteak, "Steak");
        LanguageRegistry.addName(SilvaniaItems.poisonedChicken, "Cooked Chicken");
        LanguageRegistry.addName(SilvaniaItems.poisonedPorkchop, "Cooked Porkchop");
        
    	LanguageRegistry.addName(SilvaniaItems.blackstoneDust, "Blackstone Dust");
    	LanguageRegistry.addName(SilvaniaItems.bluestoneDust, "Bluestone Dust");
    	LanguageRegistry.addName(SilvaniaItems.purplestoneDust, "Purplestone Dust");
    	LanguageRegistry.addName(SilvaniaItems.mythianNugget, "Mythian Nugget");
    	LanguageRegistry.addName(SilvaniaItems.mythianNuggetsSet, "Mythian Nugget Set");
    	LanguageRegistry.addName(SilvaniaItems.blackstoneIngot, "Blackstone Ingot");
    	LanguageRegistry.addName(SilvaniaItems.bluestoneIngot, "Bluestone Ingot");
    	LanguageRegistry.addName(SilvaniaItems.dragiteIngot, "Dragite Ingot");
    	LanguageRegistry.addName(SilvaniaItems.flariteIngot, "Flarite Ingot");
    	LanguageRegistry.addName(SilvaniaItems.mythianIngot, "Mythian Ingot");
    	LanguageRegistry.addName(SilvaniaItems.obsidianIngot, "Obsidian Ingot");
    	LanguageRegistry.addName(SilvaniaItems.titaniumIngot, "Titanium Ingot");
    	LanguageRegistry.addName(SilvaniaItems.titaniumDustTiny, "Tiny Pile of Titanium Dust");
    	LanguageRegistry.addName(SilvaniaItems.titaniumDust, "Titanium Dust");
    	LanguageRegistry.addName(SilvaniaItems.purplestoneIngot, "Purplestone Ingot");
    	LanguageRegistry.addName(SilvaniaItems.redstoneIngot, "Redstone Ingot");
    	LanguageRegistry.addName(SilvaniaItems.steelIngot, "Steel Ingot");
    	LanguageRegistry.addName(SilvaniaItems.rawSteel, "Raw Steel");
	}
}