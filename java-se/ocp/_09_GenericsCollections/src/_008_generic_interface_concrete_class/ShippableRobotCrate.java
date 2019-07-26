package _008_generic_interface_concrete_class;

public class ShippableRobotCrate implements Shippable<Robot> {

	@Override
	public void ship(Robot t) {
		System.out.println("generic_interface: "+ t);
	}
}