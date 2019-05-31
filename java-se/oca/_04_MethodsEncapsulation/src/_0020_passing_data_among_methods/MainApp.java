package _0020_passing_data_among_methods;

public class MainApp {
	public static void main(String[] args) {

		String name = "Mimar";
		speak(name);
		System.out.println(name);
	}

	public static void speak(String name) {
		name = "Murat";
	}
}