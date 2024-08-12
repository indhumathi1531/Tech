package udemyLearning;

public class DaysOfWeek {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday     ", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		for (String week : daysOfWeek)
			System.out.println(week);

		String longOccurenceWord = "";
		for (String day : daysOfWeek)
			if (day.length() > longOccurenceWord.length())
				longOccurenceWord = day;

		System.out.println("longOccurenceDay: " + longOccurenceWord);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

}
