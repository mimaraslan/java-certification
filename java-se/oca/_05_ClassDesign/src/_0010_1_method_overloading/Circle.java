package _0010_1_method_overloading;

public class Circle {

	public void fillColor(int red, int green, int blue) {
		System.out.println(red + " , " + green + " , " + blue);
	}

	public void fillColor(float hue, float saturation, float brightness) {
		System.out.println(hue + " , " + saturation + " , " + brightness);
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.fillColor(0, 255, 255);

		c.fillColor(0.5f, 0.5f, 1.0f);
	}
}