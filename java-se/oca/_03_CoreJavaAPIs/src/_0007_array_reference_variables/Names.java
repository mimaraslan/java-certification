package _0007_array_reference_variables;

public class Names {
	public static void main(String[] args) {

		String names1[];
		String names2[] = new String[2];

		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		// againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
		// objects[0] = new StringBuilder(); // careful!

		String[] mammals = { "monkey", "chimp", "donkey" };
		System.out.println(mammals.length); // 3
		System.out.println(mammals[0]); // monkey
		System.out.println(mammals[1]); // chimp
		System.out.println(mammals[2]); // donkey

		String[] birds = new String[6];
		System.out.println(birds.length);

		System.out.println("---------------");

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 5;
			System.out.println("numbers[" + i + "]=" + numbers[i]);
		}

		System.out.println("---------------");

		numbers[10] = 3;
		numbers[numbers.length] = 5;
		for (int i = 0; i <= numbers.length; i++) { //java.lang.ArrayIndexOutOfBoundsException
			numbers[i] = i + 5;
			System.out.println("numbers[" + i + "]=" + numbers[i]);
		}

	}
}