package _0016_list_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(99);
		numbers.add(5);
		numbers.add(81); 
		Collections.sort(numbers); 
		System.out.println(numbers); //[5, 81, 99]
	}
}
