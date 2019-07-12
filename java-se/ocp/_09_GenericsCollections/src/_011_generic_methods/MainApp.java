package _011_generic_methods;

public class MainApp {

	public static <T> Crate<T> ship(T t) {
		System.out.println("Preparing " + t);
		return new Crate<T>();
	}
	
	public static <T> void sink(T t) { }
	public static <T> T identity(T t) { return t; }
   // public static T noGood(T t) { return t; } // DOES NOT COMPILE
	
	public static void main(String[] args) {
		
		MainApp.ship(1);
		MainApp.ship("Lolo");	
		MainApp.<String>ship("Lolo");
		MainApp.<String[]>ship(args);
		
		System.out.println("---------------------------");
		
		MainApp.sink(2);
		MainApp.sink("Lolo");
		MainApp.<String>sink("Lolo");
		MainApp.<String[]>sink(args);
		
		System.out.println("---------------------------");

		MainApp.identity(3);
		MainApp.identity("Lolo");
		MainApp.<String>identity("Lolo");
		MainApp.<String[]>identity(args);
	}
}