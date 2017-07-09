package com.codingdojo.zookeeperpartone;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println("Energy level is: " + energyLevel);
		return this.energyLevel;
	}
}
