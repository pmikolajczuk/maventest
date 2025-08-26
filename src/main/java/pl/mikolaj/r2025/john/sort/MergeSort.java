package pl.mikolaj.r2025.john.sort;

import java.util.Arrays;

public class MergeSort {
	public static void sort(int[] numbers) {
		sort(numbers, 0, numbers.length - 1);
	}

	private static void sort(int[] numbers, int first, int last) {
		SortingUtils.printArray(numbers, first, last);
		if (first == last) {
			return;
		}

		int mid = (first + last) / 2;
		sort(numbers, first, mid);
		sort(numbers, mid + 1, last);
		merge(numbers, first, last);

	}

	private static void merge(int[] numbers, int first, int last) {
		//int[] result = new int[];
	}
}
