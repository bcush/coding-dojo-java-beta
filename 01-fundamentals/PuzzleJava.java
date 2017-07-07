import java.util.ArrayList;

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

	public static void main(String[] args) {
		int[] testArray = {3,5,1,2,7,9,8,13,25,32};
		greaterThan10(testArray);
	}
}
