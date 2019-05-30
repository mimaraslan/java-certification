package _0016_static_variables;

public class MainApp {

	private static final int NUM_SECONDS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}

	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four; // DOES NOT COMPILE
	static {
		one = 1;
		two = 2;
		three = 3; // DOES NOT COMPILE
		two = 4; // DOES NOT COMPILE
		one = 5;
	}

	public static void main(String[] args) {
		System.out.println(NUM_SECONDS_PER_HOUR);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println( f);
	}
}
