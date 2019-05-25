package _0001_java_operators;

public class MainApp {

	public static void main(String[] args) {
		int y = 4;
		double x = 3 + 2 * --y;
		
		System.out.println(y);
		System.out.println(x);
		
		 x = 2 * 5 + 3 * 4 - 8;
	   //x = 10    +   12  - 8;
		 System.out.println(x);

		 
		 x = 2 * ((5 + 3) * 4 - 8);
	   //x = 2 * (   8    * 4 – 8); 
	   //x = 2 * (      32    – 8);
	   //x = 2 *            24;	 
		 System.out.println(x);
		 
		 
		 System.out.print(9 / 3); // Outputs 3 
		 System.out.print(9 % 3); // Outputs 0
		 
		 System.out.print(10 / 3); // Outputs 3 
		 System.out.print(10 % 3); // Outputs 1
		 
		 System.out.print(11 / 3); // Outputs 3 
		 System.out.print(11 % 3); // Outputs 2
		 
		 System.out.print(12 / 3); // Outputs 4 
		 System.out.print(12 % 3); // Outputs 0
		 
		 /*
		  	int x = 1.0; // DOES NOT COMPILE
			short y = 1921222; // DOES NOT COMPILE
			int z = 9f; // DOES NOT COMPILE
			long t = 192301398193810323; // DOES NOT COMPILE
		  */
		 
	}
}
