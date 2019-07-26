package _0005_access_modifiers.graphicshape;

public class Circle extends Shape {
	
	private int radius; // private field

	public void area() { // public method
		// access to private field radius inside the class:
		System.out.println("area: " + 3.14 * radius * radius);
	}

	// The fillColor method has default access
	void fillColor() {
		// access to protected field, in subclass:
		System.out.println("color: " + color);
	}
}