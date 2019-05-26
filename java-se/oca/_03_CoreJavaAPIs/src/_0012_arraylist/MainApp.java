package _0012_arraylist;

import java.util.ArrayList; // import just ArrayList
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);

		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();

		List<String> list6 = new ArrayList<>();
		// ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

		System.out.println(" add()");
		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list); // [hawk, true]

		System.out.println("---------------");
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		// safer.add(Boolean.TRUE); // DOES NOT COMPILE

		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(1, "robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]

		System.out.println("---------------");
		System.out.println("\n remove()");
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); // [hawk]
		birds2.add("hawk"); // [hawk, hawk]
		System.out.println(birds2.remove("cardinal")); // false
		System.out.println(birds2.remove("hawk")); // true
		System.out.println(birds2.remove(0)); // hawk
		System.out.println(birds2); // []

		System.out.println("---------------");
		System.out.println("\n set()");
		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk"); // [hawk]
		System.out.println(birds3); // [hawk]
		System.out.println(birds3.size()); // 1
		birds3.set(0, "robin"); // [robin]
		System.out.println(birds3); // [robin]
		System.out.println(birds3.size()); // 1
		//birds3.set(1, "robin"); // IndexOutOfBoundsException
		
		System.out.println("---------------");
		System.out.println("\n isEmpty() and size()");
		List<String> birds4 = new ArrayList<>();
		System.out.println(birds4.isEmpty()); // true
		System.out.println(birds4.size()); // 0
		birds4.add("hawk"); // [hawk] 
		birds4.add("hawk"); // [hawk, hawk]
		System.out.println(birds4.isEmpty()); // false
		System.out.println(birds4.size()); // 2
				
		System.out.println("---------------");
		System.out.println("\n clear()");
		List<String> birds5 = new ArrayList<>();		
		birds5.add("hawk"); // [hawk]
		birds5.add("hawk"); // [hawk, hawk]
		System.out.println(birds5.isEmpty()); // false 
		System.out.println(birds5.size()); // 2
		birds5.clear(); // []
		System.out.println(birds5.isEmpty()); // true
		System.out.println(birds5.size()); // 0
		
		System.out.println("---------------");
		System.out.println("\n contains()");
		List<String> birds6 = new ArrayList<>();		
		birds6.add("hawk"); // [hawk] 
		System.out.println(birds6.contains("hawk")); // true 
		System.out.println(birds6.contains("robin")); // false

		System.out.println("---------------");
		System.out.println("\n equals()");
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>(); 
		
		System.out.println(one); // []
		System.out.println(two); // []
		System.out.println(one.equals(two)); // true
		System.out.println("-----");

		one.add("a"); 
		System.out.println(one); // [a]
		System.out.println(two); // []
		System.out.println(one.equals(two)); // false 
		System.out.println("-----");

		two.add("a"); 
		System.out.println(one); // [a]
		System.out.println(two); // [a]
		System.out.println(one.equals(two)); // true
		System.out.println("-----");

		one.add("b"); 
		System.out.println(one); // [a,b]
		System.out.println(two); // [a]
		System.out.println(one.equals(two)); // false
		System.out.println("-----");

		two.add(0, "b"); 
		System.out.println(one); // [a,b]
		System.out.println(two); // [b,a]
		System.out.println(one.equals(two)); // false
		
	}
}