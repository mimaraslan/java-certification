package _0008_logical_operators;

public class MainApp {

	public static void main(String[] args) {
		
		int x = 10, y = 20, z = 10; 
		System.out.println(x < y); // Outputs true 
		System.out.println(x <= y); // Outputs true 
		System.out.println(x >= z); // Outputs true 
		System.out.println(x > z); // Outputs false
		
		int a = 6;
		boolean b = (a >= 6) || (++a <= 7); 
		System.out.println(b);
		
	}
}
