package com.codingdojo.zookeeperpartone;

public class Dragon extends Mammal {
	
	public Dragon() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("What's that sounds? It's a dragon! He's flying!");
		energyLevel = energyLevel - 50;
	}
	
	public void eatHumans() {
		energyLevel = energyLevel + 25;
	}
	
	public void attackTown() {
		System.out.println("Oh my god, it's the sound of fire! The dragon is attacked!");
		energyLevel = energyLevel - 100;
	}

}
