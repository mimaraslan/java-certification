package _0010_default_access.pond.swan;

import _0010_default_access.pond.duck.MotherDuck; // import another package

public class BadCygnet {
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		duck.quack(); // DOES NOT COMPILE
		// no access modifier, only classes in the same package can access it.
		System.out.println(duck.noise); // DOES NOT COMPILE
	}
}