package _001_access_modifiers3.appcanvas;

import _001_access_modifiers3.graphicshape.Circle;

class Canvas {
	void getArea() {
		Circle circle = new Circle();
		circle.area(); // call to public method area(), outside package
	}
}