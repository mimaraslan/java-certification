package _0004_increment_decrement_operators;

public class MainApp {

	public static void main(String[] args) {
		int counter = 0; 
		System.out.println(counter); // Outputs 0 
		System.out.println(++counter); // Outputs 1 
		System.out.println(counter); // Outputs 1 
		System.out.println(counter--); // Outputs 1 
		System.out.println(counter); // Outputs 0
		
		int x = 3;
		int y = ++x * 5 / x-- + --x; 
		//  y =  4  * 5 / x-- + --x; 
		//  y =  4  * 5 /  4  + --x; 
	    //  y =  4  * 5 /  4  +  2 ;
	    //  y =    20   /  4  +  2 ;
	    //  y =         5     +  2 ;
		System.out.println("x is " + x);  //2
		System.out.println("y is " + y);  //7
		
		/*
		System.out.println(--counter--); // DOES NOT COMPILE 
		System.out.println(++counter++); // DOES NOT COMPILE 
		System.out.println(++counter--); // DOES NOT COMPILE 
		*/
	}
}
