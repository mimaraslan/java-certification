package _0001_java_operators;

public class MainApp {

	public static void main(String[] args) {
		int y = 4;
		System.out.println(y); // 4

		double x = 3 + 2 * --y;	
		//     x = 3 + 2 * (4 - 1);
        //	   x = 3 + 2 * 3;
        //	   x = 3 +   6;
        //	   x =   9;		
		System.out.println(x); // 9.0
		
		 x = 2 * 5 + 3 * 4 - 8;
	   //x =   10  +   12  - 8;
	   //x =       22      - 8;
	   //x =            14; 
		 System.out.println(x); // 14.0

		 
		 x = 2 * ((5 + 3) * 4 - 8);
	   //x = 2 * (   8    * 4 – 8); 
	   //x = 2 * (      32    – 8);
	   //x = 2 *            24;	 
		 System.out.println(x); // 48.0
		 
		 
		 System.out.println(9 / 3); //  3 
		 System.out.println(9 % 3); //  0
		 
		 System.out.println(10 / 3); //  3 
		 System.out.println(10 % 3); //  1
		 
		 System.out.println(11 / 3); //  3 
		 System.out.println(11 % 3); //  2
		 
		 System.out.println(12 / 3); //  4 
		 System.out.println(12 % 3); //  0
		 
		 /*
		  	int x = 1.0; // DOES NOT COMPILE
			short y = 1921222; // DOES NOT COMPILE
			int z = 9f; // DOES NOT COMPILE
			long t = 192301398193810323; // DOES NOT COMPILE
		  */
		 
	}
}