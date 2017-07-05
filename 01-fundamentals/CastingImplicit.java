// in this example we demonstrate implicit casting
// we create an int, set a float to equal the value of the int
// and then we cast the float to a string for concatenation
// ** java will allow implicit conversions as long as the
// target type has a range large enough for the conversion **


class CastingImplicit {
	public static void main(String[] args) {
		int i = 35;
		float f = i;
		System.out.println("The number is: " + f);
	}
}
