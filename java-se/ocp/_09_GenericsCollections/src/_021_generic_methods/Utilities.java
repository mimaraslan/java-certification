package _021_generic_methods;

import java.util.List;
import java.util.ArrayList;

public class Utilities {
	
	public static <T> void fill(List<T> list, T val) {
		for (int i = 0; i < list.size(); i++)
			list.set(i, val);
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		System.out.println("The original list is: " + intList);

		Utilities.fill(intList, 3333);
		System.out.println("The list after calling Utilities.fill() is: " + intList);
	}
}