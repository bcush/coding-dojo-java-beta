package com.codingdojo.pokemon;

// [12] create some pokemons first
// [13] since pokedex extends the abstract, let's create a new pokedex
// [14] pass p1 (our pokemon) to the pokemonInfo method within pokedex

public class PokeTest {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Pikachu", "Electricity", 100);  // [12]
		Pokemon p2 = new Pokemon("Bulbasaur", "Grass", 90);
		Pokemon p3 = new Pokemon("Raichu", "Electricity", 110);
				
		Pokedex pokedex = new Pokedex();
		System.out.println(pokedex.pokemonInfo(p1));
		pokedex.attackPokemon(p1);
		System.out.println(pokedex.pokemonInfo(p1));
	}

}
