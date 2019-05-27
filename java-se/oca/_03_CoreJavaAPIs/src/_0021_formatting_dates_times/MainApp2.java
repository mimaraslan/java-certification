package _0021_formatting_dates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainApp2 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
		System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM

		System.out.println("----------------------");

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(dateTimeFormatter)); // January 20, 2020, 11:12
				
		System.out.println("----------------------");

		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
		// System.out.println(f.format(dateTime));
		// System.out.println(f.format(date));
		System.out.println(f.format(time));

	}
}