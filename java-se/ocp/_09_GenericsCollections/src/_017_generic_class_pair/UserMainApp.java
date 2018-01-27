package _017_generic_class_pair;

public class UserMainApp {
	public static void main(String[] args) {
		User<Integer, String> person = new User<Integer, String>(30, "Katerina");
		System.out.println("Person Info: " + person.getPersonAge() + " - " + person.getPersonName());
	}
}