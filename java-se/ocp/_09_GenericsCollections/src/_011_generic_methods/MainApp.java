package _011_generic_methods;

public class MainApp {

	public static <T> Crate<T> ship(T t) {
		System.out.println("ship " + t);
		return new Crate<T>();
	}

	public static <T> void sink(T t) {
		System.out.println("sink " + t);

	}

	public static <T> T identity(T t) {
		System.out.println("identity " + t);
		return t;
	}
	// public static T noGood(T t) { return t; } // DOES NOT COMPILE

	public static void main(String[] args) {

		MainApp.ship(1);
		MainApp.ship("NewYork");
		MainApp.<String>ship("NewYork");
		MainApp.<String[]>ship(args);

		System.out.println("---------------------------");

		MainApp.sink(2);
		MainApp.sink("London");
		MainApp.<String>sink("London");
		MainApp.<String[]>sink(args);

		System.out.println("---------------------------");

		MainApp.identity(3);
		MainApp.identity("Istanbul");
		MainApp.<String>identity("Istanbul");
		MainApp.<String[]>identity(args);
	}
}