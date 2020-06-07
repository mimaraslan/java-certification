package _0010_4_object;

public class Park {

	public Park() {
		System.out.println("() in constructor");
	}

	public static void main(String[] args) {

		int a1;               // field, variable
		Park p1 = null;       // field, variable, object reference
		Park p2 = new Park(); // object, instance
		System.out.println(p1);
		System.out.println(p2);

	}
}
