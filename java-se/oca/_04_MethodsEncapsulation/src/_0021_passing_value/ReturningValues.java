package _0021_passing_value;

public class ReturningValues {
	public static void main(String[] args) {
		int number = 1; // 1
		number(number); // 1
		System.out.println(number); // 1

		Integer number2 = 1; // 1
		number2(number2); // 1
		System.out.println(number2); // 1

		String letters = "abc"; // abc
		letters = letters(letters); // abcd
		System.out.println(letters); // abcd

	}

	public static int number(int number) {
		number++;
		return number; // 2
	}

	public static Integer number2(Integer number2) {
		number2++;
		System.out.println("number2: "+ number2);
		return number2; // 2
	}

	public static String letters(String letters) {
		letters += "d";
		return letters; // abcd
	}
}