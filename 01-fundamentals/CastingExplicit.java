// this is an example of explicit casting meaning we clearly
// declare the type that we want to convert in our source code

class CastingExplicit {
	public static void main(String[] args) {
		double d = 32.25;
		double dd = 32.99;

		// casting the double d into an int
		int i = (int) d;

		// casting the double dd into an int
		int ii = (int) dd;
		System.out.println(i);
		System.out.println(ii);
	}
}
