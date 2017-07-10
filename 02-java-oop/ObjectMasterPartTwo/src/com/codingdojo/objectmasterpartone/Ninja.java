package com.codingdojo.objectmasterpartone;

public class Ninja extends Human {
	public Ninja() {
		stealth = 10;
	}
	
	public int getStealth() {
		return stealth;
	}
	
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public void steal (Human humArg) {
		humArg.setHealth(humArg.getHealth() - stealth);
		stealth += stealth;
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}

}
