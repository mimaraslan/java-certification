package _0015_reference_types;

public class MainApp {
	public static void main(String[] args) {
		
		//int value = null; // DOES NOT COMPILE 
		String s = null; // OK
		System.out.println(s);
		
		String reference = "hello";
		System.out.println(reference);

		int len = reference.length();
		System.out.println(len);

		//int len2 = len.length(); //  DOES NOT COMPILE 
		//Primitives do not have methods.
		
		// An object in memory can be accessed only via a reference.
		java.util.Date today; 		
		today = new java.util.Date(); 
		System.out.println(today);
		
		String greeting;
		greeting = "How are you? 1 ";		
		System.out.println(greeting);
		
		String greeting2;
		greeting2 = new String("How are you? 2");		
		System.out.println(greeting2);

	}
}