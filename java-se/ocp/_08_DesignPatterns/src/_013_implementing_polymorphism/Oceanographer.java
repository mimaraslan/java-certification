package _013_implementing_polymorphism;

public class Oceanographer {

	public void checkSound(LivesInOcean animal) {
		animal.makeSound();
	}

	public static void main(String[] args) {
		Oceanographer o = new Oceanographer();
		o.checkSound(new Dolphin());
		o.checkSound(new Whale());
	}
}