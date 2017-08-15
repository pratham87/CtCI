package sortAndSearch.Q1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedMerge {

	public static void merge(int[] a, int[] b, int lastA, int lastB) {
		int x = lastA - 1, y = lastB - 1;
		int mergedIndex = lastA + lastB - 1;

		while (y >= 0) {
			if (x >= 0 && a[x] > b[y]) {
				a[mergedIndex] = a[x--];
			} else {
				a[mergedIndex] = b[y--];
			}
			mergedIndex--;
		}

	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0 };
		int[] b = { 1, 4, 7, 6, 7, 7 };
		merge(a, b, 8, 6);
		Arrays.stream(a).boxed().collect(Collectors.toList()).forEach(e -> System.out.print(e + " "));
	}

}
