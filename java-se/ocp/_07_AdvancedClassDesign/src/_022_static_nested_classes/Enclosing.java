package _022_static_nested_classes;

public class Enclosing {
	
	static class Nested {
		private int price = 5;
	}

	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
		
		Enclosing.Nested nested2 = new Nested();
		System.out.println(nested2.price);
		
		System.out.println(new Nested().price);
	}
}