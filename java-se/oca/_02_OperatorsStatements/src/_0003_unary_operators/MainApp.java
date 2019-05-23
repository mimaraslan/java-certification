package _0003_unary_operators;

public class MainApp {

	public static void main(String[] args) {
		boolean x = false; 
		System.out.println(x); // false 
		x = !x;
		System.out.println(x); // true
		
		int x = !5; // DOES NOT COMPILE 
		boolean y = -true; // DOES NOT COMPILE 
		boolean z = !0; // DOES NOT COMPILE
		
	}
}
