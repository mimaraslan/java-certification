package _0008_RuntimeException_try_catch_finally;

public class MainApp3 {

	public static void main(String[] args) {
		String s = "Anna, ";
		System.out.println(s);

		try {
			s += "Katerina, ";
			System.out.println(s);
		} catch (Exception e) {
			s += "Sveta, ";
			System.out.println(s);
		} finally {
			s += "Yulya, ";
			System.out.println(s);
			System.exit(0); // finally block always runs after the catch block
		}

		s += "Lena";
		System.out.println(s);
	}
}