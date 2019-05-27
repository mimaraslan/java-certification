package _0019_dates_times;

import java.time.LocalDate;
import java.time.Month;

public class MainApp2 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		date.plusDays(10);
		System.out.println(date);
		
		
		
	}
}