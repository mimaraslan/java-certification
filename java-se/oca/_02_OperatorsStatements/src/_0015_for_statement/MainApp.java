package _0015_for_statement;

public class MainApp {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n--------------------");
	
		
		/*
	    for(initialization; booleanExpression; updateStatement) 
	 
     	for (  )  //will not compile
    	for ( ; )  //will not compile
		for ( ; ; ; )  //will not compile
		*/
		//1. Creating an Infinite Loop
		for ( ; ; ) {
			System.out.println("Hello World");
	    }
		
		
		//2. Adding Multiple Terms to the for Statement
		int x = 0;
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) { 
			System.out.print(y + " ");
		}
		System.out.print(x);
		
		
		//3. Redeclaring a Variable in the Initialization Block
		int x3 = 0;
		for(long y = 0, x3 = 4; x < 5 && y < 10; x3++, y++) { // DOES NOT COMPILE
			System.out.print(x3 + " ");
		}

		
		//4. Using Incompatible Data Types in the Initialization Block
		for(long y = 0, int x4 = 4; x < 5 && y<10; x4++, y++) { // DOES NOT COMPILE
			System.out.print(x4 + " "); 
		}
		
		
		//5. Using Loop Variables Outside the Loop
		for(long y = 0, x5 = 4; x5 < 5 && y < 10; x5++, y++) {
			System.out.print(y + " "); 
		}
			System.out.print(x5); // DOES NOT COMPILE
			
	}	

}