package _024_object_composition;

public class Penguin {
	private final Flippers flippers;
	private final WebbedFeet webbedFeet;

	public Penguin() {
		this.flippers = new Flippers();
		this.webbedFeet = new WebbedFeet();
	}

	public void flap() {
		this.flippers.flap();
	}

	public void kick() {
		this.webbedFeet.kick();
	}
}