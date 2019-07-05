package _013_enums_switch;

public class MainApp {
	public static void main(String[] args) {
		Season summer = Season.SUMMER;
		switch (summer) {
		case SPRING:
			System.out.println("You chose SPRING!");
			break;
		case SUMMER:
			System.out.println("You chose SUMMER!");
			break;
		case FALL:
			System.out.println("You chose FALL!");
			break;
		case WINTER:
			System.out.println("You chose WINTER!");
			break;
		default:
			System.out.println("Choose a season");
		}

		System.out.println("-----------------------");
		
		switch (summer) {
		case 0: // DOES NOT COMPILE
			System.out.println("Get out the sled!");
			break;
		}

	}
}