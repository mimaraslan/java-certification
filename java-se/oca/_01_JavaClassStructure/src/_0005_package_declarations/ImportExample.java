package _0005_package_declarations;

//import tells us where to find Random
import java.util.Random; 

public class ImportExample {
	
	public static void main(String[] args) {
	
		Random randomObj = new Random();

		// print a number between 0 and 9
		System.out.println(randomObj.nextInt(10)); 
	}
}