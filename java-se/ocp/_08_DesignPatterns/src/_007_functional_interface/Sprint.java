package _007_functional_interface;

// @FunctionalInterface annotation contains more than one abstract method,
@FunctionalInterface
public interface Sprint {
	public void sprint(Animal animal);
	// abstract double getMaxSpeed(); // Invalid - because this is @FunctionalInterface
}