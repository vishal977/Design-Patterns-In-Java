package com.purple.designpatterns.factory;

import java.util.Random;

public class RandomMobSpawner implements MinecraftMobSpawner {
	
	private static String[] mobs = {"Skeleton", "Creeper", "Enderman"};

	@Override
	public MinecraftMob spawnRandomMob() {
		Random random = new Random();
		int randomNumber = random.nextInt(mobs.length);
		switch(randomNumber) {
			case 0:
				return new Skeleton();
			case 1: 
				return new Creeper();
			case 2: return new Enderman();
				
		}
		return null;
	}

}
