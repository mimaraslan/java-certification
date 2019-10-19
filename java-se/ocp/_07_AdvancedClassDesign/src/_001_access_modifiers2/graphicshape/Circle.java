package _001_access_modifiers2.graphicshape;

import _001_access_modifiers2.graphicshape.Shape;

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
	
		public static void main(String[] args) {
			Circle circle = new Circle();
			circle.area();
			circle.fillColor();
		}
	
}