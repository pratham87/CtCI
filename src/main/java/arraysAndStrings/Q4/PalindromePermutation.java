package arraysAndStrings.Q4;

/*
 Question: Check if a string is a permutation of a palindrome. 
 
 Algorithm 1: 
 1. Get the count of every char.
 2. Filter the odd integers and if the count is more than 1, return false.
 
 Algorithm 2: Check for odd occurrences as you parse the string. 
 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PalindromePermutation {

	public static boolean isPalindromeOfPermutation(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
		}

		if (map.values().stream().filter(v -> v % 2 != 0).collect(Collectors.toList()).size() > 1) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindromeOfPermutation("Tact Coa"));
	}

}
