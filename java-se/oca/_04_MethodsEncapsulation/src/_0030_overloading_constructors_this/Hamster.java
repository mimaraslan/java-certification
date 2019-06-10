package _0030_overloading_constructors_this;

public class Hamster {
	private String color;
	private int weight;

//	public Hamster(int weight) { // first constructor
//		this.weight = weight;
//		color = "brown";
//	}
	
	public Hamster(int weight) {

	  //	 Hamster(weight, "brown"); // DOES NOT COMPILE
	  // new Hamster(weight, "brown"); // Compiles but does not do what we want
		        this(weight, "brown"); // OK 
		        
	}

	
//	public Hamster(int weight) {
//		System.out.println("in constructor");
//	 	// ready to call this
//	 	this(weight, "brown"); // DOES NOT COMPILE // must be the first call in the method
//	 }
	
	

	public Hamster(int weight, String color) { // second constructor
		this.weight = weight;
		this.color = color;
	}
}