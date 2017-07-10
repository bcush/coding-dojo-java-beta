package com.codingdojo.objectmasterpartone;

public class Human {
	int strength;
	int stealth;
	int intelligence;
	int health;
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	public void attack(Human humArg) {
		System.out.println("You are attacking the human!");
		humArg.setHealth(humArg.getHealth() - this.strength);		
	}

}
