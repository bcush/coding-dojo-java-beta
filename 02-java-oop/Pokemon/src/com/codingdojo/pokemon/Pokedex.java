package com.codingdojo.pokemon;

// [11] we are extending PAbstract - since PAbstract implements the Interface it's going to alarm us
// so we click on 'add unimplemented methods' since it knows we haven't implemented it yet
// [12] create new class called Poketest

public class Pokedex extends PAbstract {

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: " + pokemon.getName() + "Type: " + pokemon.getType() + "Health: " + pokemon.getHealth();
	}

}
