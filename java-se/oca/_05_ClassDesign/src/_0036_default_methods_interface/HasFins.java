package _0036_default_methods_interface;

public interface HasFins {

	public default int getNumberOfFins() {
		return 4;
	}

	public default double getLongestFinLength() {
		return 20.0;
	}

	public default boolean doFinsHaveScales() {
		return true;
	}
}