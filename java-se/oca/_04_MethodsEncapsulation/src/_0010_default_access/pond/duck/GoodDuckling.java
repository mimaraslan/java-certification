package _0010_default_access.pond.duck;

public class GoodDuckling {
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		duck.quack(); // default access
		System.out.println(duck.noise); // default access
	}
}