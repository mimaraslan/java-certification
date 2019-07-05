package _007_functional_interface;

public interface Skip extends Sprint {
	
	public default int getHopCount(Kangaroo kangaroo) {
		return 10;
	}

	public static void skip(int speed) {
	}
	
	// abstract double getMaxSpeed();
}