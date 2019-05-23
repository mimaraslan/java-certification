package _0006_compound_assignment_operators;

public class MainApp {

	public static void main(String[] args) {
		
		int x = 2, z = 3;
		x = x * z; // Simple assignment operator 
		x *= z; // Compound assignment operator

		System.out.println("x is " + x); 
	
		long x2 = 10;
		int y2 = 5;
		//y2 = y2 * x2; // DOES NOT COMPILE
		y2 *= x2;
		System.out.println("y2 is " + y2); 

		
		long a = 5;
		long b = (a=3);
		System.out.println(a); // Outputs 3 
		System.out.println(b); // Also, outputs 3
		
	}
}
