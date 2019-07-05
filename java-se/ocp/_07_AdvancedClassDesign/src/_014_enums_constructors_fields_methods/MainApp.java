package _014_enums_constructors_fields_methods;

public class MainApp {
	public static void main(String[] args) {
		Season summer = Season.SUMMER;
		switch (summer) {
		case SPRING:
			Season.SPRING.printExpectedVisitors(); 
			System.out.println("You chose "+ Season.SPRING);
			break;
		case SUMMER:
			summer.printExpectedVisitors();
			System.out.println("You chose "+ Season.SUMMER);
			break;
		case FALL:
			Season.FALL.printExpectedVisitors();
			System.out.println("You chose "+ Season.FALL);
			break;
		case WINTER:
			Season.WINTER.printExpectedVisitors();
			System.out.println("You chose "+ Season.WINTER);
			break;
		default:
			System.out.println("Choose a season");
		}
	}
}