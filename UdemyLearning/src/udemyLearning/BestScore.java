package udemyLearning;

import java.util.Arrays;

public class BestScore {
	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 2, 2, 4, 3, 1, 4 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] < first) {
				second = arr[i];
			}
		}
		int[] score = new int[] { first, second };
		System.out.println(Arrays.toString(score));
	}

}
