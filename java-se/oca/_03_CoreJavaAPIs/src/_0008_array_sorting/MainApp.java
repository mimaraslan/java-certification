package _0008_array_sorting;

import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {

		int[] numbers = { 1, 9, 7, 2, 8, 3, 6, 5, 4};
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) 
			System.out.print (numbers[i] + " ");


		System.out.println("---------------");

		String[] strings = { "10", "9", "11100", "20" , "1300", "50", "510", "110", "99" }; 
		Arrays.sort(strings);
		for (String string : strings)
		System.out.print(string + " ");
		
	}
}