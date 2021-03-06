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
		
		// java.lang.ClassCastException: java.lang.StringBuilder cannot be cast to java.lang.String
		// names.add(new StringBuilder("Lolo3")); 
		
		printNames(names);
		
		System.out.println("-------------------");

		List<StringBuilder> names2 = new ArrayList<StringBuilder>();
		names2.add(new StringBuilder("Lolo4")); // OK
	 // names2.add("Lolo5"); // DOES NOT COMPILE
	 // names2.add(new String("Lolo6")); // DOES NOT COMPILE
		System.out.println(names2); // [Lolo4]

		System.out.println("-------------------");
		
		List<StringBuilder> names3 = new ArrayList<>();
		names3.add(new StringBuilder("Lolo7")); // OK
		System.out.println(names3);

	}
}