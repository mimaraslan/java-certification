package _0003_checked_exception;

public class MainApp {

	void fall() throws Exception {
		throw new Exception();
	}

 // public static void main(String[] args) throws Exception {
	public static void main(String[] args) {

		MainApp obj = new MainApp();

		try {
			obj.fall();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}