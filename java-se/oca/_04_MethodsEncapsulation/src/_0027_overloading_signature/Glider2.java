package _0027_overloading_signature;

public class Glider2 {
	
//	public static void play(int... l) { 
//		System.out.println(" int");
//	} 
	
	public static void play(Long... l) { 
		System.out.println(" Long");
	}  
	
	public static void main(String[] args) {    
		play(4);   // DOES NOT COMPILE   
		play(4L);  // calls the Long version 
	}
}