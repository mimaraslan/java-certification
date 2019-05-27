package _0008_varargs;

public class MainApp3 {
	public static void run(int... nums) {
		System.out.println(nums[1]);
	}

	public static void main(String[] args) {
		run(11, 22); // 22
	}
}