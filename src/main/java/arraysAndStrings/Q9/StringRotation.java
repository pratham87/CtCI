package arraysAndStrings.Q9;

/*
 Question: Check if s2 is rotation of s1, using isSubstring method. 
 
 Algorithm:
 1. Using isSubstring, concatenate s1 with s1 and check if s2 is substring of the combined string.
 2. If s2 is rotation of s1 then it will return true else false.
 */

public class StringRotation {

	public static boolean checkRotation(String s1, String s2) {
		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s = s1 + s1;
			return isSubstring(s, s2);
		}
		return false;
	}

	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(checkRotation("waterbottle", "erbottlewat"));

	}

}
