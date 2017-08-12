package arraysAndStrings.Q6;

/*
 Algorithm: Increment the count and check the next char. 
 */

public class StringCompression {

	public static String compress(String s) {
		StringBuilder str = new StringBuilder();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count++;
			if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
				str.append(s.charAt(i));
				str.append(count);
				count = 0;
			}
		}

		return s.length() > str.toString().length() ? str.toString() : s;
	}

	public static void main(String[] args) {
		System.out.println(compress("aaaabbc"));
		System.out.println(compress("abc"));

	}
}
