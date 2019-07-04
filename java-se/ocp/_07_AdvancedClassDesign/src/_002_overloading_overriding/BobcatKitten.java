package _002_overloading_overriding;

public class BobcatKitten extends Bobcat {
	
	// Override
	public void findDen() {} 
	
	// Overload
	public void findDen(boolean b) {}
	
	// Overload
	public int findden() throws Exception { return 0; }
}