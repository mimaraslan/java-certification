package _0011_protected_access.pond.duck;

import _0011_protected_access.pond.goose.Goose;

public class GooseWatcher {
	public void watch() {
		Goose goose = new Goose();
		goose.floatInWater(); // DOES NOT COMPILE
	}
}