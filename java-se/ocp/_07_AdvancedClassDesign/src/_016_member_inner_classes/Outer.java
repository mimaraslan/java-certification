package _016_member_inner_classes;

public class Outer {
	private String greeting = "Hi";

	protected class Inner {
		public int repeat = 3;

		public void go() {
			for (int i = 0; i < repeat; i++)
				System.out.println(greeting);
		}
	}

	// Local inner	classes are classes defned within a method.
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();
	}
}
