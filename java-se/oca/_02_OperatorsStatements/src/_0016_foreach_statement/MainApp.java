package _0016_foreach_statement;

public class MainApp {

	public static void main(String[] args) {

		// for(dataType instance : collection) { }

		final String[] names = new String[3];
		names[0] = "A";
		names[1] = "B";
		names[2] = "C";
		for (String name : names) {
			System.out.print(name + ", ");
		}

		System.out.println("\n-------------");

		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("A");
		values.add("B");
		values.add("C");
		for (String value : values) {
			System.out.print(value + ", ");
		}

		System.out.println("\n-------------");

		String names2 = "Lisa";
		for (String name : names2) { // DOES NOT COMPILE
			System.out.print(name + " ");
		}

		String[] names3 = new String[3];
		for (int name : names3) { // DOES NOT COMPILE 
			System.out.print(name + " ");
		}

	}
}