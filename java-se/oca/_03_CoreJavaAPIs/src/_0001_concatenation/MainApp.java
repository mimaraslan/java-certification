package _0001_concatenation;

public class MainApp {

	public static void main(String[] args) {
		String name1 = "Fluffy";
		System.out.println("name1: "+ name1);

		String name2 = new String("Fluffy");	
		System.out.println("name2: "+ name2);
		
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); //64

		
		String s = "1"; // s currently holds "1"
		s += "2"; // s currently holds "12"
		s += 3; // s currently holds "123"
		System.out.println(s); // 123
		   
		String s1 = "10";
		String s2 = s1.concat("20"); 
		s2.concat("30"); 
		System.out.println(s2);
		
	}
}
