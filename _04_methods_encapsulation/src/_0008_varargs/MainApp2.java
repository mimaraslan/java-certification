package _0008_varargs;

public class MainApp2 {
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}

	public static void main(String[] args) {
	 walk(1); // 0
	 walk(1, 2); // 1
	 walk(1, 2, 3); // 2
	 walk(1, new int[] {1, 2, 3, 4}); // 4
	}
}