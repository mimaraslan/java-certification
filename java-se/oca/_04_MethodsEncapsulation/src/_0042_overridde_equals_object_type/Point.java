package _0042_overridde_equals_object_type;

class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public String toString() {
		return "x = " + xPos + ", y = " + yPos;
	}

/*
    @Override  // DOES NOT COMPILE
	public boolean equals(Point other) {

		if (other == null)
			return false;

		if ((xPos == other.xPos) && (yPos == other.yPos))
			return true;
		else
			return false;
	}
*/
	
	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		
		if (other instanceof Point) {
			Point anotherPoint = (Point) other;
			
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