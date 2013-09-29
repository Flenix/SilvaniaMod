package co.uk.silvania.Silvania;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
    
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        
		switch(world.provider.dimensionId){
            case 1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
		
	}
    
	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		
	}
    
	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		//Dragite
		for(int i = 0; i < 7; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(48);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.dragiteOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Flarite
		for(int i = 0; i < 7; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(48);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.flariteOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Purplestone
		for(int i = 0; i < 6; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(28);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.purplestoneOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Blackstone
		for(int i = 0; i < 6; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(24);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.blackstoneOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Bluestone
		for(int i = 0; i < 6; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(20);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.bluestoneOre.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Titanium
		for(int i = 0; i < 4; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(32);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.titaniumOre.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Mythian
		for(int i = 0; i < 1; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(16);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.mythianOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Calcite
		for(int i = 0; i < 1; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(60);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.calciteBlock.blockID, 30)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Graphite
		for(int i = 0; i < 1; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(60);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(SilvaniaBlocks.graphiteBlock.blockID, 30)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
    
	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		
	}    
}