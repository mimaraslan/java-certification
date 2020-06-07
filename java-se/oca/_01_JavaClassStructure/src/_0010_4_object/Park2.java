package _0010_4_object;

public class Park2 {
	
	// private Park2() {  // OK
	// protected Park2() { // OK
	//  		Park2() { // OK
	public Park2() {
	      System.out.println("() in constructor");
	   }
	
	public void Park() {
	      System.out.println("NOT A constructor -  NORMAL method");
	} 
	

	public static void main(String[] args) {

		Park2 myObj = new Park2(); // call constructor
		
		myObj.Park();  // call NORMAL method
			
	}
}
