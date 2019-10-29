package _001_Array_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // [] empty list
		System.out.println(list);
		
		list.add("Katerina"); 
		System.out.println(list); // [Katerina]
		
		list.add("Lena"); 
		System.out.println(list); // [Katerina, Lena]
		
		String[] array = new String[list.size()]; // empty array 
		System.out.println(array); // [Ljava.lang.String;@15db9742
		System.out.println(array[0]); // null
		System.out.println(array[1]); // null

		System.out.println("-----------------");
		
		array[0] = list.get(1); 
		System.out.println(array[0]); // Lena

		array[1] = list.get(0); 
		System.out.println(array[1]); // Katerina

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "-"); // Lena-Katerina-
		
		System.out.println("\n-----------------");	
		
		String[] array2 = { "cat", "mouse" }; 
		System.out.println(array2[0]); // cat
		System.out.println(array2[1]); // mouse

		List<String> list2 = Arrays.asList(array2); // returns fixed size list
		System.out.println(list2); // [cat, mouse]

		list2.set(1, "test"); 
		System.out.println(list2); // [cat, test]

		array2[0] = "new"; 
		System.out.println(array2[0]); // new
		System.out.println(array2[1]); // test

		
		//  !!!! array2 and list2 !!!! 
		// Changes are refected in both, since they are backed by the same data
		System.out.println(list2); // [new, test]

		String[] array3 = (String[]) list2.toArray(); 
		System.out.println(array3[0]); // new
		System.out.println(array3[1]); // test

		list2.remove(1); // throws UnsupportedOperationException
		System.out.println(list2);

	}
}