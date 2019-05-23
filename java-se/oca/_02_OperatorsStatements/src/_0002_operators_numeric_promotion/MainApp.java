package _0002_operators_numeric_promotion;

public class MainApp {

	public static void main(String[] args) {
		int x = 1;
		long y = 33;
		System.out.println(x * y); //long
		 
		double x2 = 39.21;
		float y2 = 2.1f;
		System.out.println(x2 * y2); //double

		
		short x3 = 10;
		short y3 = 3;
		System.out.println(x3 / y3); //int
		
		short x4 = 14;
		float y4 = 13; 
		double z4 = 30;
		System.out.println(x4 * y4 / z4); //double
	}
}
