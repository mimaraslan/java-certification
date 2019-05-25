package _0019_break_statement;

public class SearchSample {
	
	public static void main(String[] args) {
	
		int[][] list = { { 1, 2, 3, 7 }, { 5, 6, 8, 7 }, { 9, 7, 11, 7 } };
		int searchValue = 7;
		int positionX = -1;
		int positionY = -1;
		
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}
	}
}


