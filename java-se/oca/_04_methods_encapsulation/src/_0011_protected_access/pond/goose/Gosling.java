package _0011_protected_access.pond.goose;

import _0011_protected_access.pond.shore.Bird;

public class Gosling extends Bird { // extends means create subclass
	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}
}