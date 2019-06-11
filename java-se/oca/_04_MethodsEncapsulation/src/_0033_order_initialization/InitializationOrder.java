package _0033_order_initialization;

public class InitializationOrder {
	
	private String name = "Lolo";
	{
		System.out.println("field block: " +name);
	}
	
	private static int COUNT = 5;
	
	static {
		System.out.println("static block1: " +COUNT);
	}
	
	static {
		COUNT += 10;
		System.out.println("static block2: "+COUNT);
	}
	
	{
		COUNT++;
		System.out.println("normal block: "+COUNT);
	}

	public InitializationOrder() {
		System.out.println("constructor block");
	}

	public static void main(String[] args) {
		System.out.println("main method block");
		new InitializationOrder();
	}
	
 }