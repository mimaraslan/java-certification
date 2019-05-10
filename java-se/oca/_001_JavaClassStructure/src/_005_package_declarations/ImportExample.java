package _005_package_declarations;

import java.util.Random; // import tells us where to find Random

public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10)); // print a number between 0 and 9
	}
}