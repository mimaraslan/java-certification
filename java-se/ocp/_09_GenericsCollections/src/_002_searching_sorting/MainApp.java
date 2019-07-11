package _002_searching_sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
				  // index 0  1  2  3  4  5  6  7  8  9
		int[] numbers = {  6, 9, 1, 8, 6, 6, 2, 4, 5, 4  };
		Arrays.sort(numbers);  
		
		for (int i = 0; i < numbers.length; i++)
		System.out.print(numbers[i]+", ");     
		// index 0  1  2  3  4  5  6  [7]  8  9
		// 		 1, 2, 4, 4, 5, 6, 6,  6,  8, 9, 
		
		System.out.println();
		
		// binarySearch - prints the index at which a match is found
		System.out.println(Arrays.binarySearch(numbers, 6)); // 7  
		System.out.println(Arrays.binarySearch(numbers, 3)); // -3
		
		System.out.println("------------------------");
		
		List<Integer> list = Arrays.asList(9, 7, 5, 3);
		Collections.sort(list); 
		System.out.println(list); // [3, 5, 7, 9]
		System.out.println(Collections.binarySearch(list, 3)); // 0
		System.out.println(Collections.binarySearch(list, 2)); // -1
	}
}