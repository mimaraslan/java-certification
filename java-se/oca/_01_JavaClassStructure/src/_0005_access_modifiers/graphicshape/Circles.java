package _0005_access_modifiers.graphicshape;

class Circles {
	void getArea() {
		Circle circle = new Circle();
		// call to public method area() within package:
		circle.area();
		// calling fillColor() with default access within package:
		circle.fillColor();
	}
}