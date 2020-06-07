package _0005_access_modifiers.graphicshape;

public class Circle extends Shape {
	
	// private field
	private int radius; 

	// public method
	public void area() {
		
		// access to private field radius inside the class:
		System.out.println("area: " + 3.14 * radius * radius);
	}

	// The fillColor method has default access
	void fillColor() {
		
		// access to protected field, in subclass:
		System.out.println("color: " + color);
	}
}