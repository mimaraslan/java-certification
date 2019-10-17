package _0016_foreach_statement;

import java.util.Iterator;

public class MainApp2 {

	public static void main(String[] args) {

		final String[] names = new String[3];
		names[0] = "A";
		names[1] = "B";
		names[2] = "C";

		for (String name : names) {
			System.out.print(name + ", ");
		}

		System.out.println("\n-------------");

		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			System.out.print(name + ", ");
		}

		System.out.println("\n-------------------------------------");

		
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("D");
		values.add("E");
		values.add("F");

		for (String value : values) {
			System.out.print(value + ", ");
		}
		
		System.out.println("\n-------------");

		
		for (Iterator<String> i = values.iterator(); i.hasNext();) { // DOES NOT COMPILE
			String value = i.next();
			System.out.print(value + ", ");
		}
		
		System.out.println("\n-------------");


//		for (int value : values) { // DOES NOT COMPILE
//			System.out.print(value + ", ");
//		}
//
//		System.out.println("\n-------------");
//
//		for (java.util.Iterator<Integer> i = values.iterator(); i.hasNext();) { // DOES NOT COMPILE
//			int value = i.next();
//			System.out.print(value + ", ");
//		}


		java.util.List<String> names2 = new java.util.ArrayList<String>();
		names2.add("G");
		names2.add("H");
		names2.add("I");

		for (int i = 0; i < names2.size(); i++) {
			String name = names2.get(i);
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(name);
		}

		System.out.println("\n-------------");

		int[] values2 = new int[3];
		values2[0] = 10;
		values2[1] = new Integer(5);
		values2[2] = 15;
		
		for (int i = 1; i < values2.length; i++) {
			if (i > 1) {
				System.out.print(", ");
			}
			System.out.print(values2[i] - values2[i - 1]);
		}

	}
}