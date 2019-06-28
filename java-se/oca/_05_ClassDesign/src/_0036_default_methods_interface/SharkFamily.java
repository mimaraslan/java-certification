package _0036_default_methods_interface;

public interface SharkFamily extends HasFins {

	public default int getNumberOfFins() {
		return 8;
	}

	public double getLongestFinLength();

 // public default boolean doFinsHaveScales() { 	
	public 		   boolean doFinsHaveScales() { // DOES NOT COMPILE
	 return false;
	 }
}