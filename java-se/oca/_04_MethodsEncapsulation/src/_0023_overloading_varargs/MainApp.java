package _0023_overloading_varargs;

public class MainApp {

	public void fly(int[] lengths) {
		for (int i = 0; i < lengths.length; i++) {
			System.out.println("lengths[" + i + "]=" + lengths[i]);
		}
	}
//	public void fly(int... lengths) { } // DOES NOT COMPILE

	private void fly(int i, int j, int k) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.fly(new int[] { 1, 2, 3 });
		obj.fly(1, 2, 3);
	}

}