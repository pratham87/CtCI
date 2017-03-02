package arraysAndStrings.Q3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingHashSet {

	public static void remove(String s) {

		char[] chars = s.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		remove("aabbccddeef");
	}

}
