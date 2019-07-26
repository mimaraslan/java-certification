package _009_generic_interface;

public class MainApp {

	public static void main(String[] args) {
		
		ShippableAbstractCrate obj = new ShippableAbstractCrate();
		obj.ship(new Robot("Lolo", 1234));
	}
}