package _0008_array_sorting;

class MainApp {

	public static void main(String[] args) {
		
		String[] myArray1 = { "A", "B", "C" }; 
		String [] myArray2 = myArray1; 
		String myArray3[] = myArray1;
		String myArray4 [] = myArray1;
		
		System.out.println(myArray1.toString()); // [Ljava.lang.String;@4d591d15
		System.out.println(myArray2.toString()); // [Ljava.lang.String;@4d591d15
		System.out.println(myArray3.toString()); // [Ljava.lang.String;@4d591d15
		System.out.println(myArray4.toString()); // [Ljava.lang.String;@4d591d15

		System.out.println(myArray1.equals(myArray1)); // true 
		System.out.println(myArray1.equals(myArray2)); // true 
		System.out.println(myArray1.equals(myArray3)); // true 
		System.out.println(myArray1.equals(myArray4)); // true 
		
		System.out.println("---------------"); 
		
		String[] myArray5 = new String[] { "A", "B", "C" }; 
		String [] myArray6 = new String[] { "A", "B", "C" };  
		String myArray7[] = { "A", "B", "C" }; 
		String myArray8 [] = { "A", "B", "C" }; 
		
		System.out.println(myArray5.toString()); // [Ljava.lang.String;@4d591d15
		System.out.println(myArray6.toString()); // [Ljava.lang.String;@4d591d15
		System.out.println(myArray7.toString()); // [Ljava.lang.String;@4d591d15
		System.out.println(myArray8.toString()); // [Ljava.lang.String;@4d591d15

		System.out.println(myArray1.equals(myArray5)); // false 
		System.out.println(myArray1.equals(myArray6)); // false 
		System.out.println(myArray1.equals(myArray7)); // false 
		System.out.println(myArray1.equals(myArray8)); // false 
		System.out.println(myArray5.equals(myArray6)); // false 
		System.out.println(myArray7.equals(myArray8)); // false 
	}
}