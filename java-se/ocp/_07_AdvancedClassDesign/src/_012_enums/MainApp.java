package _012_enums;

public class MainApp {
	public static void main(String[] args) {
		
		Season s1 = Season.SUMMER;
		System.out.println(s1);
		
		System.out.println("--------------");
		
		System.out.println(Season.SUMMER); // SUMMER
		System.out.println(s1 == Season.SUMMER); // true

		System.out.println("--------------");

		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}
				
	// enum is a type and not an int.	
	// if ( Season.SUMMER == 2) {} // DOES NOT COMPILE
		
		System.out.println("--------------");
		
		Season s2 = Season.valueOf("SUMMER"); // SUMMER
		System.out.println(s2);

		System.out.println("--------------");

		Season s3 = Season.valueOf("summer"); // java.lang.IllegalArgumentException: No enum constant
		System.out.println(s3);
	}
}