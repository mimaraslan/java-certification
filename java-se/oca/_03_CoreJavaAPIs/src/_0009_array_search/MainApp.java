package _0009_array_search;

import java.util.Arrays;

class MainApp {

	public static void main(String[] args) {
		
		int[] numbers = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0 
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1 
		System.out.println(Arrays.binarySearch(numbers, 1)); // -1 
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2 
		System.out.println(Arrays.binarySearch(numbers, 9)); // -5
		
		System.out.println("---------------"); 
		
		int numbers2 = new int[] {3,2,1}; // DOES NOT COMPILE
		System.out.println(Arrays.binarySearch(numbers2, 2));  
		System.out.println(Arrays.binarySearch(numbers2, 3));
		
		
	}
}