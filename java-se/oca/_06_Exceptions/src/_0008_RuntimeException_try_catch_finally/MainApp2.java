package _0008_RuntimeException_try_catch_finally;

public class MainApp2 {

	 try { 
		 fall();
	 } finally {
		 System.out.println("all better");
	 } catch (Exception e) { // DOES NOT COMPILE
		 System.out.println("get up");
	 }
	
	 
	 try { // DOES NOT COMPILE
		 fall();
	 }
	
	 
	 try {
		 fall();
	 } finally {
		 System.out.println("all better");
	 }			
	 
	void fall() {
		throw new RuntimeException();
	}

}