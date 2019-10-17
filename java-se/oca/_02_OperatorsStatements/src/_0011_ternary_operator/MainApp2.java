package _0011_ternary_operator;

public class MainApp2 {

	public static void main(String[] args) {

		int y = 1;
		int z = 1;
		final int x = y < 0 ? y++ : z++;
		System.out.println(y + " , " + z); // 1 , 2

	}
}