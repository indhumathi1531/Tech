package udemyLearning;

public class Permutation {

	static String getNumericString(int n) {

		String NumericString = "0123456789";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {

			int index = (int) (NumericString.length() * Math.random());

			sb.append(NumericString.charAt(index));
		}

		return sb.toString();
	}

	static String getAlphaString(int n) {

		String AlphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			int index = (int) (AlphaString.length() * Math.random());

			sb.append(AlphaString.charAt(index));
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		int n = 3;

		System.out.println("A" + Permutation.getNumericString(3) + "U" + Permutation.getNumericString(4)
				+ Permutation.getAlphaString(n));
		System.out.println("A" + Permutation.getNumericString(3) + "D" + Permutation.getNumericString(4)
				+ Permutation.getAlphaString(n));
		System.out.println("F" + Permutation.getNumericString(3) + "D" + Permutation.getNumericString(4)
				+ Permutation.getAlphaString(n));
		System.out.println("F" + Permutation.getNumericString(3) + "U" + Permutation.getNumericString(4)
				+ Permutation.getAlphaString(n));

	}
}
