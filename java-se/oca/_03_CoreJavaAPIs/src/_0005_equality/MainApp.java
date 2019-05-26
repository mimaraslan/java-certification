package _0005_equality;

class MainApp {

	public static void main(String[] args) {

		//use == to compare numbers and that object references refer to the same object.
		System.out.println("Equality == references are referring to the same object");
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false 
		System.out.println(one == three); // true
		
		System.out.println("-------------------");
		
		String x = "Hello World";
		String y = "Hello World"; 
		System.out.println(x == y); // true
		
		
		System.out.println("-------------------");
		String x2 = "Hello World";
		String z2 = " Hello World".trim(); 
		System.out.println(x2 == z2); // false

	}
}