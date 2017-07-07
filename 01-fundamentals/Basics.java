class Basics {
	// write a method that prints all the numbers from 1 to 255
	public static void printTo255() {
		System.out.println("\nPrint all the numbers from 1 to 255:");
		for (int i = 0; i <= 255; i++) {
			System.out.println(i);
		}
	}

	// print odd numbers between 1-255
	public static void printOddTo255() {
		System.out.println("\nPrint odd numbers 1-255:");
		for (int i = 0; i <= 255; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
	}

	// print sum
	public static void printSum() {
		System.out.println("\nPrint the sum:");
		int sum = 0;
		for (int i = 0; i <= 255; i++) {
			System.out.println("New number: " + i + " Sum: " + sum + " ");
			sum = sum + i;
		}
	}

	// iterating through an array
	public static void iterateArray() {
		System.out.println("\nIterating through an array:");
		int[] myArray = {1,3,5,7,9,13};
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	// find max
	public static int findMax(int[] args) {
		System.out.println("\nFind max:");
		int max = 0;
		for (int i = 0; i < args.length; i++) {
			if (max < args[i]) {
				max = args[i];
			}
		}
		System.out.println(max);
		return max;
	}


	// get average
	public static int getAverage(int[] args) {
		System.out.println("\nGet average:");
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + args[i];
		}
		System.out.println(sum / args.length);
		return (sum / args.length);
	}


	// greater than y
	public static void greaterThanY(int[] args, int y) {
		System.out.println("\nGreater than Y:");
		for (int i = 0; i < args.length; i++) {
			if (args[i] > y) {
				System.out.println(args[i]);
			}
		}
	}

	// eliminate negative numbers
	public static void eliminateNegativeNumbers() {
		System.out.println("\nEliminate negaives: ");
		int sampleArray[] = {1,5,10,-2};
		for (int i = 0; i < sampleArray.length; i++) {
			if (sampleArray[i] < 0) {
				sampleArray[i] = 0;
			}
			System.out.println(sampleArray[i]);
		}
	}

	// square the values
	public static void squareTheValues() {
		System.out.println("\nSquare the values:");
		int x[] = {1,5,10,-2};
		for (int i = 0; i < x.length; i++) {
			x[i] = x[i] * x[i];
		}


		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}


	// max, min, and average
	public static void minMaxAverage() {
		int x[] = {1,5,10,-2};

		int min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] < min) {
				min = x[i];			
			}
		int results[] = {findMax(x), min, getAverage(x)};
		
		for (int z = 0; z < results.length; z++) {
			System.out.println(results[z]);
		}

		}
	}

	// shift right
	public static void shiftRight() {
		int shiftArray[] = {1,5,10,7,-2};
		System.out.println("Shift array: ");
		int lastInt = shiftArray[shiftArray.length-1];
		for (int i = shiftArray.length - 1; i > 0; i--) {
			shiftArray[i] = shiftArray[i - 1];
		}
		shiftArray[0] = lastInt;
		
		for (int i = 0; i < shiftArray.length; i++) {
			System.out.println(shiftArray[i]);
		}
		
	}

	public static void main(String[] args) {
		int[] testArray = {1, 2, 3, 4, 5, 6, 55};
		printTo255();
		printOddTo255();
		printSum();
		iterateArray();
		findMax(testArray);
		getAverage(testArray);
		greaterThanY(testArray, 4);
		eliminateNegativeNumbers();
		squareTheValues();
		minMaxAverage();
		shiftRight();
	}
}
