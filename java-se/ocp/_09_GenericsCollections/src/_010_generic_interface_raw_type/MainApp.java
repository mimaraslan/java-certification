package _010_generic_interface_raw_type;

public class MainApp {

	public static void main(String[] args) {
		
		ShippableCrate obj = new ShippableCrate();
		obj.ship(new Robot("Lolo", 1234));
	}
}