package _0011_array_multidimensional;

public class MainApp {

	public static void main(String[] args) {
	 
		int[][] vars1;  // a 2D array
		int vars2 [][]; // a 2D array
		int[] vars3[];  // a 2D array
		int[] vars4 [], vars5 [][]; // a 2D and a 3D array
		int vars6 [] [] [], vars7 [][][]; // 3D arrays

		String [][] rectangle = new String[3][2];
		rectangle[0][1] = "set";
		
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		
		
		int [][] args2 = new int[4][]; 
		args2[0] = new int[5];
		args2[1] = new int[3];
		
		
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			
			for (int j = 0; j < twoD[i].length; j++) 
				System.out.print(twoD[i][j] + " "); // print element
			
			System.out.println(); // time for a new row 
		}

		System.out.println("---------------"); 

		
		for (int[] inner : twoD) { 
			
			for (int num : inner)
				System.out.print(num + " "); 
			
			System.out.println();
		}
	
		
	}
}