package _0041_overridden_equals;

class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public String toString() {
		return "x = " + xPos + ", y = " + yPos;
	}

	// override the equals method to perform "deep" comparison of two Point objects
	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;

		// check if the dynamic type of 'other' is Point
		// if 'other' is of any other type than 'Point', the two objects cannot be
		// equal if 'other' is of type Point (or one of its derived classes), then
		// downcast the object to Point type and then compare members for equality
		if (other instanceof Point) {
			Point anotherPoint = (Point) other;

			// two points are equal only if their x and y positions are equal
			if ((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Object p1 = new Point(40, 80);
		Object p2 = new Point(40, 90);
		Object p3 = new Point(40, 80);

		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		System.out.println("p3: " + p3.toString());

		System.out.println("p1 equals p2 is " + p1.equals(p2)); // false
		System.out.println("p1 equals p3 is " + p1.equals(p3)); // true
	}

}