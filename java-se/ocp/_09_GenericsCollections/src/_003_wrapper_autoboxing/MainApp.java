package _003_wrapper_autoboxing;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println(numbers); // []
		
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		// System.out.println(numbers.get(0)); 
		
		numbers.add(1);
		System.out.println(numbers); // [1]
		System.out.println(numbers.get(0)); // 1

		numbers.add(new Integer(3));
		System.out.println(numbers); // [1, 3]
		System.out.println(numbers.get(0) + ", " + numbers.get(1)); // 1, 3

		int i = 5;
		numbers.add(i); 			 // index    0  1  2
		System.out.println(numbers); //         [1, 3, 5]
		System.out.println(numbers.get(0) + ", " + numbers.get(1) + ", " + numbers.get(2)); // 1, 3, 5

		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 99, Size: 3
		// System.out.println(numbers.get(99)); 
		
		// index [0] --> 1
		// index [1] --> 3
		// index [2] --> 5
		numbers.remove(1);  // index [1] -->   3       
		System.out.println(numbers); //   [1,      5]

		numbers.remove(new Integer(44));
		System.out.println(numbers); // [1, 5]
		
		numbers.remove(new Integer(5));
		System.out.println(numbers); // [1]
		
		//  wrapper classes to primitives via unboxing
		int num = numbers.get(0);
		System.out.println(num); // 1
	}
}