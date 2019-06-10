package _0028_creating_constructors;

public class Bunny3 {

	private String color; // null
	private int height; // 0
	private int length; // 0
	
	public Bunny3(int length, int theHeight, String color) {
		 length = this.length; // no good!	
		//this.length =  length;  // good	
		height = theHeight; // fine because a different name
		this.color = "white"; // fine, but redundant
	}

	public static void main(String[] args) {
		Bunny3 obj = new Bunny3(10, 20, "black");
							// 10				20 				white
		System.out.println(obj.length + " " + obj.height + " " + obj.color); 
	}
}