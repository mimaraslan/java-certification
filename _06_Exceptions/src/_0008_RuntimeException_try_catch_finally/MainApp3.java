package _0008_RuntimeException_try_catch_finally;

public class MainApp3 {

	public static void main(String[] args) {
		String s = "";
		try {
			s += "a";
		} catch (Exception e) {
			s += "b";
		} finally {
			s += "c";
			System.exit(0); // finally block always runs after the catch block
		}
		s += "d";
		System.out.print(s);
	}
}