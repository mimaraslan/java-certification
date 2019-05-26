package _0017_dates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class MainApp {
	public static void main(String[] args) {
		
		System.out.println(" now()"); 
		System.out.println("LocalDate: "+LocalDate.now()); 
		System.out.println("LocalTime: "+LocalTime.now()); 
		System.out.println("LocalDateTime: "+LocalDateTime.now());
		
		System.out.println("---------------"); 
		System.out.println("\n LocalDate"); 
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); 
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println("---------------"); 
		System.out.println("\n LocalTime"); 
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
		System.out.println("---------------"); 
		System.out.println("\n LocalDateTime");
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30); 
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		
		// LocalDate d = new LocalDate(); // DOES NOT COMPILE
		// LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException

		
	}
}