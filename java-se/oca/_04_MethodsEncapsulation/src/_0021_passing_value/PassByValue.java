package _0021_passing_value;

public class PassByValue {

	public static void main(String[] args) {
		int original1 = 1;
		int original2 = 2;

		System.out.println("PassByValue");
		swapByValue(original1, original2);
		System.out.println(original1); // 1
		System.out.println(original2); // 2

		Integer original3 = 3;
		Integer original4 = 4;

		System.out.println("\nPassByReference");
		swapByReference(original3, original4);
		System.out.println(original3); // 4 (not in Java)
		System.out.println(original4); // 3 (not in Java)

	}

	public static void swapByValue(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swapByReference(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}

}