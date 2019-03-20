package com.papiricoh.eenergy.world.gen;

import java.util.Random;

import com.papiricoh.eenergy.init.BlockInit;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator{
	private WorldGenerator ore_vibranium, ore_palladium, ore_adamantium;
	
	public WorldGenCustomOres()
	{
		ore_vibranium = new WorldGenMinable(BlockInit.ORE_VIBRANIUM.getDefaultState(), 3);
		ore_palladium = new WorldGenMinable(BlockInit.ORE_PALLADIUM.getDefaultState(), 3);
		ore_adamantium = new WorldGenMinable(BlockInit.ORE_ADAMANTIUM.getDefaultState(), 4);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension())
		{
		//Case 0 = Overworld
		case 0:
			//runGenerator(item/block, world, random, chunkX, chunkZ, generation %, minHeight, maxHeight);
			runGenerator(ore_vibranium, world, random, chunkX, chunkZ, 5, 0, 32);
			runGenerator(ore_palladium, world, random, chunkX, chunkZ, 10, 0, 32);
			runGenerator(ore_adamantium, world, random, chunkX, chunkZ, 10, 32, 64);
			
			break;
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heighDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heighDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
