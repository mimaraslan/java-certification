package _0035_default_methods_interface;

public interface IsWarmBlooded {
	
	boolean hasScales();
	
	// 1. A default method may only be declared within an interface and not within a class or abstract class.
	// 2. If a method is marked as default, it must provide a method body.
	// 3. A default method is not assumed to be static, final, or abstract, 
	// 	  as it may be used or overridden by a class that implements the interface.
	// 4. Like all methods in an interface, a default method is assumed to be public 
	//	  and will not compile if marked as private or protected.
	public default double getTemperature() {
		return 10.0;
	}
	
	/*
	Unlike interface variables, which are assumed static class members, default methods
	cannot be marked as static and require an instance of the class implementing the interface to be invoked.
	 
	They can also not be marked as final or abstract, because they are
	allowed to be overridden in subclasses but are not required to be overridden.
	
	When an interface extends another interface that contains a default method, 
	it may choose to ignore the default method, 
	in which case the default implementation for the method will be used. 
	*/
}