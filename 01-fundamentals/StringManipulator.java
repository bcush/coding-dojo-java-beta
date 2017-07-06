class StringManipulator {
	// trim both input strings and then concatenate them; return new string
	public String trimAndConcat(String strArg1, String strArg2) {
		String trimConcatOutput = strArg1.trim();
		trimConcatOutput = trimConcatOutput.concat(strArg2.trim());
		return trimConcatOutput; 
	}

	// get the index of the character and return either the index or null
	public String getIndexOrNull(String strArg1, char chrArg1) {
		if (strArg1.indexOf(chrArg1) != -1) {
			String numberAsString = String.valueOf((strArg1.indexOf(chrArg1)));
			return numberAsString;
		}
		return null;
	}

	// get the index of the start of the substring and return either the index or null
	public String getIndexOrNull(String strArg1, String strArg2) {
		if (strArg1.lastIndexOf(strArg2) != -1) {
			String numberAsString = String.valueOf(strArg1.lastIndexOf(strArg2));
			return numberAsString; 
		}
		return null;	
	}

	// get a substring using a starting and ending index, and concat that with the second
	// string input to our method; e.g. an input of ("Hello",1,2,"world") would get the
	// substring of "e" and then concatenate it with "world" to return `eworld`.
	public String concatSubstring(String strArg1, int intArg1, int intArg2, String strArg2) {
		String finalString = strArg1.substring(intArg1, intArg2);
		finalString = finalString.concat(strArg2);
		return finalString;
	}

	// create a `StringManipulatorTest` to test all these methods

}
