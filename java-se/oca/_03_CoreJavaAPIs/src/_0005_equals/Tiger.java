package _0005_equals;

public class Tiger {
	String name;

	public static void main(String[] args) {

		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = t1;
		
		System.out.println(" ==");
		System.out.println(t1 == t1); // true
		System.out.println(t1 == t2); // false
		System.out.println(t1 == t3); // true

		System.out.println("-----------------");

		System.out.println(" equals");
		System.out.println(t1.equals(t1)); // true
		System.out.println(t1.equals(t2)); // false
		System.out.println(t1.equals(t3)); // true
		
	}
}