package _0027_implementing_interfaces;

// An interface may not be marked as final
private final interface CanCrawl { // DOES NOT COMPILE
	
	// marking an interface as private, protected, or final will trigger a compiler error
	private void dig(int depth); // DOES NOT COMPILE

	// marking an interface as private, protected, or final will trigger a compiler error
	protected abstract double depth(); // DOES NOT COMPILE

	//  compiler throws an exception for using both abstract and final keywords on a method
	public final void surface(); // DOES NOT COMPILE
}