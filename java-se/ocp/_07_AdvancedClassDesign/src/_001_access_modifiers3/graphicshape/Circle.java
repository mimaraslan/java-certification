package _001_access_modifiers3.graphicshape;


public class Circle {
	
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
	
    void getArea() { // public method
		Circle circle = new Circle();
		// call to public method area() within package:
		circle.area();
		// calling fillColor() with default access within package:
		circle.fillColor();
	}
	
}