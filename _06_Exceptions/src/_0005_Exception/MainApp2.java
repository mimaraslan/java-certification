package _0005_Exception;

public class MainApp2 {
	public static void main(String[] args) {
		try {
		 // throw new Exception();
			throw new Exception("Ow! I fell.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}