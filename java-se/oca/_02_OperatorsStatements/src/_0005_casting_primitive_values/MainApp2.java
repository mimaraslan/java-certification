package _0005_casting_primitive_values;

public class MainApp2 {
	
	public static void main(String[] args) {

		float value1 = 102;
		float value2 = (int) 102.0;
		// float value3 = 1f * 0.0; // DOES NOT COMPILE
		float value4 = 1f * (short) 0.0;
		// float value5 = 1f * (boolean)0; // DOES NOT COMPILE

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value4);

	}
}