package arraysAndStrings.Q5;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 Question: There are 3 types of edit: insert, remove, replace.
 	Given 2 strings, check if they are 1 edit away.
 	
 Algorithm:
 1. Use HashMap to get the count for all chars in the first string.
 2. Deduct the count by 1 for chars in second string. 
 2. If there are more than 1 non zero values in map, return false.
 */

public class OneEditAway {

	public static boolean getDiff(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
		}

		for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
			} else {
				map.put(t.charAt(i), 0);
			}
		}

		if (map.values().stream().filter(v -> v != 0).collect(Collectors.toList()).size() > 1) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(getDiff("pale", "ple"));
		System.out.println(getDiff("pales", "pale"));
		System.out.println(getDiff("pale", "bale"));
		System.out.println(getDiff("pale", "bae"));
	}

}
