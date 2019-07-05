package _014_enums_constructors_fields_methods;

//  Enums can have instance variables, constructors,and methods. 
public enum Season {
	WINTER("winter"), SPRING("spring"), SUMMER("summer"), FALL("fall");

	private String expectedVisitors;

	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
		System.out.println("Constructor: " + this.expectedVisitors);
	}

	public void printExpectedVisitors() {
		System.out.println("Method: " + this.expectedVisitors);
	}
}