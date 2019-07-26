package _014_unbounded_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MainApp2 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(new Integer(42));

		List<Object> objects = numbers; // DOES NOT COMPILE
		objects.add("forty two");
		System.out.println(numbers.get(1));
	}
}