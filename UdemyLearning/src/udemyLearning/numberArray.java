package udemyLearning;

import java.util.Arrays;

public class numberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		int[] newarr = new int[(arr.length) - 2];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = arr[i + 1];
		}
		System.out.println(Arrays.toString(newarr));
	}

}
