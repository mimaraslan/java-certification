package _0029_default_constructor;

public class Rabbit {
	
//	private   Rabbit() {    System.out.println("constructor private");   } // OK
//	protected Rabbit() {    System.out.println("constructor protected"); } // OK
//	 		  Rabbit() {    System.out.println("constructor default");   } // OK
//	public    Rabbit() {    System.out.println("constructor public");    } // OK

	 
	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit(); // Calls default constructor
	}
}