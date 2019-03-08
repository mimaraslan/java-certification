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
		Circle c2 = (Circle) c1.copy(); // Shape copy
	}

}