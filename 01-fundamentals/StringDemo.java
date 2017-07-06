public class StringDemo {
	public static void main(String[] args) {
		// demonstrate the length method	
		String ninja = "Coding Dojo is Awesome!";
		int length = ninja.length();
		System.out.println("String length is: " + length);
		// demonstrate the concatenate method
		String string1 = "My name is ";
		String string2 = "Michael";
		String string3 = string1.concat(string2);
		System.out.println(string3);
		// demonstrate the format method
		String ninja2 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.);
		System.out.println(ninja2);
		// will print out Hi Jack, you owe me $25.00 !
		// where %s is expecting a string
		// and %.2f is expecting a float data type
		// the value 2 will just place two values to the right
		// of the decimal point

		// demonstrate indexOf()
		String ninja3 = "Welcome to Coding Dojo!";
		int a = ninja3.indexOf("Coding"); // a is 11
		int b = ninja3.indexOf("co"); // b is 3
		int c = ninja3.indexOf("pizza"); // c is -1; not found
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	
	}
}
