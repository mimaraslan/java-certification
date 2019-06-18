package _0039_static_interface_methods;

public class Bunny implements Hop {
	
	static int getJumpHeight() {
		return 1;
	}
	
	public void printDetails() {
	   System.out.println(getJumpHeight()); // 1 
	   
	 //2. To reference the static method, a reference to the name of the interface must be used.	
	   System.out.println(Hop.getJumpHeight()); // 2
	}
	
	public static void main(String[] args) {
		Bunny bunny = new Bunny();
		bunny.printDetails(); 
	}
}