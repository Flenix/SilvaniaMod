package co.uk.silvania.Silvania;

import net.minecraft.block.Block;
import co.uk.silvania.Silvania.blocks.*;

public class SilvaniaBlocks {
	
	private static SilvaniaConfig config;
	
    public static Block rpDecorBlocks;
    public static Block graphiteBlock;
    public static Block calciteBlock;
    public static Block rpInvertedLightBlocks;
    public static Block rpLightBlocks;
    public static Block stainedWood;
    public static Block quartzDecorBlocks;
    
    public static Block dragiteOre;
    public static Block flariteOre;
    public static Block blackstoneOre;
    public static Block purplestoneOre;
    public static Block bluestoneOre;
    public static Block mythianOre;
    public static Block titaniumOre;
    //public static Block buoyBlock;
	
	
	public static void init() {
		initDecorBlocks();
		initOres();
		initFunctionBlocks();
	}
	
	public static void initDecorBlocks() {
	    rpDecorBlocks = new RPDecorBlocks(config.rpDecorBlocksID).setUnlocalizedName("rpDecorBlocks");
	    graphiteBlock = new GraphiteBlock(config.graphiteBlockID).setUnlocalizedName("graphiteBlock");
	    calciteBlock = new CalciteBlock(config.calciteBlockID).setUnlocalizedName("calciteBlock");
	    rpInvertedLightBlocks = new RPLightBlocks(config.rpLightBlocksID, true).setUnlocalizedName("rpLightBlocks");
	    rpLightBlocks = new RPLightBlocks(config.rpLightBlocksID + 1, false).setUnlocalizedName("rpLightBlocksOff");
	    stainedWood = new StainedWood(config.stainedWoodID).setUnlocalizedName("stainedWood");
	    quartzDecorBlocks = new QuartzDecorBlocks(config.quartzDecorID).setUnlocalizedName("quartzDecorBlocks");
	}
	
	public static void initOres() {
	    dragiteOre = new DragiteOre(config.dragiteOreID).setUnlocalizedName("dragiteOre");
	    flariteOre = new FlariteOre(config.flariteOreID).setUnlocalizedName("flariteOre");
	    blackstoneOre = new BlackstoneOre(config.blackstoneOreID).setUnlocalizedName("blackstoneOre");
	    purplestoneOre = new PurplestoneOre(config.purplestoneOreID).setUnlocalizedName("purplestoneOre");
	    bluestoneOre = new BluestoneOre(config.bluestoneOreID).setUnlocalizedName("bluestoneOre");
	    mythianOre = new MythianOre(config.mythianOreID).setUnlocalizedName("mythianOre");
	    titaniumOre = new TitaniumOre(config.titaniumOreID).setUnlocalizedName("titaniumOre");
	}
	
	public static void initFunctionBlocks() {
		//buoyBlock = new BuoyBlock(config.buoyBlockID).setUnlocalizedName("buoyBlock");
	}

}
