package com.briancushman.web.models;

public class CatModel extends Animal implements Pet {

	public CatModel(String name, String breed, double weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		return "Looked at you with some affection.";
	}

}
