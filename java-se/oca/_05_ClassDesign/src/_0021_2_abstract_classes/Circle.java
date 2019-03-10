package _0021_2_abstract_classes;

abstract class Shape {
	public abstract Shape copy();
}

class Circle extends Shape {

	public Circle(int x, int y, int radius) {
		System.out.println("Circle constructor");
	}

	@Override
	public Shape copy() {
		System.out.println("Shape copy");
		return null;
	}

	public static void main(String[] args) {
		
		Circle c1 = new Circle(1, 2, 3); // Circle constructor
		
		/*
		 This code will give a compiler error of "incompatible types: Shape cannot be converted to
		 Circle". This is because of the lack of an explicit downcast from Shape to Circle in the assignment
		 */
		Circle c2 = c1.copy(); // DOES NOT COMPILE
		
		Circle c3 = (Circle) c1.copy(); // Shape copy
	}

}