package pl.mikolaj.r2025.john.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;

class SortTest {

	@Test
	void bubbleSort() {
		processSortingMethod(BubbleSort::sort);
	}

	@Test
	void insertionSort() {
		processSortingMethod(InsertionSort::sort);
	}

	@Test
	void selectionSort() {
		processSortingMethod(SelectionSort::sort);
	}

	void processSortingMethod(Consumer<int[]> method) {
		//int[] numbers = new int[]{3,1,8,6,2};
		int[] numbers = generateArray();
		printArray(numbers);
		System.out.println("Sorted: " + isSorted(numbers));
		method.accept(numbers);
		printArray(numbers);
		System.out.println("Sorted: " + isSorted(numbers));

	}

	private int[] generateArray() {
		Random rand = new Random();
		int[] numbers = new int[10];

		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10);
		}
		return numbers;
	}

	private boolean isSorted(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i+1] < numbers[i]) {
				return false;
			}
		}
		return true;
	}

	private void printArray(int[] numbers) {
		Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
		System.out.println();
	}
}