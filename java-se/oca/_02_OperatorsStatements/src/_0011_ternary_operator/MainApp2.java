package _0011_ternary_operator;

public class MainApp2 {

	public static void main(String[] args) {

		int y = 1;
		int z = 1;
		final int x = y<10 ? y++ : z++; 
		System.out.println(y+","+z); // Outputs 2,1

	}
}
