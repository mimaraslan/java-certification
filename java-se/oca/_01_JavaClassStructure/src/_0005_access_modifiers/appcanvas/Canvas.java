package _0005_access_modifiers.appcanvas;

import _0005_access_modifiers.graphicshape.Circle;

class Canvas {
	void getArea() {
		Circle circle = new Circle();
		circle.area(); // call to public method area(), outside package
	}
}