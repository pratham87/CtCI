package arraysAndStrings.Q1;

/*
 Questions: Implement an algorithm to determine if a string has all unique characters. 
 			What if you can not use additional data structures? 
*/

public class FindUniqueCharacterStringUsing2Pointer {

	public static boolean unique(String str) {
		int i = 0;

		while (i < str.length() - 1) {
			int j = str.length() - 1;
			while (i < j) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				} else {
					j--;
				}
			}
			i++;
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "abB";

		System.out.println(unique(str));

	}

}
