package _0015_reference_types;

public class MainApp {
	public static void main(String[] args) {
		
		//int value = null; // DOES NOT COMPILE 
		String s = null;
		
		String reference = "hello";
		int len = reference.length();
		//int bad = len.length(); //  DOES NOT COMPILE 
		//Primitives do not have methods.
		
		
		// An object in memory can be accessed only via a reference.
		java.util.Date today; 
		String greeting;
		
		today = new java.util.Date(); 
		greeting = "How are you?";
		
		System.out.println(today);
		System.out.println(greeting);

	}
}