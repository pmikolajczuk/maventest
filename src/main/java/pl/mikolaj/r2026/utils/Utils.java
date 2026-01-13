package pl.mikolaj.r2026.utils;

import java.util.stream.IntStream;

public class Utils {
	public static String intArrayToString(int[] input) {
		Integer[] boxed = IntStream.of(input).boxed().toArray(Integer[]::new);
		return arrayToString(boxed);
	}

	public static <T> String arrayToString(T[] input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length; i++) {
			sb.append(input[i]);
			if (i < input.length - 1) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}
}
