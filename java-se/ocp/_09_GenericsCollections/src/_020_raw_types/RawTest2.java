package _020_raw_types;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class RawTest2 {
	public static void main(String[] args) {
		List strList1 = new LinkedList();
		strList1.add("First");
		strList1.add("Second");
		
		List<String> list1 = strList1;
		// list1.add(10); // #1: generates compile-time error
		
		for (Iterator<String> itemItr = list1.iterator(); itemItr.hasNext();)
			System.out.println("Item : " + itemItr.next());

		System.out.println("---------------------------------");

		List<String> strList2 = new LinkedList<>();
		strList2.add("First");
		strList2.add("Second");
		
		List list2 = strList2;
		list2.add(10); // #2: compiles fine, results in runtime java.lang.ClassCastException
		for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();)
			System.out.println("Item : " + itemItr.next());
	}
}