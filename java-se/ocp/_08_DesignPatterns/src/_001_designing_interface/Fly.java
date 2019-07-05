package _001_designing_interface;

public interface Fly {
	
	public int getWingSpan() throws Exception;

	public static final int MAX_SPEED = 100;

	public default void land() {
		System.out.println("Animal is landing");
	}

	public static double calculateSpeed(float distance, double time) {
		double result = distance / time;
		System.out.println("calculateSpeed: "+ result);
		return result;
	}
}