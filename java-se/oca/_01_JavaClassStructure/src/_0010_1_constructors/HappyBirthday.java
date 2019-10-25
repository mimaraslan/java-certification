package _0010_1_constructors;

public class HappyBirthday {
	
	// overloaded wish method with String as an argument
	public static void wish(String name) {
		System.out.println("Happy birthday " + name + "!");
	}

	// overloaded wish method with no arguments;
	// this method in turn invokes wish(String) method
	public static void wish() {
		wish("to you");
	}

	public static void main(String[] args) {
		wish();
		wish("dear Katerina");
	}
}