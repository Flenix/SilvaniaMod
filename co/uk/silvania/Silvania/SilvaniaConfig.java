package co.uk.silvania.Silvania;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class SilvaniaConfig {
	
    public static int rpDecorBlocksID;
    public static int graphiteBlockID;
    public static int calciteBlockID;
    public static int rpLightBlocksID;
    public static int stainedWoodID;
    public static int quartzDecorID;
    
	public static int dragiteOreID;
	public static int flariteOreID;
    public static int blackstoneOreID;
    public static int purplestoneOreID;
    public static int bluestoneOreID;
    public static int mythianOreID;
    public static int titaniumOreID;
    
    public static int airFilterBlockID;
    public static int buoyBlockID;
	
	public static int silvaniaLogoItemID;
	public static int poisonedBreadID;
	public static int poisonedSteakID;
	public static int poisonedChickenID;
	public static int poisonedPorkchopID;
	
	public static int blackstoneDustID;
	public static int bluestoneDustID;
	public static int purplestoneDustID;
	public static int mythianNuggetID;
	public static int mythianNuggetsSetID;
	public static int blackstoneIngotID;
	public static int bluestoneIngotID;
	public static int dragiteIngotID;
	public static int flariteIngotID;
	public static int mythianIngotID;
	public static int obsidianIngotID;
	public static int titaniumIngotID;
	public static int titaniumDustTinyID;
	public static int titaniumDustID;
	public static int purplestoneIngotID;
	public static int redstoneIngotID;
	public static int steelIngotID;
	public static int rawSteelID;
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		rpDecorBlocksID = config.getBlock("Decor Blocks", 2290).getInt();
		graphiteBlockID = config.getBlock("Graphite", 2291).getInt();
		calciteBlockID = config.getBlock("Calcite", 2292).getInt();
		rpLightBlocksID = config.getBlock("Lights (USES TWO IDS! ID & ID+1)", 2293).getInt();
		stainedWoodID = config.getBlock("Stained Wood", 2295).getInt();
		
		dragiteOreID = config.getBlock("Dragite Ore", 2296).getInt();
		flariteOreID = config.getBlock("Flarite Ore", 2297).getInt();
		blackstoneOreID = config.getBlock("Blackstone Ore", 2298).getInt();
		purplestoneOreID = config.getBlock("Purplestone Ore", 2299).getInt();
		bluestoneOreID = config.getBlock("Bluestone Ore", 2300).getInt();
		mythianOreID = config.getBlock("Mythian Ore", 2301).getInt();
		titaniumOreID = config.getBlock("Titanium Ore", 2302).getInt();
		
		airFilterBlockID = config.getBlock("Air Filter", 2305).getInt();
		buoyBlockID = config.getBlock("Buoy", 2310).getInt();
		quartzDecorID = config.getBlock("Quartz Decorative", 2311).getInt();
		
		silvaniaLogoItemID = config.getItem("Silvania Logo", 17300).getInt();
		poisonedBreadID = config.getItem("Poisoned Bread", 17301).getInt();
		poisonedSteakID = config.getItem("Poisoned Steak", 17302).getInt();
		poisonedChickenID = config.getItem("Poisoned Chicken", 17303).getInt();
		poisonedPorkchopID = config.getItem("Poisoned Porkchop", 17304).getInt();
		
		blackstoneDustID = config.getItem("Blackstone Dust", 17310).getInt();
		bluestoneDustID = config.getItem("Bluestone Dust", 17311).getInt();
		purplestoneDustID = config.getItem("Purplestone Dust", 17312).getInt();
		mythianNuggetID = config.getItem("Mythian Nugget", 17313).getInt();
		mythianNuggetsSetID = config.getItem("Mythian Nugget Set", 17309).getInt();
		blackstoneIngotID = config.getItem("Blackstone Ingot", 17314).getInt();
		bluestoneIngotID = config.getItem("Bluestone Ingot", 17315).getInt();
		dragiteIngotID = config.getItem("Dragite Ingot", 17316).getInt();
		flariteIngotID = config.getItem("Flarite Ingot", 17317).getInt();
		mythianIngotID = config.getItem("Mythian Ingot", 17318).getInt();
		obsidianIngotID = config.getItem("Obsidian Ingot", 17319).getInt();
		titaniumIngotID = config.getItem("Titanium Ingot", 17320).getInt();
		purplestoneIngotID = config.getItem("Purplestone Ingot", 17321).getInt();
		redstoneIngotID = config.getItem("Redstone Ingot", 17322).getInt();
		steelIngotID = config.getItem("Steel Ingot", 17323).getInt();
		rawSteelID = config.getItem("Raw Steel", 17324).getInt();
		titaniumDustTinyID = config.getItem("Tiny Titanium Dust", 17325).getInt();
		titaniumDustID = config.getItem("Titanium Dust", 17326).getInt();
		config.save();
	}

}
