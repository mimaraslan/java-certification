package _008_generic_interface_concrete_class;

public class MainApp {

	public static void main(String[] args) {
		
		ShippableRobotCrate obj = new ShippableRobotCrate();
		obj.ship(new Robot("Lolo", 1234));
	}
}