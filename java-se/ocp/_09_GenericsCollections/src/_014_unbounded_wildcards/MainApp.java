package _014_unbounded_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {

		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords); // DOES NOT COMPILE
	}

	public static void printList(List<Object> list) {
		for (Object x : list)
			System.out.println(x);
	}
}