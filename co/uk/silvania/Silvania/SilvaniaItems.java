package co.uk.silvania.Silvania;

import net.minecraft.item.Item;
import co.uk.silvania.Silvania.items.*;

public class SilvaniaItems {
	
	private static SilvaniaConfig config;
	
	public static Item silvaniaLogoItem;
	
	public static Item poisonedBread;
	public static Item poisonedSteak;
	public static Item poisonedChicken;
	public static Item poisonedPorkchop;
	
	public static Item blackstoneDust;
	public static Item bluestoneDust;
	public static Item purplestoneDust;
	public static Item mythianNugget;
	public static Item mythianNuggetsSet;
	public static Item blackstoneIngot;
	public static Item bluestoneIngot;
	public static Item dragiteIngot;
	public static Item flariteIngot;
	public static Item mythianIngot;
	public static Item obsidianIngot;
	public static Item titaniumIngot;
	public static Item titaniumDust;
	public static Item titaniumDustTiny;
	public static Item purplestoneIngot;
	public static Item redstoneIngot;
	public static Item steelIngot;
	public static Item rawSteel;
	
	public static void init() {
		initFoodItems();
		initWeapons();
		initMaterials();
		initMisc();
	}
	
	public static void initFoodItems() {
		poisonedBread = new PoisonedBread(config.poisonedBreadID, 0, 0.0F, false).setUnlocalizedName("poisonedBread");
		poisonedSteak = new PoisonedSteak(config.poisonedSteakID, 0, 0.0F, false).setUnlocalizedName("poisonedSteak");
		poisonedChicken = new PoisonedChicken(config.poisonedChickenID, 0, 0.0F, false).setUnlocalizedName("poisonedChicken");
		poisonedPorkchop = new PoisonedPorkchop(config.poisonedPorkchopID, 0, 0.0F, false).setUnlocalizedName("poisonedPorkchop");
	}

	public static void initWeapons() {
		
	}
	
	public static void initMaterials() {
		blackstoneDust = new MiscItems(config.blackstoneDustID).setUnlocalizedName("blackstoneDust");
		bluestoneDust = new MiscItems(config.bluestoneDustID).setUnlocalizedName("bluestoneDust");
		purplestoneDust = new MiscItems(config.purplestoneDustID).setUnlocalizedName("purplestoneDust");
		mythianNugget = new MiscItems(config.mythianNuggetID).setUnlocalizedName("mythianNugget");
		mythianNuggetsSet = new MiscItems(config.mythianNuggetsSetID).setUnlocalizedName("mythianNuggetsSet");
		blackstoneIngot = new MiscItems(config.blackstoneIngotID).setUnlocalizedName("blackstoneIngot");
		bluestoneIngot = new MiscItems(config.bluestoneIngotID).setUnlocalizedName("bluestoneIngot");
		dragiteIngot = new MiscItems(config.dragiteIngotID).setUnlocalizedName("dragiteIngot");
		flariteIngot = new MiscItems(config.flariteIngotID).setUnlocalizedName("flariteIngot");
		mythianIngot = new MiscItems(config.mythianIngotID).setUnlocalizedName("mythianIngot");
		obsidianIngot = new MiscItems(config.obsidianIngotID).setUnlocalizedName("obsidianIngot");
		titaniumIngot = new MiscItems(config.titaniumIngotID).setUnlocalizedName("titaniumIngot");
		titaniumDustTiny = new MiscItems(config.titaniumDustTinyID).setUnlocalizedName("titaniumDustTiny");
		titaniumDust = new MiscItems(config.titaniumDustID).setUnlocalizedName("titaniumDust");
		purplestoneIngot = new MiscItems(config.purplestoneIngotID).setUnlocalizedName("purplestoneIngot");
		redstoneIngot = new MiscItems(config.redstoneIngotID).setUnlocalizedName("redstoneIngot");
		steelIngot = new MiscItems(config.steelIngotID).setUnlocalizedName("steelIngot");
		rawSteel = new MiscItems(config.rawSteelID).setUnlocalizedName("rawSteel");	
	}
	
	public static void initMisc() {
		silvaniaLogoItem = new SilvaniaLogoItem(config.silvaniaLogoItemID).setUnlocalizedName("silvaniaLogoItem");
		
	}
}
