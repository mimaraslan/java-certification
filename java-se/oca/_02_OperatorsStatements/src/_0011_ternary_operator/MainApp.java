package _0011_ternary_operator;

public class MainApp {

	public static void main(String[] args) {

		int y = 10;
		/*
		final int x;
		if (y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		*/
		final int x = (y > 5) ? (2 * y) : (3 * y);
		
		System.out.println(x);
	}
}