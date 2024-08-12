package udemyLearning;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String name;
	private int[] marks;

	public Student(String name, int[] listOfMarks) {
		this.name = name;
		this.marks = listOfMarks;

	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks)
			sum += mark;
		return sum;
	}

	public int getNumberOfMarks() {
		int number = marks.length;
		return number;
	}

	public int getMaximumOfMarks() {
		int max = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max)
				max = marks[i];
		}
		return max;
	}

	public int getMinimumOfMakrs() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < min)
				min = marks[i];
		}
		return min;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

}
