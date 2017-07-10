package com.codingdojo.pokemon;

// [9] define createPokemon - which will return (of type) Pokemon - remember it's just stating not defining
// [10] create your abstract class now - new Abstract class, select 'abstract' under class, call it PAbstract
//      what does this PAbstract do? It's implements our interface - or in other words - PAbstract implements PInterface

public interface PInterface {
	Pokemon createPokemon (String name, String type, int health);  // [9]
	void attackPokemon(Pokemon pokemon);
	String pokemonInfo(Pokemon pokemon);
}
