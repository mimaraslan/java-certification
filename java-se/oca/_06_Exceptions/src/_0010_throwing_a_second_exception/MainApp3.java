package _0010_throwing_a_second_exception;

public class MainApp3 {

	public static void main(String[] args) throws Exception {

		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} finally {
			throw new Exception();
		}

	}
}