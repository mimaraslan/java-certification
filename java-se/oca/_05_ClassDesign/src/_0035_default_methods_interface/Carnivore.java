package _0035_default_methods_interface;

public interface Carnivore {

	// 1. A default method may only be declared within an interface and not within a class or abstract class.
	// 2. If a method is marked as default, it must provide a method body.
	// 3. A default method is not assumed to be static, final, or abstract, 
	// 	  as it may be used or overridden by a class that implements the interface.
	// 4. Like all methods in an interface, a default method is assumed to be public 
	//	  and will not compile if marked as private or protected.
	public default void eatMeat(); // DOES NOT COMPILE

	public static int getRequiredFoodAmount() {
		return 10;
	}

	public int getRequiredFoodAmount2 () { // DOES NOT COMPILE
		 return 20;
	}
}