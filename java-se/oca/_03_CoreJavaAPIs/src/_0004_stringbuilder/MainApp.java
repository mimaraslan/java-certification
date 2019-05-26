package _0004_stringbuilder;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("\n String");
		String alpha = "";
		for (char current = 'a'; current <= 'z'; current++)
			alpha += current + " ";

		System.out.println(alpha);
		System.out.println(alpha.toUpperCase());

		
		System.out.println("\n StringBuilder");
		StringBuilder alpha2 = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			alpha2.append(current + " ");

		System.out.println(alpha2);
		// System.out.println(alpha2.toUpperCase()); // DO NOT COMPILE
		System.out.println(alpha2.toString().toUpperCase());
			
		
		System.out.println("\n StringBuilder: Mutability and Chaining 1");
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // sb = "start+middle"
		System.out.println(sb);

		StringBuilder same = sb.append("+end"); // "start+middle+end"
		System.out.println(same);
		System.out.println(sb);
		
		System.out.println("\n StringBuilder: Mutability and Chaining 2");
		StringBuilder a = new StringBuilder("abc"); 
		StringBuilder b = a.append("de");
		b = b.append("f").append("g"); 
		System.out.println("a=" + a); 
		System.out.println("b=" + b);
		  
		StringBuilder sb1 = new StringBuilder(); 
		StringBuilder sb2 = new StringBuilder("animal"); 
		StringBuilder sb3 = new StringBuilder(10);
 

	}
}