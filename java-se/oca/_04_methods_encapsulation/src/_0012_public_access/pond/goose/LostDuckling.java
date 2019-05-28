package _0012_public_access.pond.goose;

import _0012_public_access.pond.duck.DuckTeacher;

public class LostDuckling {
	public void swim() {
		DuckTeacher teacher = new DuckTeacher();
		teacher.swim(); // allowed
		System.out.println("Thanks" + teacher.name); // allowed
	}
}