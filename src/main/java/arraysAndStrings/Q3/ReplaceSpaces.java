package arraysAndStrings.Q3;

/*
 Question: Write a method to replace all spaces in a string with ‘%20’.
*/

public class ReplaceSpaces {

	public static void replaceSpaces(String s) {
		String[] words = s.split(" ");

		StringBuilder sentence = new StringBuilder(words[0]);

		for (int i = 1; i < words.length; ++i) {
			sentence.append("%20");
			sentence.append(words[i]);
		}

		System.out.println(sentence.toString());
	}

	public static void replace(String str) {
		System.out.println(str.replaceAll(" ", "%20"));
	}

	public static void main(String[] args) {
		replaceSpaces("hello there");
		replace("hello there");
	}

}
