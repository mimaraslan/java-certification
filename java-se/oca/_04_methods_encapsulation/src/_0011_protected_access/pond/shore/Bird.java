package _0011_protected_access.pond.shore; // in a different package

public class Bird {
	protected String text = "floating"; // protected access

	protected void floatInWater() { // protected access
		System.out.println(text);
	}
}