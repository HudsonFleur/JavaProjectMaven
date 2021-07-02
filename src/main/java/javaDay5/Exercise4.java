package javaDay5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java Day 5 Exercise 4
public class Exercise4 {

	public int birthdayCakeCandles(List<Integer> candles) {
		int count = 0;

		Integer[] arr = new Integer[candles.size()];
		arr = candles.toArray(arr);

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[arr.length - 1] == arr[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Exercise4 e4 = new Exercise4();

		List<Integer> intList = new ArrayList<Integer>();

		intList.add(4);
		intList.add(4);
		intList.add(1);
		intList.add(3);

		System.out.println(e4.birthdayCakeCandles(intList));
	}
}
