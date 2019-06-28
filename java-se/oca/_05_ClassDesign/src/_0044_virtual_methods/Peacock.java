package _0044_virtual_methods;

public class Peacock extends Bird {

	public String getName() {
		return "Peacock";
	}

	public static void main(String[] args) {
		Bird bird = new Peacock();
		bird.displayInformation(); // The bird name is: Peacock
	}
}