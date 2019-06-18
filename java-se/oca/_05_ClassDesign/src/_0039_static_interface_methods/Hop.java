package _0039_static_interface_methods;

public interface Hop {
	
//1. Like all methods in an interface, a static method is assumed to be public 
//	 and will not compile if marked as private or protected.
	static int getJumpHeight() {
		return 2;
	}
}
