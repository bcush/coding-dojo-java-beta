package com.briancushman.web.models;

public class DogModel extends Animal implements Pet {

	public DogModel(String name, String breed, double weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		String s;
		
		if (getWeight() < 30) {
			s = "Hopped into your lap and cuddled you.";
		} else
		{
			s = "Curled up next to you.";
		}
		
		return s;
	}

}
