package _0013_order_initialization;

public class Egg {
	public Egg() {
		number = 5;
		System.out.println("in constructor: "+number);
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println("in main: "+egg.number);
	}

	private int number = 3;
	{
		System.out.println("in block: "+number);
		number = 4;
		System.out.println("in block: "+number);
	}
}