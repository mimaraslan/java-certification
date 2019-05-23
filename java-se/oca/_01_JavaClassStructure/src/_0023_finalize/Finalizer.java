package _0023_finalize;

public class Finalizer {
	
	protected void finalize() {
		System.out.println("Calling finalize"); 
	}
	
	public static void main(String[] args) { 
		Finalizer finalizer = new Finalizer();

		System.out.println("finalizer: "+finalizer);
		
	}
}