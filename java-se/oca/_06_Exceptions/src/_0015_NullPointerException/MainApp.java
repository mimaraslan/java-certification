package _0015_NullPointerException;

public class MainApp {

	private String name; // default value is null

	public void printLength() throws NullPointerException {
		System.out.println(name.length());
	}

	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.printLength(); // Exception in thread "main" java.lang.NullPointerException
	}
}