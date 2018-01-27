package _018_generic_class_pair_of_t;

public class UserMainApp {
	public static void main(String[] args) {
		User<String> person = new User<String>("30", "Katerina");
		System.out.println("Person Info: " + person.getPersonAge() + " - " + person.getPersonName());
	}
}