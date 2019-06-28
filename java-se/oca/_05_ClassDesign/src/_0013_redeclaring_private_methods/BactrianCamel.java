package _0013_redeclaring_private_methods;

public class BactrianCamel extends Camel {

	private String getNumberOfHumps() {
		return "Child";
	}

	public static void main(String[] args) {
		BactrianCamel bactrianCamel = new BactrianCamel();
		System.out.println(bactrianCamel.getNumberOfHumps()); // Child
	}
}