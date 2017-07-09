package com.codingdojo.zookeeperpartone;

public class Gorilla extends Mammal {
	public void throwBanana() {
		System.out.println("The gorilla has thrown something! Watch out!");
		this.energyLevel = this.energyLevel - 5;
	}
	
	public void eatBananas() {
		System.out.println("The gorrila has eaten a banana. He is happy!");
		this.energyLevel = this.energyLevel + 10;
	}
	
	public void climb() {
		System.out.println("Check out that gorilla climb the tree. Whoa!");
		this.energyLevel = this.energyLevel - 10;
	}

}
