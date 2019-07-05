package _015_enums_constructors_fields_methods;

public enum OnlyOne {
	
	ONCE(true);
	
	private OnlyOne(boolean b) {
		System.out.println("constructing");
	}

	public static void main(String[] args) {
		OnlyOne firstCall = OnlyOne.ONCE; // prints constructing
		System.out.println(firstCall);

		OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything		
		System.out.println(secondCall);
	}
}