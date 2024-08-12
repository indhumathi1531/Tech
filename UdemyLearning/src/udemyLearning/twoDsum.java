package udemyLearning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class twoDsum {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String str = sdf.format(new Date());

		System.out.println("date_time: " + str);

		Date date = sdf.parse(str);
		System.out.println("date_time: " + sdf.format(new Date()));
		System.out.println((sdf.format(new Date())).getClass().getSimpleName());
	}

}
