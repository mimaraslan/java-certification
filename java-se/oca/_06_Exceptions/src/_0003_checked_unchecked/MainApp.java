package _0003_checked_unchecked;

public class MainApp {

	void fall() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		MainApp mainApp = new MainApp();
		
		try {
			mainApp.fall();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}