package com.codingdojo.objectmasterpartone;

public class Samurai extends Human {
	public Samurai() {
		setHealth(200);
	}
	
	public void deathBlow(Human humanArg) {
		humanArg.setHealth(0);
		setHealth(getHealth() / 2);
	}
	
	public void meditate() {
		setHealth(getHealth() + (getHealth() / 2));
	}
}
