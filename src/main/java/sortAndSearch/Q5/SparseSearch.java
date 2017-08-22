package sortAndSearch.Q5;

/*
 Question: Given a sorted array of strings interspersed with empty strings, write a algorithn to find the location of a string.
 
 Algorithm:
 1. Do Binary search using compareTo method. 
 2. If mid == empty string, use two pointers to find a non empty string and point mid to that index.
 */

public class SparseSearch {

	public static int searchWord(String word, String[] words) {
		int left = 0, right = words.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (words[mid].isEmpty()) {
				int prev = mid - 1, next = mid + 1;
				while (prev >= left && next <= right) {
					if (!words[prev].isEmpty()) {
						mid = prev;
						break;
					} else if (!words[next].isEmpty()) {
						mid = next;
						break;
					}
					prev--;
					next++;
				}
			}

			if (words[mid].equals(word)) {
				return mid;
			} else if (words[mid].compareTo(word) < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		String[] words = { "at", "", "", "ball", "", "", "car" };
		System.out.println(searchWord("ball", words));

	}

}
