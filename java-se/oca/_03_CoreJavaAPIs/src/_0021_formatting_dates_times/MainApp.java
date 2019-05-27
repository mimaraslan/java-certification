package _0021_formatting_dates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainApp {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(23, 59, 59);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		System.out.println(date.getDayOfWeek()); // MONDAY
		System.out.println(date.getMonth()); // JANUARY
		System.out.println(date.getYear()); // 2020
		System.out.println(date.getDayOfYear()); // 20

		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2020-01-20
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 23:59:59
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2020-01-20T23:59:59

		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime)); // 1/20/20
		System.out.println(shortDateTime.format(date)); // 1/20/20
		System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeExceptionF
	}
}