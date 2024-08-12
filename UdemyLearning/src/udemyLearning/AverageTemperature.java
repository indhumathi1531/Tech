package udemyLearning;

import java.util.Arrays;
import java.util.Scanner;

public class AverageTemperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many days? ");
		int days = sc.nextInt();
		int sum = 0;
		int[] temp = new int[days];
		for (int i = 0; i < days; i++) {
			System.out.println("Day " + i + " temperture :");
			temp[i] = sc.nextInt();
			sum += temp[i];
		}
		System.out.println(Arrays.toString(temp));
		double avg = sum / days;
		System.out.println("Avergae Temperature is: " + avg);

	}

}
