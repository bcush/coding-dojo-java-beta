class StringManipulatorTesting {
	public static void main (String[] args) {
		StringManipulator strDemo = new StringManipulator();
		String testStr = "Testing String";
		String testStr2 = "New Stuff";
		System.out.println(strDemo.trimAndConcat(testStr, testStr2)); 
		System.out.println(strDemo.getIndexOrNull(testStr, 'e'));
		System.out.println(strDemo.getIndexOrNull(testStr, "sting"));
		System.out.println(strDemo.concatSubstring("Hello",1,2,"world"));
	}
}
