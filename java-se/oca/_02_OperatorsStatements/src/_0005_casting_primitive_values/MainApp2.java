package _0005_casting_primitive_values;

public class MainApp2 {

	public static void main(String[] args) {

		float value1 = 102;
		System.out.println(value1); // 102.0

		float value2 = (int) 102.0;
		System.out.println(value2); // 102.0

		// float value3 = 1f * 0.0; // DOES NOT COMPILE
		float value4 = (float) (2f * 1.3);
		System.out.println(value4); // 2.6

		float value5 = 2f * (short) 1.3;
		System.out.println(value5); // 2.0

		double value6 = 2f * (float) 1.3;
		System.out.println(value6); // 2.5999999046325684

		// float value7 = 2f * (double) 1.3; // DOES NOT COMPILE

		int value8 = (int) (2f * (long) 1.3);
		System.out.println(value8); // 2

		// float value9 = 1f * (boolean) 0; // DOES NOT COMPILE
	}
}