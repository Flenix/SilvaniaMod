package co.uk.silvania.Silvania;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import co.uk.silvania.Silvania.blocks.*;
import co.uk.silvania.Silvania.entity.EntityBuoy;
import co.uk.silvania.Silvania.items.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="Silvania", name="Silvania", version="0.1.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Silvania { 
	
	public static CreativeTabs tabSilvania = new CreativeTabs("tabSilvania") {
		public ItemStack getIconItemStack() {
				return new ItemStack(SilvaniaItems.silvaniaLogoItem, 1, 0);
			}
	};
	
    @Instance("Silvania")
    public static Silvania instance;

    // Says where the client and server proxy code is loaded.
    @SidedProxy(clientSide="co.uk.silvania.Silvania.client.ClientProxy", serverSide="co.uk.silvania.Silvania.CommonProxy")
    public static CommonProxy proxy;
    
    //Prepare for config!
    public static int blockSilvaniaID;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	SilvaniaConfig.loadConfig(event);
    	SilvaniaConfig config = new SilvaniaConfig();
    	
    	SilvaniaBlocks.init();
    	SilvaniaItems.init();

    }

	public static WorldGen worldGen = new WorldGen();
	
    @EventHandler
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderThings();
            proxy.registerRenderInformation();
            proxy.registerBlocks();
            proxy.registerItems();
            proxy.harvestLevel();
            proxy.nameBlocks();
            proxy.nameItems();

            //Other
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabSilvania", "en_US", "Silvania");
            GameRegistry.registerWorldGenerator(new WorldGen());
            
            EntityRegistry.registerModEntity(EntityBuoy.class, "Buoy", 2, this, 80, 3, true);
            
            
            //CRAFTING RECIPES
            //ItemStacks used
            ItemStack woodStack = new ItemStack(Block.wood);
            ItemStack blackDye = new ItemStack(Item.dyePowder, 1, 0);
            ItemStack redDye = new ItemStack(Item.dyePowder, 1, 1);
            ItemStack greenDye = new ItemStack(Item.dyePowder, 1, 2);
            ItemStack brownDye = new ItemStack(Item.dyePowder, 1, 3);
            ItemStack blueDye = new ItemStack(Item.dyePowder, 1, 4);
            ItemStack purpleDye = new ItemStack(Item.dyePowder, 1, 5);
            ItemStack cyanDye = new ItemStack(Item.dyePowder, 1, 6);
            ItemStack lightGreyDye = new ItemStack(Item.dyePowder, 1, 7);
            ItemStack greyDye = new ItemStack(Item.dyePowder, 1, 8);
            ItemStack pinkDye = new ItemStack(Item.dyePowder, 1, 9);
            ItemStack limeDye = new ItemStack(Item.dyePowder, 1, 10);
            ItemStack yellowDye = new ItemStack(Item.dyePowder, 1, 11);
            ItemStack lightBlueDye = new ItemStack(Item.dyePowder, 1, 12);
            ItemStack magentaDye = new ItemStack(Item.dyePowder, 1, 13);
            ItemStack orangeDye = new ItemStack(Item.dyePowder, 1, 14);
            ItemStack whiteDye = new ItemStack(Item.dyePowder, 1, 15);
            ItemStack unlitLight = new ItemStack(SilvaniaBlocks.rpLightBlocks);
            ItemStack litLight = new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks);
            ItemStack graphite = new ItemStack(SilvaniaBlocks.graphiteBlock);
            ItemStack calcite = new ItemStack(SilvaniaBlocks.calciteBlock);
            ItemStack graphiteCobble = new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 4);
            ItemStack coal = new ItemStack(Item.coal);
            ItemStack ironIngot = new ItemStack(Item.ingotIron);
            ItemStack tinyTitaniumDust = new ItemStack(SilvaniaItems.titaniumDustTiny);
            
            //Shaped
            GameRegistry.addRecipe(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 4, 1), "cc", "cc", 'c', calcite);
            GameRegistry.addRecipe(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 4, 5), "gg", "gg", 'g', graphite);
            
            //Shapeless
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaItems.rawSteel, 1, 0), coal, coal, coal, coal, ironIngot);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaItems.titaniumDust, 1, 0), tinyTitaniumDust, tinyTitaniumDust, tinyTitaniumDust, tinyTitaniumDust);
            
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 0), unlitLight, whiteDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 1), unlitLight, orangeDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 2), unlitLight, magentaDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 3), unlitLight, lightBlueDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 4), unlitLight, yellowDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 5), unlitLight, limeDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 6), unlitLight, pinkDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 7), unlitLight, greyDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 8), unlitLight, lightGreyDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 9), unlitLight, cyanDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 10), unlitLight, purpleDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 11), unlitLight, blueDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 12), unlitLight, brownDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 13), unlitLight, greenDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 14), unlitLight, redDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpLightBlocks, 1, 15), unlitLight, blackDye);
            
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 0), litLight, whiteDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 1), litLight, orangeDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 2), litLight, magentaDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 3), litLight, lightBlueDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 4), litLight, yellowDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 5), litLight, limeDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 6), litLight, pinkDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 7), litLight, greyDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 8), litLight, lightGreyDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 9), litLight, cyanDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 10), litLight, purpleDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 11), litLight, blueDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 12), litLight, brownDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 13), litLight, greenDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 14), litLight, redDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpInvertedLightBlocks, 1, 15), litLight, blackDye);
            
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 0), woodStack, whiteDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 1), woodStack, orangeDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 2), woodStack, magentaDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 3), woodStack, lightBlueDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 4), woodStack, yellowDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 5), woodStack, limeDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 6), woodStack, pinkDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 7), woodStack, greyDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 8), woodStack, lightGreyDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 9), woodStack, cyanDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 10), woodStack, purpleDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 11), woodStack, blueDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 12), woodStack, brownDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 13), woodStack, greenDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 14), woodStack, redDye);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.stainedWood, 1, 15), woodStack, blackDye);
            
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 2), calcite);
            GameRegistry.addShapelessRecipe(new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 6), graphite);

            //Furnace
            GameRegistry.addSmelting(SilvaniaItems.blackstoneDust.itemID, new ItemStack(SilvaniaItems.blackstoneIngot), 0.4F);
            GameRegistry.addSmelting(SilvaniaItems.bluestoneDust.itemID, new ItemStack(SilvaniaItems.bluestoneIngot), 0.4F);
            GameRegistry.addSmelting(SilvaniaItems.purplestoneDust.itemID, new ItemStack(SilvaniaItems.purplestoneIngot), 0.4F);
            GameRegistry.addSmelting(SilvaniaItems.mythianNuggetsSet.itemID, new ItemStack(SilvaniaItems.mythianIngot), 0.4F);
            GameRegistry.addSmelting(SilvaniaBlocks.dragiteOre.blockID, new ItemStack(SilvaniaItems.dragiteIngot), 0.3F);
            GameRegistry.addSmelting(SilvaniaBlocks.flariteOre.blockID, new ItemStack(SilvaniaItems.flariteIngot), 0.3F);
            GameRegistry.addSmelting(SilvaniaBlocks.titaniumOre.blockID, new ItemStack(SilvaniaItems.titaniumDustTiny, 2, 0), 0.3F);
            GameRegistry.addSmelting(SilvaniaItems.titaniumDust.itemID, new ItemStack(SilvaniaItems.titaniumIngot), 0.3F);
            GameRegistry.addSmelting(SilvaniaItems.rawSteel.itemID, new ItemStack(SilvaniaItems.steelIngot), 0.2F);
            GameRegistry.addSmelting(SilvaniaBlocks.calciteBlock.blockID, new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 3), 0.2F);
            GameRegistry.addSmelting(SilvaniaBlocks.graphiteBlock.blockID, new ItemStack(SilvaniaBlocks.rpDecorBlocks, 1, 7), 0.2F);
    }
    


	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    		}
	}
