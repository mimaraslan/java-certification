package _0019_dates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class MainApp {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time)
		.minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime); // 2020-01-18T19:14:30
		
	}
}