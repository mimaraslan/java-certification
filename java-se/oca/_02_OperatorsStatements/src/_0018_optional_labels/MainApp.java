package _0018_optional_labels;

public class MainApp {

	public static void main(String[] args) {

		int[][] myComplexArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		
		OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}
	}

}