package _010_generic_interface_raw_type;

public class ShippableCrate implements Shippable {

	@Override
	public void ship(Object t) {
		System.out.println("generic_interface: " + t);
	}
}