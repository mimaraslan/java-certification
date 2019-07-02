package _0012_ArrayIndexOutOfBoundsException;

public class MainApp2 {
	public static void main(String[] args) {

		int[] countsOfMoose = new int[3];

		int total = 0;
		for (int i = 0; i <= countsOfMoose.length; i++) {
			total += countsOfMoose[i];
		}
		System.out.println(total);

	}
}
