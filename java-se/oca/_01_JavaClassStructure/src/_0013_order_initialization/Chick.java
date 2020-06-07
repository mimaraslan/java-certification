package _0013_order_initialization;

public class Chick {
		
	private String name = "Lena";	
	{
		System.err.println("1setting field: "+name); 
	}

	{
		System.err.println("2setting field: "+name); 
	}
	
	public Chick() {
		name = "Katerina";
		System.out.println("setting constructor: "+name); //
	}

	public static void main(String[] args) {
		Chick chick = new Chick();
	 	System.out.println("main: "+chick.name);
	}
}