package _023_has_a_relationship;

public class Toyota extends Car {
	// Toyota extends Car and thus inherits all methods from Car (except final and static)
	// Toyota can also define all its specific functionality
	public void startEngine() {
		Engine engine = new Engine();
		engine.start();
	}
}
