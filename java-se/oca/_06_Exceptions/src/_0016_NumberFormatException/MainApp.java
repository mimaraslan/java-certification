package _0016_NumberFormatException;

public class MainApp {

	public static void main(String[] args) {
		// Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
		Integer.parseInt("abc");
	}
}