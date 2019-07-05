package _0019_static_imports;

import java.util.List;
// import static java.util.Arrays.*; 
import static java.util.Arrays.asList; // static import								

import java.util.Arrays;

public class StaticImports {
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Katerina", "Lena"); 				
		List<String> list2 = 	    asList("Katerina", "Lena"); // static import	 for java.util.Arrays.asList			
		
		System.out.println(list1);
		System.out.println(list2);
	}
}