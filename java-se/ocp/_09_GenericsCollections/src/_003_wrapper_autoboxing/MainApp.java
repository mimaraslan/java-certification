package _003_wrapper_autoboxing;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println(numbers); // []

		numbers.add(1);
		System.out.println(numbers); // [1]

		numbers.add(new Integer(3));
		System.out.println(numbers); // [1, 3]

		numbers.add(new Integer(5));
		System.out.println(numbers); // [1, 3, 5]
		
		numbers.remove(1);
		System.out.println(numbers); // [1, 5]

		numbers.remove(new Integer(5));
		System.out.println(numbers); // [1]
		
		//  wrapper classes to primitives via unboxing
		int num = numbers.get(0);
		System.out.println(num); // 1

	}
}