package com.codingdojo.pokemon;

// [10 - cont'd] PAbstract implements our inteface (PInterface)
// if this was a regular class, we would have issues, saying that we must implement are methods from interface
// but since it's an abstract, we don't HAVE to, but we can if we want
// just implement: createPokemon and attackPokemon per assignment
// [11] create a new class called Pokedex that extends the abstract class and implements pokemonInfo(Pokemon pokemon)

public abstract class PAbstract implements PInterface {
	@Override  // annotation used when overriding a method from an interface - you don't have to (annotations come from javadocs)
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);  // this is returning a new Pokemon object
	}
	
	@Override
	public void attackPokemon(Pokemon p) {
		int currentHealth = p.getHealth() - 10;
		p.setHealth(currentHealth);
	}
}
