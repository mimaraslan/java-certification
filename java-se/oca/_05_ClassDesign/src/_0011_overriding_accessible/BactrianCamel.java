package _0011_overriding_accessible;

class Camel {
	protected String getNumberOfHumps() {
		return "Undefined";
	}
}

public class BactrianCamel extends Camel {

//	private int getNumberOfHumps() { // DOES NOT COMPILE
//	 return 2;
//}

	public String getNumberOfHumps() {
		return "2";
	}
}