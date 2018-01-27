package _020_raw_types;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class RawTest1 {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Lena");
		list.add("Katerina");
		
		List<String> strList = list; // #1
		for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();)
			System.out.println("Item: " + itemItr.next());
		
		System.out.println("---------------------------------");
		
		List<String> strList2 = new LinkedList<>();
		strList2.add("Lena");
		strList2.add("Katerina");
		
		List list2 = strList2; // #2
		for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();)
			System.out.println("Item: " + itemItr.next());
	}
}