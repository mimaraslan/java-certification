package _013_bounds_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {

		// Unbounded wildcard
		// ?
		List<?> myList1 = new ArrayList<String>();

		// Wildcard with an upper bound
		// ? extends type
		List<? extends Exception> myList2 = new ArrayList<RuntimeException>();

		// Wildcard with a lower bound
		// ? super type
		List<? super Exception> myList3 = new ArrayList<Object>();

	}

}
