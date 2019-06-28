package _0025_2_implementing_interfaces;

public class FieldMouse implements CanBurrow {
	
	@Override
	public int getMaximumDepth() {
		return MINIMUM_DEPTH;
	}

	public static void main(String[] args) {
		FieldMouse fieldMouse = new FieldMouse();
		System.out.println(fieldMouse.getMaximumDepth()); // 2
	}
}