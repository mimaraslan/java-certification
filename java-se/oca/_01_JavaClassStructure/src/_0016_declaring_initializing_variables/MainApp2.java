package _0016_declaring_initializing_variables;

public class MainApp2 {
	public static void main(String[] args) {
		
	  //Local variables must be initialized before use. 
		boolean b1, b2;  // OK
		System.out.println(b1); // Initialize variable
	    System.out.println(b2); // Initialize variable
		    
		boolean b3 = false, b4;  // OK
		System.out.println(b3); 
	    System.out.println(b4); // Initialize variable
	    
		boolean b5, b6 = true;  // OK
		System.out.println(b5); // Initialize variable
	    System.out.println(b6); 
	    
		boolean b7 = false, b8 = true;  // OK
		System.out.println(b7); 
	    System.out.println(b8); 
	    
	  //Local variables must be initialized before use. 
		String s1, s2; 
	    System.out.println(s1); // Initialize variable
	    System.out.println(s2); // Initialize variable
	    
		String s3 = "3", s4 = null; // OK
	    System.out.println(s3);
	    System.out.println(s4);
	    
		String s5, s6 = "6"; 
	    System.out.println(s5);  // Initialize variable
	    System.out.println(s6);
	    
		String s7 = "7", s8 = "8"; // OK
	    System.out.println(s7);
	    System.out.println(s8);
		
	  //Local variables must be initialized before use. 	
	    int i1; // OK
		System.out.println(i1); // Initialize variable

		int i2, i3; // OK
		System.out.println(i2); // Initialize variable
		System.out.println(i3); // Initialize variable
		
	
    	int i4; i5; // DOES NOT COMPILE
    	
		double d1, double d2;  // DOES NOT COMPILE

	}
}