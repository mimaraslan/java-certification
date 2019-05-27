package _0020_periods;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class MainApp {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

		System.out.println(" plusMonths");
		performAnimalEnrichment(start, end);
		System.out.println("------------------------");

		System.out.println(" Period.ofMonths plus");
		Period period = Period.ofMonths(1); // create a period
		
				
		performAnimalEnrichmentPeriod(start, end, period);
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1); // add a month
		}
	}

	private static void performAnimalEnrichmentPeriod(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); // adds the period
		}
	}
	
}