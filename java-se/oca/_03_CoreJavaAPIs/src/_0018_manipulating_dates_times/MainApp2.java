package _0018_manipulating_dates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class MainApp2 {
	public static void main(String[] args) {

		System.out.println(" of");
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime); // 2020-01-20T05:15
		System.out.println("------------------");
		
		System.out.println(" minusDays");
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19T05:15
		System.out.println("------------------");
		
		System.out.println(" minusHours");
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18T19:15
		System.out.println("------------------");
		
		System.out.println(" minusSeconds");
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020-01-18T19:14:30
		System.out.println("------------------");
		
		System.out.println(" plusDays");
		dateTime = dateTime.plusDays(2);
		System.out.println(dateTime); // 2020-01-20T19:14:30
		System.out.println("------------------");
		
		System.out.println(" plusWeeks");
		dateTime = dateTime.plusWeeks(1);
		System.out.println(dateTime); // 2020-01-27T19:14:30
		System.out.println("------------------");
		
		System.out.println(" plusMonths");
		dateTime = dateTime.plusMonths(1);
		System.out.println(dateTime); // 2020-02-27T19:14:30
		System.out.println("------------------");
		
		System.out.println(" plusYears");
		dateTime = dateTime.plusYears(5);
		System.out.println(dateTime); // 2025-02-27T19:14:30
	}
}