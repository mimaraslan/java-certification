package _004_diamond_operator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List         names1 = new ArrayList();
		List         names2 = new ArrayList<Object>();
		List<String> names3 = new ArrayList<String>();		
		List<String> names4 = new ArrayList<>();
		List<String> names5 = new ArrayList();

		HashMap<String, HashMap<String, String>> map1 = new HashMap<String, HashMap<String, String>>();
		HashMap<String, HashMap<String, String>> map2 = new HashMap<>();
		
		System.out.println(names1); // []
		System.out.println(names2); // []
		System.out.println(names3); // []
		System.out.println(names4); // []
		System.out.println(names5); // []

		System.out.println(map1);   // {}
		System.out.println(map2);   // {}
	}
}