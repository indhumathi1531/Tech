package udemyLearning;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 98, 97, 100 };
		Student student = new Student("Indhu", marks);
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMarks = student.getMaximumOfMarks();
		int minimumMarks = student.getMinimumOfMakrs();
		BigDecimal average = student.getAverageMarks();
		System.out.printf("%d,%d,%d,%d,%.3f", sum, maximumMarks, minimumMarks, number, average).println();

	}

}
