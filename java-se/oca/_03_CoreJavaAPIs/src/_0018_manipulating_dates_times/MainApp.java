package _0018_manipulating_dates_times;

import java.time.LocalDate;
import java.time.Month;

public class MainApp {
	public static void main(String[] args) {

		System.out.println(" of");
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		System.out.println("------------------");

		System.out.println(" plusDays");
		date = date.plusDays(4);
		System.out.println(date); // 2014-01-24
		
		date = date.plusDays(-2);
		System.out.println(date); // 2014-01-22
		
		System.out.println("------------------");
		
		System.out.println(" plusDays");
		date = date.plusWeeks(2);
		System.out.println(date); // 2014-02-05
		
		date = date.plusWeeks(-1);
		System.out.println(date); // 2014-01-29
			
		System.out.println("------------------");
		
		System.out.println(" plusMonths");
		date = date.plusMonths(2);
		System.out.println(date); // 2014-03-29
		
		date = date.plusMonths(-1);
		System.out.println(date); // 2014-02-28
		
		System.out.println("------------------");
		
		System.out.println(" plusYears");
		date = date.plusYears(10);
		System.out.println(date); // 2019-02-28
	
		date = date.plusYears(-5);
		System.out.println(date); // 2019-02-28
		
	}
}