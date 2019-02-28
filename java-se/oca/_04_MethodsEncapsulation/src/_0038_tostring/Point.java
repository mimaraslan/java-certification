package _0038_tostring;

//improved version of the Point class with overridden toString method
class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

// this toString method overrides the default toString method implementation
// provided in the Object base class
	public String toString() {
		return "x = " + xPos + ", y = " + yPos;
	}

	public static void main(String[] args) {
		System.out.println(new Point(30, 40)); // x = 30, y = 40

		Object obj = new Point(50, 60);
		System.out.println(obj); // x = 50, y = 60
	}
}