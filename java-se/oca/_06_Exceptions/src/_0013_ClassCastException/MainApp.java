package _0013_ClassCastException;

public class MainApp {
	
	public static void main(String[] args) {
		String type = "moose";
		Integer number = (Integer) type; // DOES NOT COMPILE
	}
}
