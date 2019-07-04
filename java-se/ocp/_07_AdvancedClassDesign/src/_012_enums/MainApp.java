package _012_enums;

public class MainApp {
	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER); // SUMMER
		System.out.println(s == Season.SUMMER); // true

		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}
		
	// if ( Season.SUMMER == 2) {} // DOES NOT COMPILE
		
		Season s1 = Season.valueOf("SUMMER"); // SUMMER
		Season s2 = Season.valueOf("summer"); // java.lang.IllegalArgumentException
	}
}

