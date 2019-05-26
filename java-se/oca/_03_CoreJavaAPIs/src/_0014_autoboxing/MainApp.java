package _0014_autoboxing;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List<Double> weights = new ArrayList<>();

		weights.add(50.5); // [50.5]
		System.out.println(weights);

		weights.add(new Double(60)); // [50.5, 60.0]
		System.out.println(weights);

		weights.remove(50.5); // [60.0]
		System.out.println(weights);

		double first = weights.get(0); // 60.0
		System.out.println(first);
		
		System.out.println("---------------"); 

		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		//int h = heights.get(0); // NullPointerException
		System.out.println(heights);

		System.out.println("---------------"); 

		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);  //numbers.remove(new Integer(1))
		System.out.println(numbers);
		
	}
}
