package _0015_overriding_hiding_methods;

public class Marsupial {
	
	public static boolean isBiped() {
		return false;
	}

	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}