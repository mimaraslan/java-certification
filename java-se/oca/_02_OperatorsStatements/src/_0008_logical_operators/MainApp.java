package _0008_logical_operators;

public class MainApp {

	public static void main(String[] args) {
		
		int x = 10, y = 20, z = 10; 
		System.out.println(x < y);  // true 
		System.out.println(x <= y); // true 
		System.out.println(x >= z); // true 
		System.out.println(x > z);  // false
		
		int a = 6;
		boolean b = (a >= 6) || (++a <= 7); 
		System.out.println(b); // true 
		
		boolean c = (a >= 6000) && (++a <= 7); 
		System.out.println(c); // false 
		
	}
}
