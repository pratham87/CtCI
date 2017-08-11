package arraysAndStrings.Q2;

/*
 Question: Given two strings, find if one string is a permutation of other.
*/

import java.util.Arrays;

public class CheckPermutation {

	public static boolean check(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		char[] sarr = s.toCharArray();
		char[] tarr = t.toCharArray();
		Arrays.sort(sarr);
		Arrays.sort(tarr);
		return String.valueOf(sarr).equals(String.valueOf(tarr));

	}

	public static void main(String[] args) {
		System.out.println(check("dog", "god"));
	}

}
