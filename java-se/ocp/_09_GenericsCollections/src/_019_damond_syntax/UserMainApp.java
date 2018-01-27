package _019_damond_syntax;

public class UserMainApp {
	public static void main(String[] args) {
		// User<Integer, String> person = new User<Integer, String>(30, "Katerina");

		// diamond syntax
		User<Integer, String> person = new User<>(30, "Katerina");

		// warning: unchecked conversion
		// User<Integer, String> person = new User(30, "Katerina");

		System.out.println("Person Info: " + person.getPersonAge() + " - " + person.getPersonName());
	}
}