package _005_generics;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	static void printNames(List list) {
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i); // class cast exception here
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Lolo1"); // OK
		names.add(new String("Lolo2")); // OK
		names.add(new StringBuilder("Lolo3")); // ClassCastException
		printNames(names);
		
		List<String> names2 = new ArrayList<String>();
		names2.add(new StringBuilder("Lolo4")); // DOES NOT COMPILE
	}
}