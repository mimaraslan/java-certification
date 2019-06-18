package _0027_implementing_interfaces;

public interface CanFly {

	// each method is prepended with abstract and public keywords
	void fly(int speed);

	abstract void takeoff();

	public abstract double dive();
}