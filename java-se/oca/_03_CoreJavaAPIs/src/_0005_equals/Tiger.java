package _0005_equals;

public class Tiger {
	String name;

	public Tiger(String string) {
	}

	public static void main(String[] args) {

		// Both s1 and s2 refers to different objects.
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		String s3 = s1;

		System.out.println("value s1: " + s1.hashCode());
		System.out.println("value s2: " + s2.hashCode());
		System.out.println("value s3: " + s3.hashCode());
		System.out.println();

		// Using equals, the result is true
		// because its only comparing the values given in s1 and s2.
		System.out.println("s1.equals(s1) : " + s1.equals(s1)); // true - same values
		System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true - same values
		System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true - same values
		System.out.println("\n");

		System.out.println("address s1: " + System.identityHashCode(s1));
		System.out.println("address s2: " + System.identityHashCode(s2));
		System.out.println("address s3: " + System.identityHashCode(s3));
		System.out.println();

		// When we use == operator for s1 and s2 comparison
		// then the result is false as both have different addresses in memory.
		System.out.println("s1 == s1 : " + (s1 == s1)); // true - same addresses
		System.out.println("s1 == s2 : " + (s1 == s2)); // false - different addresses
		System.out.println("s1 == s3 : " + (s1 == s3)); // true - same addresses
		System.out.println();

		System.out.println("----------------------------------");

		Tiger t1 = new Tiger("WORLD");
		Tiger t2 = new Tiger("WORLD");
		Tiger t3 = t1;

		System.out.println("value t1: " + t1.hashCode());
		System.out.println("value t2: " + t2.hashCode());
		System.out.println("value t3: " + s2.hashCode());
		System.out.println();

		System.out.println("t1.equals(t1) : " + t1.equals(t1)); // true - same values
		System.out.println("t1.equals(t2) : " + t1.equals(t2)); // false - different values
		System.out.println("t1.equals(t3) : " + t1.equals(t3)); // true - same values
		System.out.println("\n");

		System.out.println("address t1: " + System.identityHashCode(t1));
		System.out.println("address t2: " + System.identityHashCode(t2));
		System.out.println("address t3: " + System.identityHashCode(t3));
		System.out.println();

		System.out.println("t1 == t1 : " + (t1 == t1)); // true - same addresses
		System.out.println("t1 == t2 : " + (t1 == t2)); // false - different addresses
		System.out.println("t1 == t3 : " + (t1 == t3)); // true - same addresses

	}
}