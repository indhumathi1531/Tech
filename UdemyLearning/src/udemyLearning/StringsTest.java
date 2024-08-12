package udemyLearning;

import java.util.Scanner;

public class StringsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a string: ");
		String str = sc.nextLine();
		System.out.println(str);
		int len = str.length();
		for (int i = 0; i < len; i++) {
			System.out.println(str.charAt(i));

		}

	}

}
