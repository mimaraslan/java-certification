package _0015_overriding_hiding_methods;

public class Kangaroo extends Marsupial {

	   public static boolean isBiped() {
	// public        boolean isBiped() {
			return true;
		}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped()); // isBiped is hidden - not overridden
	}

	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription(); // Marsupial walks on two legs: false
		joey.getKangarooDescription();  // Kangaroo hops on two legs: true
	}
}