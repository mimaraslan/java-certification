package _0040_equals;

class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public String toString() {
		return "x = " + xPos + ", y = " + yPos;
	}

	// override the equals method to perform
	// "deep" comparison of two Point objects
	public boolean equals(Point other) {
		
		if (other == null)
			return false;
		
		// two points are equal only if their x and y positions are equal
		if ((xPos == other.xPos) && (yPos == other.yPos))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Point p1 = new Point(40, 80);
		Point p2 = new Point(40, 90);
		Point p3 = new Point(40, 80);
		System.out.println("p1 equals p2 is " + p1.equals(p2));
		System.out.println("p1 equals p3 is " + p1.equals(p3));
	}

}