package _010_equals;

public class MainApp {
	
	public static void main(String[] args) {	
		
		String s1 = new String("lion");
		String s2 = new String("lion");
		
		System.out.println("value s1: " + s1.hashCode());
		System.out.println("value s2: " + s2.hashCode());
		
		System.out.println("s1.equals(s1) : " + s1.equals(s1)); // true - values
		System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true - values
	
		System.out.println("----------------------------------");

		StringBuilder sb1 = new StringBuilder("lion");
		StringBuilder sb2 = new StringBuilder("lion");
		
		System.out.println("value sb1: " + sb1.hashCode());
		System.out.println("value sb2: " + sb2.hashCode());
		
		System.out.println("sb1.equals(sb1) : " + sb1.equals(sb1)); // true - values
		System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2)); // false - values
	}
}
