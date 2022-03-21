package com.purple.designpatterns.factory;

public class DriverCode {

	public static void main(String[] args) {

		RandomMobSpawner randomMobSpawner = new RandomMobSpawner();
		System.out.println("Spawning 10 new random mobs");
		
		for(int i = 0; i < 10; i++) {
			MinecraftMob spawnedMob = randomMobSpawner.spawnRandomMob();
			System.out.println("Spawned new mob - " + spawnedMob.getMobName());
		}
		
	}

}
