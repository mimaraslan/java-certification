package _0033_order_initialization;

public class InitializationOrderSimple {
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

	public InitializationOrderSimple() {
		System.out.println("constructor block");
	}
	
	public static void main(String[] args) {
		System.out.println("main method block");
		InitializationOrderSimple init = new InitializationOrderSimple();
	}
	
}