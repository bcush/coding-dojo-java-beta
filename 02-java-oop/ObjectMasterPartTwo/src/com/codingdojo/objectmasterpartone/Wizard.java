package com.codingdojo.objectmasterpartone;

public class Wizard extends Human {
	public Wizard() {
		setHealth(50);
		intelligence = 8;
	}
	
	public void heal(Human humArg) {
		humArg.setHealth(humArg.getHealth() + intelligence);
	}
	
	public void fireball(Human humArg) {
		humArg.setHealth(humArg.getHealth() - (intelligence * 3));
	}
}
