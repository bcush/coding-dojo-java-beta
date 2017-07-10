package com.codingdojo.pokemon;

// [1] create pokemon class
// [2] create member variables
// [3] create getters/setters for member variables (cmd-opt-s)
// [4] create constructor for class (cmd-opt-s - no super class, remove super() )
// [5] create count variable to track number of pokemons created (private static because it belongs to the class)
// [6] create getters and setters for count (cmd-opt-s)
// [7] increment count in constructor that updates with each new pokemon (use setter)
// [8] create interface (just like creating a class, call it PInterface)


public class Pokemon {    // [1]
	private String name;  // [2]
	private int health;
	private String type;
	
	private static int count;  // [5]
	
	public Pokemon(String name, String type, int health) {  // [4]
		this.name = name;
		this.health = health;
		this.type = type;
		setCount(getCount() + 1);  // [7]
	}
	
	public String getName() {  // [3]
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public static int getCount() {  // [6]
		return count;
	}

	public static void setCount(int count) {
		Pokemon.count = count;
	}
}
