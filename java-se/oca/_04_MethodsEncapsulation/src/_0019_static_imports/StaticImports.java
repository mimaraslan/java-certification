package _0019_static_imports;

import java.util.List;
// import static java.util.Arrays.*; // static import
import static java.util.Arrays.asList; // static import								

public class StaticImports {
	public static void main(String[] args) {
		
		List<String> list = 	   asList("Adana", "Center"); // no Arrays				
		
		System.out.println(list);
	}
}