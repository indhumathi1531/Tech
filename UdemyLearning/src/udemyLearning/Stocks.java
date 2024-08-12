package udemyLearning;

import java.util.Arrays;

public class Stocks {
	public static void main(String[] args) {
		Stocks st = new Stocks();
		int[] arr = new int[] { 1, 3, 4, 5 };
		int[][] ay = st.pairs(arr);
		System.out.println("ay: " + Arrays.deepToString(ay));
		st.reverse(arr);
	}

	int[][] pairs(int[] arr) {
		int n = arr.length;
		int[][] a = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				a[i][j] = arr[i] * 10 + arr[j];
			}

		}
		System.out.println("a: " + Arrays.deepToString(a));
		return a;
	}

	void reverse(int[] arr) {
		int[] ta = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			ta[i] = arr[(arr.length - 1) - i];
			ta[(arr.length - 1) - i] = temp;
		}
		System.out.println(Arrays.toString(ta));
	}
}
