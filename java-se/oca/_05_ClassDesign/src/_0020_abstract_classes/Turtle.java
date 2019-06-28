package _0020_abstract_classes;

public abstract class Turtle {

	// Abstract methods must not provide a method body/implementation
	// in the abstract class for which is it declared.
	public abstract void swim() {} // DOES NOT COMPILE

	public abstract int getAge() { // DOES NOT COMPILE
		return 10;
	}
}