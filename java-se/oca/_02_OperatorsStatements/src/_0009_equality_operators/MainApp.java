package _0009_equality_operators;

import java.io.File;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		boolean x = true == 3; // DOES NOT COMPILE
		boolean y = false != "Giraffe"; // DOES NOT COMPILE 
		boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE
		 */
		
		boolean a = false;
		boolean b = (a = true); 
		System.out.println(b); // true
		System.out.println("-------------"); 

		File x = new File("myFile.txt");
		File y = new File("myFile.txt");
		File z = x;
		System.out.println(x == y); // false 
		System.out.println(x == z); // true
		
	}
}
