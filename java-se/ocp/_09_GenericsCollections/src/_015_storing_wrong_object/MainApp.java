package _015_storing_wrong_object;

public class MainApp {
	public static void main(String[] args) {

		Object[] obj = new String[0];
		System.out.println("obj: " + obj);

		Integer[] numbers = { new Integer(42) };
		System.out.println("numbers: " + numbers);

		Object[] objects = numbers;
		System.out.println("objects: " + objects);

		objects[0] = "forty two"; // throws ArrayStoreException
		System.out.println("objects[0]: " + objects[0]);
	}
}