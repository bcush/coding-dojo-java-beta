/* 1. create a pythagorean class in javaFun
 * 2. use a method from Math class to calculate the hypotenuse of a
 * 	triangle given the values of the two legs.
 * 	hint: use the static `sqrt` method. static means the method
 * 	belongs to a class instead of an object.
 * 3. create a pythagoreantest file that will instantiate a new
 * pythagorean object and call the `calculateHypotenuse` method.
 */

import java.lang.Math;
class Pythagorean {
	public double calculateHypotenuse(int legA, int legB) {
		// the hypotenuse is the side across the right angle.
		// calculate the value of c given legA and legB
		int legASquared = (legA * legA);
		int legBSquared = (legB * legB);
		return Math.sqrt(legASquared + legBSquared);
	}
}
