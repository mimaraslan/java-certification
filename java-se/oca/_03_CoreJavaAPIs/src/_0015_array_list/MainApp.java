package _0015_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>(); 
		myList.add("hawk");	    
		myList.add("robin");
	    System.out.println(myList); // [hawk, robin]
	    
		System.out.println("---------------"); 

		System.out.println("\n myList --> toArray"); 
	    Object[] objectArray = myList.toArray();
	    System.out.println(objectArray.length); // 2
	    
	    String[] stringArray = myList.toArray(new String[0]); 
	 // String[] stringArray = (String[]) list.toArray(); 
	    System.out.println(stringArray.length); // 2
	    
		System.out.println("---------------"); 

		System.out.println("\n myArray --> asList"); 
	    String[] myArray = { "hawk", "robin" }; // [hawk, robin]
	    List<String> list2 = Arrays.asList(myArray); // returns fixed size list 
	    System.out.println(list2.size()); // 2
	    
	    list2.set(1, "test"); 
	    System.out.println(list2); // [hawk, test]

	    myArray[0] = "new"; 
	    for (String b : myArray) 
	    	System.out.print(b + " "); // new test
	    
	   // list2.remove(1); // throws UnsupportedOperation Exception
		
	}
}
