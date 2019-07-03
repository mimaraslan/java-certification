package _0021_PrintingException;

public class Hopper {

	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

	public static void main(String[] args) {

		try {
			hop();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*
		 java.lang.RuntimeException: cannot hop
		 cannot hop
		 java.lang.RuntimeException: cannot hop
			at _0021_PrintingException.Hopper.hop(Hopper.java:6)
			at _0021_PrintingException.Hopper.main(Hopper.java:12)
		 */
	}
}