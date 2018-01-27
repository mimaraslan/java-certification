package _001_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // [] empty list
		System.out.println(list);
		
		list.add("Katerina"); 		
		System.out.println(list); // [Katerina]
		System.out.println(list.get(0)); // Katerina

		list.add("Lena"); 
		System.out.println(list.get(1)); // Lena
		
		list.add("Olga"); 
		System.out.println(list.get(2)); // Olga
		
		list.remove(2); // OK WORK	
		System.out.println(list); // [Katerina, Lena]
		
		String[] array = new String[list.size()]; // empty array 
		System.out.println(array.length); // 2
		System.out.println(array); // [Ljava.lang.String;@15db9742
		System.out.println(array[0]); // null
		System.out.println(array[1]); // null

		System.out.println("-----------------");
		
		array[0] = list.get(0); 
		System.out.println(array[0]); // Katerina

		array[1] = list.get(1); 
		System.out.println(array[1]); // Lena

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "-"); // Katerina-Lena-
		
		System.out.println("\n-----------------");	
		
		String[] array2 = { "cat", "mouse" }; 
		System.out.println(array2[0]); // cat
		System.out.println(array2[1]); // horse

		List<String> list2 = Arrays.asList(array2); // returns fixed size list
		System.out.println(list2); // [cat, horse]

		list2.set(1, "Tanya"); 
		System.out.println(list2); // [cat, Tanya]

		array2[0] = "Svetlana"; 
		System.out.println(array2[0]); // Svetlana
		System.out.println(array2[1]); // Tanya

		
		//  !!!! array2 and list2 !!!! 
		// Changes are refected in both, since they are backed by the same data
		System.out.println(list2); // [Svetlana, Tanya]

		System.out.println("\n-----------------");	

		String[] array3 = (String[]) list2.toArray(); 
		System.out.println(array3[0]); // Svetlana
		System.out.println(array3[1]); // Tanya

		list2.remove(1); // NOT WORK! throws UnsupportedOperationException
		System.out.println(list2);

	}
}