import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class PuzzleJava {
	public static ArrayList<Integer> greaterThan10(int[] args) {
		ArrayList<Integer> myArray = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			sum = sum + args[i];
			if (args[i] > 10) {
				myArray.add(args[i]);
			}
		}
		System.out.println(sum);
		return myArray;
	}

	public static ArrayList<String> shuffleThen5(String[] args) {
		ArrayList<String> myArray = new ArrayList<>();
//		System.out.println(Collections.shuffle());

		for (int i = 0; i < args.length; i++) {
			if (args[i].length() > 10) {
				myArray.add(args[i]);
			}
		}
		return myArray;
	}



	public static void main(String[] args) {
		int[] testArray = {3,5,1,2,7,9,8,13,25,32};
		String[] shuffleArray = {"Nancy", "Jinchi", "Fujibayashi", "Momochi", "Ishikawa"};
		System.out.println(greaterThan10(testArray));
		System.out.println(shuffleThen5(shuffleArray));
	}
}
