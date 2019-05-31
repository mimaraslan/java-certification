package _0022_overloading_methods;

public class MainApp {

	public void fly(int numMiles) { }
//	public int fly(int numMiles) { } // DOES NOT COMPILE
	public void fly(short numFeet) { }
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) { }
	public void fly(short numFeet, int numMiles) throws Exception { }
	
	
	public void fly(double numMiles) { }
//	public static void fly(double numMiles) { } // DOES NOT COMPILE
	
	
	public static void fly3(int numMiles) {
		System.out.println("int");
	}

	public static void fly3(short numFeet) {
		System.out.println("short");
	}
	
	public static void main(String[] args) {
		 fly3(1);
		 fly3((short) 1);
	}
	
}